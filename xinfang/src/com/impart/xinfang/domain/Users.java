package com.impart.xinfang.domain;

/**
 * 用户表
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class Users {

	private int userid;//编号
	private String userName;//姓名
	private String password;//密码
	private int roleid;//角色id
	private String userType;//用户类型
	private String depart;//所属部门
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public int getUserid() {
		return userid;
	}
	
}
