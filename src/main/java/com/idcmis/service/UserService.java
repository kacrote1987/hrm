package com.idcmis.service;

import com.github.pagehelper.PageInfo;
import com.idcmis.entity.*;

import java.util.List;

public interface UserService {
    /**
     * 登陆
     * @return
     */
    LoginForm login(LoginForm params);
    /**
     * 人员信息列表
     * @return
     */
    PageInfo<UserListForm> userList(UserListForm params);
    /**
     * 人员信息详细
     * @return
     */
    List<UserDetForm> userDet(Long userId);
}
