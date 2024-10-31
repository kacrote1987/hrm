package com.hrm.entity;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;
@ApiModel("登陆")
public class LoginForm {
    @NotNull(message = "账号不能为空")
    private String userCode;
    @NotNull(message = "密码不能为空")
    private String userPwd;
    private String token;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
