package com.idcmis.mapper;

import com.idcmis.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ServerMapper {
    List<ServerListForm> serverList(@Param("params") ServerListForm params);
    List<ServerDetForm> serverDet(Long serverId);
}
