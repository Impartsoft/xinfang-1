package com.impart.xinfang.domain;

import java.util.Date;

/**
 * �طü�¼��
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class Callback {

	private String acceptid;//������
	private String itemid;//�طñ��
	private Date callTime;//�ط�ʱ��
	private String phone;//�绰����
	private String content;//�ط�����
	private String satisfAction;//�ط������
	private String remark;//��ע
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
