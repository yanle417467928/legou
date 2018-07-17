package com.yanle.legou.customer.service;

import com.yanle.legou.customer.domain.Customer;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:14
 */
public interface CustomerService {
    Customer getCustomerInfoByCustomerId(Long customerId);
}
