package com.hrm.controller;

import com.github.pagehelper.PageInfo;
import com.hrm.config.Result;
import com.hrm.entity.*;
import com.hrm.service.ServerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "服务器管理")
@RestController
@RequestMapping("/server")
public class ServerController {
    @Resource
    ServerService serverService;

    @ApiOperation("服务器列表")
    @PostMapping("/serverList")
    public Result serverList(ServerListForm params){
        PageInfo<ServerListForm> serverList= serverService.serverList(params);
        return Result.success(serverList);
    }

    @ApiOperation("服务器详细")
    @PostMapping("/serverDet")
    public Result serverDet(@RequestBody Long serverId){
        List<ServerDetForm> serverDet= serverService.serverDet(serverId);
        return Result.success(serverDet);
    }

    @ApiOperation("服务器保存")
    @PostMapping("/serverSave")
    public Result serverSave(@RequestBody ServerDetForm params){
        serverService.serverSave(params);
        return Result.success();
    }

    @ApiOperation("服务器删除")
    @PostMapping("/serverDel")
    public Result serverDel(@RequestParam Long customerId){
        serverService.serverDel(customerId);
        return Result.success();
    }
}
