package com.hrm.controller;

import com.github.pagehelper.PageInfo;
import com.hrm.config.Result;
import com.hrm.entity.CustomerDetForm;
import com.hrm.entity.CustomerListForm;
import com.hrm.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "客户管理")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    CustomerService customerService;

    @ApiOperation("客户列表")
    @PostMapping("/customerList")
    public Result customerList(CustomerListForm params){
        PageInfo<CustomerListForm> customerList= customerService.customerList(params);
        return Result.success(customerList);
    }

    @ApiOperation("客户详细")
    @PostMapping("/customerDet")
    public Result customerDet(@RequestBody Long customerId){
        List<CustomerDetForm> customerDet= customerService.customerDet(customerId);
        return Result.success(customerDet);
    }

    @ApiOperation("客户保存")
    @PostMapping("/customerSave")
    public Result customerSave(@RequestBody CustomerDetForm params){
        customerService.customerSave(params);
        return Result.success();
    }

    @ApiOperation("客户删除")
    @PostMapping("/customerDel")
    public Result customerDel(@RequestParam Long customerId){
        customerService.customerDel(customerId);
        return Result.success();
    }
}
