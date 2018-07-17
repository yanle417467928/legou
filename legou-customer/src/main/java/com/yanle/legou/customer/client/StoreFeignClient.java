package com.yanle.legou.customer.client;

import com.yanle.legou.customer.domain.Store;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:41
 */
@FeignClient(name = "legou-store")
public interface StoreFeignClient {

    @RequestMapping(value = "/store/rest/getStoreInfoByStoreId",method = RequestMethod.GET)
    Store getStoreInfoByStoreId(@RequestParam(value = "storeId") Long storeId);


}
