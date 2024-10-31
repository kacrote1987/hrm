package com.hrm.service;

import com.github.pagehelper.PageInfo;
import com.hrm.entity.*;

import java.util.List;

public interface UserService {
    LoginForm login(LoginForm params);
    PageInfo<UserListForm> userList(UserListForm params);
    List<UserDetForm> userDet(Long userId);
    void userSave(UserDetForm params);
    void userDel(Long userId);
}
