package com.impart.xinfang.domain;

/**
 * 问题类型表
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class AcceptType {

	private String acceptTypeid;//报警类型id
	private String acceptType;//报警类型
	
	public String getAcceptType() {
		return acceptType;
	}
	public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}
	public String getAcceptTypeid() {
		return acceptTypeid;
	}
}
