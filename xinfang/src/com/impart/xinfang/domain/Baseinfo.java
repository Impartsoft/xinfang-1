package com.impart.xinfang.domain;
/**
 * 6基础信息表（baseinfo）
 * @author Administrator
 *
 */
public class Baseinfo {
private int baseInfoid;  //编号number(4, 0) not null
private String baseInfoType;  //类型  varchar2(20)
private String baseInfoName; //名称  varchar2(30) not null
private int isShow;  //是否显示 number(1, 0)
public int getBaseInfoid() {
	return baseInfoid;
}
public void setBaseInfoid(int baseInfoid) {
	this.baseInfoid = baseInfoid;
}
public String getBaseInfoType() {
	return baseInfoType;
}
public void setBaseInfoType(String baseInfoType) {
	this.baseInfoType = baseInfoType;
}
public String getBaseInfoName() {
	return baseInfoName;
}
public void setBaseInfoName(String baseInfoName) {
	this.baseInfoName = baseInfoName;
}
public int getIsShow() {
	return isShow;
}
public void setIsShow(int isShow) {
	this.isShow = isShow;
}
@Override
public String toString() {
	return "Baseinfo [baseInfoid=" + baseInfoid + ", baseInfoType="
			+ baseInfoType + ", baseInfoName=" + baseInfoName + ", isShow="
			+ isShow + "]";
}
}
