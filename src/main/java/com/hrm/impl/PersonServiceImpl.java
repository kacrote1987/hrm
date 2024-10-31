package com.hrm.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrm.entity.PersonDetForm;
import com.hrm.entity.PersonListForm;
import com.hrm.mapper.PersonMapper;
import com.hrm.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    PersonMapper personMapper;

    @Override
    public PageInfo<PersonListForm> personList(PersonListForm params) {
        Integer page = 0;
        if(params.getPage() != null){
            page = params.getPage();
        }
        PageHelper.startPage(page, 10);
        List<PersonListForm> personList = personMapper.personList(params);
        return PageInfo.of(personList);
    }

    @Override
    public List<PersonDetForm> personDet(Long personId) {
        List<PersonDetForm> personDet=personMapper.personDet(personId);
        return personDet;
    }

    @Override
    public void personAdd(PersonDetForm params) {
        personMapper.insertPerson(params);
    }

    @Override
    public void personEdit(PersonDetForm params) {
        personMapper.updatePerson(params);
    }

    @Override
    public void personDel(Long personId) {
        personMapper.deletePerson(personId);
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
