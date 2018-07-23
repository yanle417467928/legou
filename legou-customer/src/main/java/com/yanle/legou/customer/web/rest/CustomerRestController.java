package com.yanle.legou.customer.web.rest;

import com.yanle.legou.customer.client.StoreFeignClient;
import com.yanle.legou.customer.domain.Customer;
import com.yanle.legou.customer.domain.CustomerVo;
import com.yanle.legou.customer.domain.Store;
import com.yanle.legou.customer.domain.rpc.ResultDTO;
import com.yanle.legou.customer.domain.rpc.RpcCommonCode;
import com.yanle.legou.customer.service.CustomerService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:10
 */
@RestController
@RequestMapping(value = "/customer/rest")
public class CustomerRestController {

    @Resource
    private CustomerService customerService;

    @Resource
    private StoreFeignClient storeFeignClient;

    @RequestMapping(value = "/getCustomerInfoByCustomerId", method = RequestMethod.GET)
    public ResultDTO<CustomerVo> getCustomerInfoByCustomerId(Long customerId) {
        try {
            if (null != customerId) {
                Customer customer = customerService.getCustomerInfoByCustomerId(customerId);
                if (null != customer) {
                    ResultDTO<Store> resultDTO = storeFeignClient.getStoreInfoByStoreId(customer.getStoreId());
                    if (resultDTO.getCode() == RpcCommonCode.SUCCESS) {
                        Store store = resultDTO.getResult();
                        CustomerVo customerVo = new CustomerVo();
                        customerVo.setId(customer.getId());
                        customerVo.setName(customer.getName());
                        customerVo.setAge(customer.getAge());
                        customerVo.setStoreId(store.getId());
                        customerVo.setStoreName(store.getStoreName());
                        customerVo.setStoreAddress(store.getAddress());
                        return new ResultDTO<CustomerVo>(RpcCommonCode.SUCCESS, null, customerVo);
                    } else {
                        return new ResultDTO<CustomerVo>(RpcCommonCode.FAILURE, resultDTO.getMessage(), null);
                    }
                } else {
                    return new ResultDTO<CustomerVo>(RpcCommonCode.FAILURE, "没有找到该顾客信息", null);
                }
            } else {
                return new ResultDTO<CustomerVo>(RpcCommonCode.FAILURE, "顾客id: customerId 不允许为空!", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDTO<CustomerVo>(RpcCommonCode.FAILURE, "系统异常，" + e, null);

        }

    }
}
