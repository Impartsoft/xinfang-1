package com.impart.xinfang.domain;

/**
 * ��ɫ
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class Role {

	private int roleid;//id
	private String roleName;//��ɫ����
	private String roleDescribe;//����
	private long roleRight;//Ȩ��
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescribe() {
		return roleDescribe;
	}
	public void setRoleDescribe(String roleDescribe) {
		this.roleDescribe = roleDescribe;
	}
	public long getRoleRight() {
		return roleRight;
	}
	public void setRoleRight(long roleRight) {
		this.roleRight = roleRight;
	}
	public int getRoleid() {
		return roleid;
	}
	
}
