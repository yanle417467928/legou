package com.yanle.legou.store.web.rest;

import com.yanle.legou.store.domain.Store;
import com.yanle.legou.store.domain.rpc.ResultDTO;
import com.yanle.legou.store.domain.rpc.RpcCommonCode;
import com.yanle.legou.store.service.StoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:02
 */
@RestController
@RequestMapping(value = "/store/rest")
public class StoreRestController {

    @Resource
    private StoreService storeService;

    @RequestMapping(value = "/getStoreInfoByStoreId",method = RequestMethod.GET)
    public ResultDTO<Store> getStoreInfoByStoreId(Long storeId) {
        if (null != storeId) {
            Store store = storeService.getStoreInfoByStoreId(storeId);
            return new ResultDTO<Store>(RpcCommonCode.SUCCESS, null, store);
        }
        return new ResultDTO<Store>(RpcCommonCode.SUCCESS, "门店id: storeId 不能为空!", null);
    }
}
