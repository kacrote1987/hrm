package com.idcmis.service;

import com.github.pagehelper.PageInfo;
import com.idcmis.entity.CustomerDetForm;
import com.idcmis.entity.CustomerListForm;

import java.util.List;

public interface CustomerService {
    PageInfo<CustomerListForm> customerList(CustomerListForm params);
    List<CustomerDetForm> customerDet(Long prodId);
}
