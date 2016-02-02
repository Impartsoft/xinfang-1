package com.impart.xinfang.domain;
/**
 * 16、模块表（module）
 * @author Administrator
 *
 */
public class Module {
private int moduleid;  //模块ID  number(8, 0)  not null
private String moduleName ;  //模块名称  varchar2(30)
private String remark  ;  //模块说明  varchar2(100)
private String engName  ;  //英文名称  varchar2(100)
private int positions   ;  //序号  number(4, 0)  :与roles的权限字段的第几位对应
private int useFlag   ;  //是否使用  number(1, 0)
public int getModuleid() {
	return moduleid;
}
public void setModuleid(int moduleid) {
	this.moduleid = moduleid;
}
public String getModuleName() {
	return moduleName;
}
public void setModuleName(String moduleName) {
	this.moduleName = moduleName;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public String getEngName() {
	return engName;
}
public void setEngName(String engName) {
	this.engName = engName;
}
public int getPositions() {
	return positions;
}
public void setPositions(int positions) {
	this.positions = positions;
}
public int getUseFlag() {
	return useFlag;
}
public void setUseFlag(int useFlag) {
	this.useFlag = useFlag;
}
@Override
public String toString() {
	return "module [moduleid=" + moduleid + ", moduleName=" + moduleName
			+ ", remark=" + remark + ", engName=" + engName + ", positions="
			+ positions + ", useFlag=" + useFlag + "]";
}
 
}
