package com.yanle.legou.customer.dao.master;

import com.yanle.legou.customer.domain.Customer;
import org.springframework.stereotype.Repository;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 15:28
 */
@Repository
public interface CustomerDao {
    Customer getCustomerInfoByCustomerId(Long customerId);
}
