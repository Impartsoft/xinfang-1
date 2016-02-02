package com.impart.xinfang.domain;
/**
 * 18、不受理记录（refuse）
 * @author Administrator
 *
 */
public class Refuse {

	private String callid ; //电话id

	public String getCallid() {
		return callid;
	}

	public void setCallid(String callid) {
		this.callid = callid;
	}

	@Override
	public String toString() {
		return "Refuse [callid=" + callid + "]";
	}
}
