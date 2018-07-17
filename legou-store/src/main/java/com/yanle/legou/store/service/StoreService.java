package com.yanle.legou.store.service;

import com.yanle.legou.store.domain.Store;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:04
 */
public interface StoreService {
    Store getStoreInfoByStoreId(Long storeId);
}
