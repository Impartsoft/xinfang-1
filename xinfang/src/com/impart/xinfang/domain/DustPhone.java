package com.impart.xinfang.domain;

import java.util.Date;

/**
 * 骚扰电话表
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class DustPhone {

	private String dustPhoneid;//id
	private String phone;//电话号码
	private String phone_owner;//所有者
	private String phone_addr;//地址
	private Date start_date;//锁定日期
	private Date end_date;//解锁日期
	private int lockTime;//锁定时长
	private String staff_name;//锁定人
	private int phoneType;//电话类型，默认为0
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone_owner() {
		return phone_owner;
	}
	public void setPhone_owner(String phone_owner) {
		this.phone_owner = phone_owner;
	}
	public String getPhone_addr() {
		return phone_addr;
	}
	public void setPhone_addr(String phone_addr) {
		this.phone_addr = phone_addr;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getLockTime() {
		return lockTime;
	}
	public void setLockTime(int lockTime) {
		this.lockTime = lockTime;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public int getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(int phoneType) {
		this.phoneType = phoneType;
	}
	public String getDustPhoneid() {
		return dustPhoneid;
	}
	
}
