package com.hrm.controller;

import com.github.pagehelper.PageInfo;
import com.hrm.config.Result;
import com.hrm.entity.TrainDetForm;
import com.hrm.entity.TrainListForm;
import com.hrm.service.BusinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "业务管理")
@RestController
@RequestMapping("/busin")
public class BusinController {
    @Resource
    BusinService businService;

    @ApiOperation("培训列表")
    @PostMapping("/trainList")
    public Result trainList(TrainListForm params){
        PageInfo<TrainListForm> trainList= businService.trainList(params);
        return Result.success(trainList);
    }

    @ApiOperation("培训详情")
    @PostMapping("/trainDet")
    public Result trainDet(@RequestBody Long trainId){
        List<TrainDetForm> trainDet= businService.trainDet(trainId);
        return Result.success(trainDet);
    }
}
