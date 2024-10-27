package com.idcmis.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idcmis.entity.CustomerDetForm;
import com.idcmis.entity.CustomerListForm;
import com.idcmis.mapper.CustomerMapper;
import com.idcmis.service.CustomerService;
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
    public List<CustomerDetForm> customerDet(Long prodId) {
        List<CustomerDetForm> customerDet=customerMapper.customerDet(prodId);
        return customerDet;
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
