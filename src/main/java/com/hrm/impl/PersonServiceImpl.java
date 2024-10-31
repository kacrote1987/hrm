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
    public void personSave(PersonDetForm params) {
        if(params.getPersonId()!=0L){
            personMapper.updatePerson(params);
        }else{
            personMapper.insertPerson(params);
        }
    }

    @Override
    public void personDel(Long personId) {
        personMapper.deletePerson(personId);
    }

    @Override
    public List<PersonDetForm> compDict() {
        List<PersonDetForm> compDict=personMapper.compDict();
        return compDict;
    }

    @Override
    public List<PersonDetForm> deptDict() {
        List<PersonDetForm> deptDict=personMapper.deptDict();
        return deptDict;
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
