package com.impart.xinfang.domain;

import java.util.Date;

/**
 * ɧ�ŵ绰��
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class DustPhone {

	private String dustPhoneid;//id
	private String phone;//�绰����
	private String phone_owner;//������
	private String phone_addr;//��ַ
	private Date start_date;//��������
	private Date end_date;//��������
	private int lockTime;//����ʱ��
	private String staff_name;//������
	private int phoneType;//�绰���ͣ�Ĭ��Ϊ0
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
