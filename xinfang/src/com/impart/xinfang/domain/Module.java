package com.impart.xinfang.domain;

/**
 * 权限模块
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class Module {

	private int moduleid;//模块编号
	private String moduleName;//模块名称
	private long position;//权限位置
	private String remark;//模块描述
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public long getPosition() {
		return position;
	}
	public void setPosition(long position) {
		this.position = position;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getModuleid() {
		return moduleid;
	}
	
}
