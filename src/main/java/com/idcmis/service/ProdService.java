package com.idcmis.service;

import com.github.pagehelper.PageInfo;
import com.idcmis.entity.*;

import java.util.List;

public interface ProdService {
    PageInfo<ProdListVo> prodList(ProdListForm params);
    List<ProdDetVo> prodDet(Long prodId);
}
