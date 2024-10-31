package com.hrm.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrm.entity.TrainDetForm;
import com.hrm.entity.TrainListForm;
import com.hrm.mapper.BusinMapper;
import com.hrm.service.BusinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinServiceImpl implements BusinService {
    @Resource
    BusinMapper businMapper;
    @Override
    public PageInfo<TrainListForm> trainList(TrainListForm params) {
        Integer page = 0;
        if(params.getPage() != null){
            page = params.getPage();
        }
        PageHelper.startPage(page, 10);
        List<TrainListForm> trainList = businMapper.trainList(params);
        return PageInfo.of(trainList);
    }

    @Override
    public List<TrainDetForm> trainDet(Long trainId) {
        List<TrainDetForm> trainDet = businMapper.trainDet(trainId);
        return trainDet;
    }
}
