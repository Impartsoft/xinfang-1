package com.impart.xinfang.domain;

/**
 * Ȩ��ģ��
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class Module {

	private int moduleid;//ģ����
	private String moduleName;//ģ������
	private long position;//Ȩ��λ��
	private String remark;//ģ������
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
