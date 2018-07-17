package com.yanle.legou.store.service.impl;

import com.yanle.legou.store.dao.master.StoreDao;
import com.yanle.legou.store.domain.Store;
import com.yanle.legou.store.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:05
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Resource
    private StoreDao storeDao;

    public Store getStoreInfoByStoreId(Long storeId) {
        return storeDao.getStoreInfoById(storeId);
    }
}
