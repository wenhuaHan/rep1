package com.ambow.entity;

public class ProvinceEntity {
    private int pid;
    private String pname;
    //修改的用   将用户的值封装到了实体类中
    public int getPid() {
        return pid;
    }
    //查询的时候用  将数据库的值封装
    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public ProvinceEntity(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public ProvinceEntity() {
    }

    public ProvinceEntity(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "ProvinceEntity{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }
}
