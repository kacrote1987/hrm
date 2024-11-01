package com.hrm.controller;

import com.github.pagehelper.PageInfo;
import com.hrm.config.Result;
import com.hrm.entity.PersonDetForm;
import com.hrm.entity.PersonListForm;
import com.hrm.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "人员管理")
@RestController
@RequestMapping("/person")
public class PersonController {
    @Resource
    PersonService personService;

    @ApiOperation("人员列表")
    @PostMapping("/personList")
    public Result personList(PersonListForm params){
        PageInfo<PersonListForm> personList= personService.personList(params);
        return Result.success(personList);
    }

    @ApiOperation("人员详细")
    @PostMapping("/personDet")
    public Result personDet(@RequestBody Long personId){
        List<PersonDetForm> personDet= personService.personDet(personId);
        return Result.success(personDet);
    }

    @ApiOperation("人员保存")
    @PostMapping("/personSave")
    public Result personSave(@RequestBody PersonDetForm params){
        personService.personSave(params);
        return Result.success();
    }

    @ApiOperation("人员删除")
    @PostMapping("/personDel")
    public Result personDel(@RequestParam Long personId){
        personService.personDel(personId);
        return Result.success();
    }

    @ApiOperation("公司字典")
    @PostMapping("/compDict")
    public Result compDict(){
        List<PersonDetForm> compDict= personService.compDict();
        return Result.success(compDict);
    }

    @ApiOperation("部门字典")
    @PostMapping("/deptDict")
    public Result deptDict(){
        List<PersonDetForm> deptDict= personService.deptDict();
        return Result.success(deptDict);
    }
}
