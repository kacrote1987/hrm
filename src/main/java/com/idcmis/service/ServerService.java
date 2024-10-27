package com.idcmis.service;

import com.github.pagehelper.PageInfo;
import com.idcmis.entity.*;

import java.util.List;

public interface ServerService {
    PageInfo<ServerListForm> serverList(ServerListForm params);
    List<ServerDetForm> serverDet(Long serverId);
}
