package com.idcmis.controller;

import com.github.pagehelper.PageInfo;
import com.idcmis.config.Result;
import com.idcmis.entity.*;
import com.idcmis.service.ServerService;
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
}
