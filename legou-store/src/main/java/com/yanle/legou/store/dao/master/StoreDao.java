package com.yanle.legou.store.dao.master;

import com.yanle.legou.store.domain.Store;
import org.springframework.stereotype.Repository;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 17:48
 */
@Repository
public interface StoreDao {
    Store getStoreInfoById(Long storeId);
}
