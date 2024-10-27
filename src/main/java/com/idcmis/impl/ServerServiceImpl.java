package com.idcmis.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idcmis.entity.ServerDetForm;
import com.idcmis.entity.ServerListForm;
import com.idcmis.mapper.ServerMapper;
import com.idcmis.service.ServerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {
    @Resource
    ServerMapper serverMapper;

    @Override
    public PageInfo<ServerListForm> serverList(ServerListForm params) {
        Integer page = 0;
        if(params.getPage() != null){
            page = params.getPage();
        }
        PageHelper.startPage(page, 10);
        List<ServerListForm> serverList = serverMapper.serverList(params);
        return PageInfo.of(serverList);
    }

    @Override
    public List<ServerDetForm> serverDet(Long serverId) {
        List<ServerDetForm> serverDet=serverMapper.serverDet(serverId);
        return serverDet;
    }

    public static String method (String str){
        String pos="";
        if(str!=null && str!=""){
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i); //把字符串转为字符
                if(c >= 'A' && c <= 'Z'){
                    pos=pos+'_'+(char)(c+32);
                }
                else{
                    pos=pos+c;
                }
            }
        }else{
            pos="";
        }
        return pos;
    }
}
