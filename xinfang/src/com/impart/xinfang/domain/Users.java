package com.impart.xinfang.domain;

/**
 * �û���
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class Users {

	private int userid;//���
	private String userName;//����
	private String password;//����
	private int roleid;//��ɫid
	private String userType;//�û�����
	private String depart;//��������
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
