package com.impart.xinfang.domain;
/**
 * 6������Ϣ��baseinfo��
 * @author Administrator
 *
 */
public class Baseinfo {
private int baseInfoid;  //���number(4, 0) not null
private String baseInfoType;  //����  varchar2(20)
private String baseInfoName; //����  varchar2(30) not null
private int isShow;  //�Ƿ���ʾ number(1, 0)
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
