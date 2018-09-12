package com.lgy.springOrgDemo.basic;

public class Group {
    private String GrpName;
    private int GrpId;

    public String getGrpName() {
        return GrpName;
    }

    public void setGrpName(String grpName) {
        GrpName = grpName;
    }

    public int getGrpId() {
        return GrpId;
    }

    public void setGrpId(int grpId) {
        GrpId = grpId;
    }

    public Group(String grpName, int grpId) {
        GrpName = grpName;
        GrpId = grpId;
    }
}
