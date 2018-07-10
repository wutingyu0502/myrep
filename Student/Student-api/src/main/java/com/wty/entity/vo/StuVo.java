package com.wty.entity.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class StuVo implements Serializable{
	private Integer sid;

	private String sname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date studyDate;

	private List<Integer> hid;

	private String hname;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(Date studyDate) {
		this.studyDate = studyDate;
	}

	public List<Integer> getHid() {
		return hid;
	}

	public void setHid(List<Integer> hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	@Override
	public String toString() {
		return "StuVo [sid=" + sid + ", sname=" + sname + ", studyDate=" + studyDate + ", hid=" + hid + ", hname="
				+ hname + "]";
	}

	public StuVo(Integer sid, String sname, Date studyDate, List<Integer> hid, String hname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.studyDate = studyDate;
		this.hid = hid;
		this.hname = hname;
	}

	public StuVo() {
		super();
	}
	
	

}
