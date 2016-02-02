package com.impart.xinfang.domain;

import java.util.Date;

/**
 * 回访记录表
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class Callback {

	private String acceptid;//受理编号
	private String itemid;//回访编号
	private Date callTime;//回访时间
	private String phone;//电话号码
	private String content;//回访内容
	private String satisfAction;//回访满意度
	private String remark;//备注
	public String getAcceptid() {
		return acceptid;
	}
	public void setAcceptid(String acceptid) {
		this.acceptid = acceptid;
	}
	public Date getCallTime() {
		return callTime;
	}
	public void setCallTime(Date callTime) {
		this.callTime = callTime;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSatisfAction() {
		return satisfAction;
	}
	public void setSatisfAction(String satisfAction) {
		this.satisfAction = satisfAction;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getItemid() {
		return itemid;
	}
	
}
