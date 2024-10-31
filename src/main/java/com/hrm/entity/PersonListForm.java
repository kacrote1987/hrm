package com.hrm.entity;

public class PersonListForm {
    private Long personId;
    private String deptName;
    private String personNo;
    private String personName;
    private String personSex;
    private String personTel;
    private String personDegree;
    private String personPolity;
    private String personState;
    private Integer page;
    private Integer limit;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }

    public String getPersonTel() {
        return personTel;
    }

    public void setPersonTel(String personTel) {
        this.personTel = personTel;
    }

    public String getPersonDegree() {
        return personDegree;
    }

    public void setPersonDegree(String personDegree) {
        this.personDegree = personDegree;
    }

    public String getPersonPolity() {
        return personPolity;
    }

    public void setPersonPolity(String personPolity) {
        this.personPolity = personPolity;
    }

    public String getPersonState() {
        return personState;
    }

    public void setPersonState(String personState) {
        this.personState = personState;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
