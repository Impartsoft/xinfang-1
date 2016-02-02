package com.impart.xinfang.domain;

/**
 * 联系部门
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class DepartStaff {

	private String departStaffid;//编号
	private String departStaffName;//部门名称
	private String departStaffAddr;//地址
	private int departStaffFlag;//部门类型
	private String staffDuty;//职务
	private String describe;//描述
	private int sortOrder;//排序
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
