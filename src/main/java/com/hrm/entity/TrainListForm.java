package com.hrm.entity;

public class TrainListForm {
    private Long trainId;
    private String trainTheme;
    private String trainTime;
    private Long personId;
    private String personNo;
    private String personName;
    private String trainState;
    private Integer page;
    private Integer limit;

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public String getTrainTheme() {
        return trainTheme;
    }

    public void setTrainTheme(String trainTheme) {
        this.trainTheme = trainTheme;
    }

    public String getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(String trainTime) {
        this.trainTime = trainTime;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
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

    public String getTrainState() {
        return trainState;
    }

    public void setTrainState(String trainState) {
        this.trainState = trainState;
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
