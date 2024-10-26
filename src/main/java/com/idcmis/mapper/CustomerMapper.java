package com.idcmis.mapper;

import com.idcmis.entity.ServerDetForm;
import com.idcmis.entity.ServerListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper {
    List<ServerListForm> serverList(@Param("params") ServerListForm params);
    List<ServerDetForm> serverDet(Long prodId);
}
