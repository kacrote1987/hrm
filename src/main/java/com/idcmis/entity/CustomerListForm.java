package com.idcmis.entity;

public class CustomerListForm {
    private Long customId;
    private String customName;
    private String customTel;
    private String customQq;
    private String customWw;
    private Integer page;
    private Integer limit;

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getCustomTel() {
        return customTel;
    }

    public void setCustomTel(String customTel) {
        this.customTel = customTel;
    }

    public String getCustomQq() {
        return customQq;
    }

    public void setCustomQq(String customQq) {
        this.customQq = customQq;
    }

    public String getCustomWw() {
        return customWw;
    }

    public void setCustomWw(String customWw) {
        this.customWw = customWw;
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
