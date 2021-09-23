package com.xxxy.entity;

public class Car {
   private int cid;
   private String cname;
   private CarType ctypeid;
   private String ccolor;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public CarType getCtypeid() {
        return ctypeid;
    }

    public void setCtypeid(CarType ctypeid) {
        this.ctypeid = ctypeid;
    }

    public String getCcolor() {
        return ccolor;
    }

    public void setCcolor(String ccolor) {
        this.ccolor = ccolor;
    }

    public Car() {
    }

    public Car(int cid, String cname, CarType ctypeid, String ccolor) {
        this.cid = cid;
        this.cname = cname;
        this.ctypeid = ctypeid;
        this.ccolor = ccolor;
    }

    public Car(String cname, CarType ctypeid, String ccolor) {
        this.cname = cname;
        this.ctypeid = ctypeid;
        this.ccolor = ccolor;
    }
}
