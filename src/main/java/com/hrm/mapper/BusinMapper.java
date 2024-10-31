package com.hrm.mapper;

import com.hrm.entity.TrainDetForm;
import com.hrm.entity.TrainListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BusinMapper {
    List<TrainListForm> trainList(@Param("params") TrainListForm params);
    List<TrainDetForm> trainDet(Long trainId);
}
