package com.hrm.mapper;

import com.hrm.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<DeptListForm> deptList(@Param("params") DeptListForm params);
    boolean insertServer(@Param("params") DeptListForm params);
    boolean updateServer(@Param("params") DeptListForm params);
    boolean deleteServer(Long deptId);
}
