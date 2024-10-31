package com.hrm.service;

import com.github.pagehelper.PageInfo;
import com.hrm.entity.PersonDetForm;
import com.hrm.entity.PersonListForm;

import java.util.List;

public interface PersonService {
    PageInfo<PersonListForm> personList(PersonListForm params);
    List<PersonDetForm> personDet(Long personId);
    void personAdd(PersonDetForm params);
    void personEdit(PersonDetForm params);
    void personDel(Long personId);
}
