package com.impart.xinfang.domain;

/**
 * 角色
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class Role {

	private int roleid;//id
	private String roleName;//角色名称
	private String roleDescribe;//描述
	private long roleRight;//权限
	
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
