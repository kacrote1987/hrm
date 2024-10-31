package com.hrm.impl;

import com.hrm.entity.DeptListForm;
import com.hrm.mapper.DeptMapper;
import com.hrm.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    DeptMapper deptMapper;

    @Override
    public List<DeptListForm> deptList(DeptListForm params) {
        List<DeptListForm> deptList = deptMapper.deptList(params);
        return deptList;
    }

    @Override
    public void deptAdd(DeptListForm params) {
        deptMapper.insertServer(params);
    }

    @Override
    public void deptEdit(DeptListForm params) {
        deptMapper.updateServer(params);
    }

    @Override
    public void deptDel(DeptListForm params) {
        deptMapper.updateServer(params);
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
