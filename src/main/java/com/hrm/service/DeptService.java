package com.hrm.service;

import com.hrm.entity.DeptListForm;

import java.util.List;

public interface DeptService {
    List<DeptListForm> deptList(DeptListForm params);
    void deptAdd(DeptListForm params);
    void deptEdit(DeptListForm params);
    void deptDel(DeptListForm params);
}
