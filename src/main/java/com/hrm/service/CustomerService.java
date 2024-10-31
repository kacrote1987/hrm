package com.hrm.service;

import com.github.pagehelper.PageInfo;
import com.hrm.entity.CustomerDetForm;
import com.hrm.entity.CustomerListForm;

import java.util.List;

public interface CustomerService {
    PageInfo<CustomerListForm> customerList(CustomerListForm params);
    List<CustomerDetForm> customerDet(Long customerId);
    void customerSave(CustomerDetForm params);
    void customerDel(Long customerId);
}
