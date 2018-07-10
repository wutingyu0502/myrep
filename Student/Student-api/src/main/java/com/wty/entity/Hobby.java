package com.wty.entity;

import java.io.Serializable;

public class Hobby implements Serializable{
    private Integer hid;

    private String hname;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }
}