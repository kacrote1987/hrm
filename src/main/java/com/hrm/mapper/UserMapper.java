package com.hrm.mapper;

import com.hrm.entity.LoginForm;
import com.hrm.entity.UserDetForm;
import com.hrm.entity.UserListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    LoginForm login(String userCode, String userPwd);
    List<UserListForm> userList(@Param("params") UserListForm params);
    List<UserDetForm> selDet(Long userId);
    boolean insertUser(@Param("params") UserDetForm params);
    boolean updateUser(@Param("params") UserDetForm params);
    boolean deleteUser(Long userId);
}
