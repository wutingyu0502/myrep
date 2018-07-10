package com.wty.entity;

import java.io.Serializable;

public class SH implements Serializable{
    private Integer sid;

    private Integer hid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }
}