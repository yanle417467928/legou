package com.yanle.legou.customer.client;

import com.yanle.legou.customer.domain.Store;
import com.yanle.legou.customer.domain.rpc.ResultDTO;
import com.yanle.legou.customer.domain.rpc.RpcCommonCode;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:41
 */
@Component
public class StoreFeignClientFallbackFactory implements FallbackFactory<StoreFeignClient> {


    public StoreFeignClient create(final Throwable throwable) {
        return new StoreFeignClient() {
            public ResultDTO<Store> getStoreInfoByStoreId(Long storeId) {
                return new ResultDTO<Store>(RpcCommonCode.FAILURE, "fallback,reason was:" + throwable.getMessage(), null);
            }
        };
    }
}
