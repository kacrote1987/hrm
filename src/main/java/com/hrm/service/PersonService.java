package com.hrm.service;

import com.github.pagehelper.PageInfo;
import com.hrm.entity.PersonDetForm;
import com.hrm.entity.PersonListForm;

import java.util.List;

public interface PersonService {
    PageInfo<PersonListForm> personList(PersonListForm params);
    List<PersonDetForm> personDet(Long personId);
    void personSave(PersonDetForm params);
    void personDel(Long personId);
    List<PersonDetForm> compDict();
    List<PersonDetForm> deptDict();
}
