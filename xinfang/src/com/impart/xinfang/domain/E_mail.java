package com.impart.xinfang.domain;

import java.util.Date;
/**
 * 14邮件举报表（e_mail）
 * @author Administrator
 *
 */
public class E_mail {

	private String emailid;  //编号
	private Date emailDate;  //日期
	private String emailAddr;  //地址
	private String subject;  //标题
	private String content;  //内容
	private Boolean isDelete;  //是否删除
	private String acceptid;  //受理id
	private String serialNo;  //序列号
	private String name;  //用户姓名
	private String phone;  //联系电话
	private String category;  //来    源
	private Boolean isExchange;
	private String user_type;  //用户身份
	private String user_postcode;  //邮    编
	private String user_cardno;  //身份证号
	private String user_email;  //电子邮件
	private String user_job;  //工作单位
	private String appellee_name;  //被反映人
	private String appellee_job;  //被反映人工作单位
	private String contentType;  //涉及方面
	private String hasConsulted;  //是否反映过
	private String questionType;  //反映类型
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Date getEmailDate() {
		return emailDate;
	}
	public void setEmailDate(Date emailDate) {
		this.emailDate = emailDate;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	public String getAcceptid() {
		return acceptid;
	}
	public void setAcceptid(String acceptid) {
		this.acceptid = acceptid;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Boolean getIsExchange() {
		return isExchange;
	}
	public void setIsExchange(Boolean isExchange) {
		this.isExchange = isExchange;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_postcode() {
		return user_postcode;
	}
	public void setUser_postcode(String user_postcode) {
		this.user_postcode = user_postcode;
	}
	public String getUser_cardno() {
		return user_cardno;
	}
	public void setUser_cardno(String user_cardno) {
		this.user_cardno = user_cardno;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_job() {
		return user_job;
	}
	public void setUser_job(String user_job) {
		this.user_job = user_job;
	}
	public String getAppellee_name() {
		return appellee_name;
	}
	public void setAppellee_name(String appellee_name) {
		this.appellee_name = appellee_name;
	}
	public String getAppellee_job() {
		return appellee_job;
	}
	public void setAppellee_job(String appellee_job) {
		this.appellee_job = appellee_job;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getHasConsulted() {
		return hasConsulted;
	}
	public void setHasConsulted(String hasConsulted) {
		this.hasConsulted = hasConsulted;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	@Override
	public String toString() {
		return "E_mail [emailid=" + emailid + ", emailDate=" + emailDate
				+ ", emailAddr=" + emailAddr + ", subject=" + subject
				+ ", content=" + content + ", isDelete=" + isDelete
				+ ", acceptid=" + acceptid + ", serialNo=" + serialNo
				+ ", name=" + name + ", phone=" + phone + ", category="
				+ category + ", isExchange=" + isExchange + ", user_type="
				+ user_type + ", user_postcode=" + user_postcode
				+ ", user_cardno=" + user_cardno + ", user_email=" + user_email
				+ ", user_job=" + user_job + ", appellee_name=" + appellee_name
				+ ", appellee_job=" + appellee_job + ", contentType="
				+ contentType + ", hasConsulted=" + hasConsulted
				+ ", questionType=" + questionType + "]";
	}
}
