package com.idcmis.controller;

import com.github.pagehelper.PageInfo;
import com.idcmis.entity.*;
import com.idcmis.service.UserService;
import com.idcmis.config.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Api(description = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @ApiOperation("登陆")
    @PostMapping("/login")
    public Result login(@RequestBody @Valid LoginForm params){
        LoginForm userLogin= userService.login(params);
        return Result.success(userLogin);
    }

    @ApiOperation("用户信息列表")
    @PostMapping("/userList")
    public Result userList(UserListForm params){
        PageInfo<UserListForm> userList= userService.userList(params);
        return Result.success(userList);
    }

    @ApiOperation("用户详细信息")
    @PostMapping("/userDet")
    public Result userDet(@RequestBody Long userId){
        List<UserDetForm> userDet=userService.userDet(userId);
        return Result.success(userDet);
    }
}