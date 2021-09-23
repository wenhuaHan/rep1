package com.xxxy.entity;

public class CarType {
    private int ctid;
    private String ctype;

    public int getCtid() {
        return ctid;
    }

    public void setCtid(int ctid) {
        this.ctid = ctid;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public CarType(int ctid, String ctype) {
        this.ctid = ctid;
        this.ctype = ctype;
    }

    public CarType() {
    }

    public CarType(String ctype) {
        this.ctype = ctype;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "ctid=" + ctid +
                ", ctype='" + ctype + '\'' +
                '}';
    }
}
