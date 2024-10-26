package com.idcmis.service;

import com.github.pagehelper.PageInfo;
import com.idcmis.entity.ServerDetForm;
import com.idcmis.entity.ServerListForm;

import java.util.List;

public interface CustomerService {
    PageInfo<ServerListForm> serverList(ServerListForm params);
    List<ServerDetForm> serverDet(Long prodId);
}
