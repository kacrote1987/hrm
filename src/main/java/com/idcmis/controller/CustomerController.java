package com.idcmis.controller;

import com.github.pagehelper.PageInfo;
import com.idcmis.config.Result;
import com.idcmis.entity.ServerDetForm;
import com.idcmis.entity.ServerListForm;
import com.idcmis.service.ServerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "客户管理")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    ServerService serverService;

    @ApiOperation("客户列表")
    @PostMapping("/customerList")
    public Result customerList(ServerListForm params){
        PageInfo<ServerListForm> customerList= serverService.serverList(params);
        return Result.success(customerList);
    }

    @ApiOperation("客户详细")
    @PostMapping("/customerDet")
    public Result customerDet(@RequestBody Long prodId){
        List<ServerDetForm> customerDet= serverService.serverDet(prodId);
        return Result.success(customerDet);
    }
}
