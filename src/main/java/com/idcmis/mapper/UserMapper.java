package com.idcmis.mapper;

import com.idcmis.entity.LoginVo;
import com.idcmis.entity.UserDetVo;
import com.idcmis.entity.UserListForm;
import com.idcmis.entity.UserListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    LoginVo login(String userCode, String userPwd);
    List<UserListVo> userList(String type, @Param("params") UserListForm params);
    List<UserDetVo> selDet(Long userId);
}
