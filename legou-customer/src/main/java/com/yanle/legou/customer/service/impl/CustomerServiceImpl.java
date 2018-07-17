package com.yanle.legou.customer.service.impl;

import com.yanle.legou.customer.dao.master.CustomerDao;
import com.yanle.legou.customer.domain.Customer;
import com.yanle.legou.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:14
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    public Customer getCustomerInfoByCustomerId(Long customerId) {
        return customerDao.getCustomerInfoByCustomerId(customerId);
    }
}
