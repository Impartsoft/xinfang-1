package com.impart.xinfang.domain;

/**
 * ��ϵ����
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class DepartStaff {

	private String departStaffid;//���
	private String departStaffName;//��������
	private String departStaffAddr;//��ַ
	private int departStaffFlag;//��������
	private String staffDuty;//ְ��
	private String describe;//����
	private int sortOrder;//����
	public String getDepartStaffName() {
		return departStaffName;
	}
	public void setDepartStaffName(String departStaffName) {
		this.departStaffName = departStaffName;
	}
	public String getDepartStaffAddr() {
		return departStaffAddr;
	}
	public void setDepartStaffAddr(String departStaffAddr) {
		this.departStaffAddr = departStaffAddr;
	}
	public int getDepartStaffFlag() {
		return departStaffFlag;
	}
	public void setDepartStaffFlag(int departStaffFlag) {
		this.departStaffFlag = departStaffFlag;
	}
	public String getStaffDuty() {
		return staffDuty;
	}
	public void setStaffDuty(String staffDuty) {
		this.staffDuty = staffDuty;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getDepartStaffid() {
		return departStaffid;
	}
	
}
