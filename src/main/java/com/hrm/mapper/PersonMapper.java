package com.hrm.mapper;

import com.hrm.entity.PersonDetForm;
import com.hrm.entity.PersonListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMapper {
    List<PersonListForm> personList(@Param("params") PersonListForm params);
    List<PersonDetForm> personDet(Long personId);
    boolean insertPerson(@Param("params") PersonDetForm params);
    boolean updatePerson(@Param("params") PersonDetForm params);
    boolean deletePerson(Long personId);
    List<PersonDetForm> compDict();
    List<PersonDetForm> deptDict();
}
