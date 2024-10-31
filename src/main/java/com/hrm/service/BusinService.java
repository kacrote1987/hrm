package com.hrm.service;

import com.github.pagehelper.PageInfo;
import com.hrm.entity.TrainDetForm;
import com.hrm.entity.TrainListForm;

import java.util.List;

public interface BusinService {
    PageInfo<TrainListForm> trainList(TrainListForm params);
    List<TrainDetForm> trainDet(Long trainId);
}
