package com.hrm.service;

import com.github.pagehelper.PageInfo;
import com.hrm.entity.*;

import java.util.List;

public interface ServerService {
    PageInfo<ServerListForm> serverList(ServerListForm params);
    List<ServerDetForm> serverDet(Long serverId);
    void serverSave(ServerDetForm params);
    void serverDel(Long customerId);
}
