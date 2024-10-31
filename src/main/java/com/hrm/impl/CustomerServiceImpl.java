package com.hrm.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrm.entity.CustomerDetForm;
import com.hrm.entity.CustomerListForm;
import com.hrm.mapper.CustomerMapper;
import com.hrm.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    CustomerMapper customerMapper;

    @Override
    public PageInfo<CustomerListForm> customerList(CustomerListForm params) {
        Integer page = 0;
        if(params.getPage() != null){
            page = params.getPage();
        }
        PageHelper.startPage(page, 10);
        List<CustomerListForm> customerList = customerMapper.customerList(params);
        return PageInfo.of(customerList);
    }

    @Override
    public List<CustomerDetForm> customerDet(Long customerId) {
        List<CustomerDetForm> customerDet=customerMapper.customerDet(customerId);
        return customerDet;
    }

    @Override
    public void customerSave(CustomerDetForm params) {
        if(params.getCustomerId()!=null){
            customerMapper.updateCustomer(params);
        }else{
            customerMapper.insertCustomer(params);
        }
    }

    @Override
    public void customerDel(Long customerId) {
        customerMapper.deleteCustomer(customerId);
    }

    public static String method (String str){
        String pos="";
        if(str!=null && str!=""){
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i); //把字符串转为字符
                if(c >= 'A' && c <= 'Z'){
                    pos=pos+'_'+(char)(c+32);
                }
                else{
                    pos=pos+c;
                }
            }
        }else{
            pos="";
        }
        return pos;
    }
}
