package com.idcmis.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idcmis.entity.*;
import com.idcmis.mapper.UserMapper;
import com.idcmis.service.UserService;
import com.idcmis.config.MyCache;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
//    @Resource

    @Override
    public LoginForm login(LoginForm params) {
        LoginForm userLogin=userMapper.login(params.getUserCode(),params.getUserPwd());
        if(userLogin!=null){
            userLogin.setToken(UUID.randomUUID().toString());
            MyCache.put(userLogin.getToken(),userLogin,30, TimeUnit.MINUTES);
        }
//        final List<PermissionVo> permissionVoList=userMapper.selectPerm(userLoginVo.getRoleId());
//        if(permissionVoList==null || permissionVoList.size()==0){
//            throw new UnAuthorizationException("无法获取角色信息");
//        }
//        permissionVoList.forEach(item->PermissionVo.build(item,permissionVoList));
//        userLoginVo.setPerms(permissionVoList.stream().filter(item->item.getPid()==0).collect(Collectors.toList()));
        return userLogin;
    }

    public PageInfo<UserListForm> userList(UserListForm params) {
        Integer page = 0;
        if(params.getPage() != null){
            page = params.getPage();
        }
        PageHelper.startPage(page, 10);
        List<UserListForm> userList=userMapper.userList(params);
        return PageInfo.of(userList);
    }

    @Override
    public List<UserDetForm> userDet(Long userId) {
        List<UserDetForm> userDet=null;
        if(userId!=0){
            userDet=userMapper.selDet(userId);
        }
        return userDet;
    }

    @Override
    public void userSave(UserDetForm params) {
        if(params.getUserId()!=null){
            userMapper.updateUser(params);
        }else{
            userMapper.insertUser(params);
        }
    }

    @Override
    public void userDel(Long userId) {
        userMapper.deleteUser(userId);
    }

    public static String method (String str){
        String pos1;
        String pos2=null;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i); //把字符串转为字符
            if(c >= 'A' && c <= 'Z'){
                pos1=str.replace(c,(char)(c+32));
                pos2=pos1.substring(0,i)+'_'+pos1.substring(i,pos1.length());
            }
        }
        return pos2;
    }
}
