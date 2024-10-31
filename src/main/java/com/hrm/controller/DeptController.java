package com.hrm.controller;

import com.hrm.config.Result;
import com.hrm.entity.DeptListForm;
import com.hrm.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "部门管理")
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    DeptService deptService;

    @ApiOperation("部门列表")
    @PostMapping("/deptList")
    public Result deptList(DeptListForm params){
        List<DeptListForm> deptList= deptService.deptList(params);
        return Result.success(deptList);
    }

    @ApiOperation("部门新增")
    @PostMapping("/deptAdd")
    public Result deptAdd(@RequestBody DeptListForm params){
        deptService.deptAdd(params);
        return Result.success();
    }

    @ApiOperation("部门编辑")
    @PostMapping("/deptEdit")
    public Result deptEdit(@RequestBody DeptListForm params){
        deptService.deptEdit(params);
        return Result.success();
    }

    @ApiOperation("部门删除")
    @PostMapping("/deptDel")
    public Result deptDel(@RequestBody DeptListForm params){
        deptService.deptDel(params);
        return Result.success();
    }
}
