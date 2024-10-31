package com.hrm.controller;

import com.github.pagehelper.PageInfo;
import com.hrm.entity.*;
import com.hrm.service.UserService;
import com.hrm.config.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation("用户保存")
    @PostMapping("/userSave")
    public Result userSave(@RequestBody UserDetForm params){
        userService.userSave(params);
        return Result.success();
    }

    @ApiOperation("客户删除")
    @PostMapping("/userDel")
    public Result userDel(@RequestParam Long userId){
        userService.userDel(userId);
        return Result.success();
    }
}
