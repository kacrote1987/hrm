package com.hrm.entity;

public class DeptListForm {
    private Long deptId;
    private String deptName;
    private Long deptLv;
    private Long deptOrder;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Long getDeptLv() {
        return deptLv;
    }

    public void setDeptLv(Long deptLv) {
        this.deptLv = deptLv;
    }

    public Long getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(Long deptOrder) {
        this.deptOrder = deptOrder;
    }
}
