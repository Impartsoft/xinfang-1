package com.impart.xinfang.domain;

import java.util.Date;

/**
 * 举报投诉表
 * @author 郑宝林
 * @version 1.0 2016-02-01
 */
public class Accept {

	private String acceptid;//编号
	private Date acceptDate;//受理日期
	private String callNum;//电话号码
	private String acceptType;//受理类型
	private String callType;//投诉方式
	private String fname;//反映人
	private String faddress;//地址
	private String fcontact;//联系方式
	private String backContact;//答复方式
	private String femail;//反映人email
	private int fnum;//反映人数量
	private int cfqc;//是否有重复件
	private String fmatter;//反映内容
	private String bname;//被反映人
	private String bunit;//被反映人单位
	private String baddress;//被反映人地址
	private String bjb;//被反映人级别
	private String allowNet;//允许网上发布
	private String cbdw;//待承办单位
	private String lzdw;//流转单位
	private String result;//办理结果
	private int acceptState;//案件状态
	private String secret;//保密等级
	private String remark;//备注
	private String circulate;//流转过程
	private String userid;//坐席工号
	private String recFile;//录音文件名
	private String reader;//读者，指示案件在谁手中
	private int objectState;//提交状态
	private boolean sfnm;//是否匿名
	private boolean sfyj;//是否要件
	private boolean sfsw;//是否涉外
	private String xm;//项目
	private String xmzl;//项目子类
	private int isExchanged;//填0
	private String postCode;//邮政编码
	private String user_type;//反映人身份
	private String farea;//反映人地区
	private String cfjid;//重复编号
	private String onturn;//轮值接听
	private String onturnDepart;//轮值部门
	private String onturnLeader;//轮值领导
	private int cfcs;//重复次数
	private String hfjg;//回访结果
	private String hfryj;//回访人意见
	private Date hfsj;//回访时间
	private String sfxcxd;//现场行动
	private String lzblqk;//轮值办理情况
	private String lzbmlb;//轮值部门类别
	private String dealType;//案件处理类型,确认、重报、误报
	private String ffzsqtdwlx;//分发转送其他单位类型，纪检、其他、空
	private String ffzsqtdwmc;//分发转送其他单位名称，纪检部门、其他单位、空
	private Date ffsx;//分发时限，默认一个工作日
	private boolean sfff;//是否分发
	private Date blsx;//办理时限，办结时间要求
	private boolean sfbj;//是否办结
	private Date fksx;//反馈时限，5个工作日给投诉人
	private boolean sffk;//是否反馈
	private Date hcsx;//核查时限，24小时（特殊类型）
	private boolean sfhc;//是否核查
	private boolean sfps;//是否批示
	private boolean sfjl;//是否奖励
	private boolean sfzacl;//是否专案处理
	private boolean sfgd;//是否归档
	private String gdlxid;//归档类型id
	private String gdms;//归档描述
	public Date getAcceptDate() {
		return acceptDate;
	}
	public void setAcceptDate(Date acceptDate) {
		this.acceptDate = acceptDate;
	}
	public String getCallNum() {
		return callNum;
	}
	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
	public String getAcceptType() {
		return acceptType;
	}
	public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFaddress() {
		return faddress;
	}
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	public String getFcontact() {
		return fcontact;
	}
	public void setFcontact(String fcontact) {
		this.fcontact = fcontact;
	}
	public String getBackContact() {
		return backContact;
	}
	public void setBackContact(String backContact) {
		this.backContact = backContact;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	public int getCfqc() {
		return cfqc;
	}
	public void setCfqc(int cfqc) {
		this.cfqc = cfqc;
	}
	public String getFmatter() {
		return fmatter;
	}
	public void setFmatter(String fmatter) {
		this.fmatter = fmatter;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBunit() {
		return bunit;
	}
	public void setBunit(String bunit) {
		this.bunit = bunit;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public String getBjb() {
		return bjb;
	}
	public void setBjb(String bjb) {
		this.bjb = bjb;
	}
	public String getAllowNet() {
		return allowNet;
	}
	public void setAllowNet(String allowNet) {
		this.allowNet = allowNet;
	}
	public String getCbdw() {
		return cbdw;
	}
	public void setCbdw(String cbdw) {
		this.cbdw = cbdw;
	}
	public String getLzdw() {
		return lzdw;
	}
	public void setLzdw(String lzdw) {
		this.lzdw = lzdw;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getAcceptState() {
		return acceptState;
	}
	public void setAcceptState(int acceptState) {
		this.acceptState = acceptState;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCirculate() {
		return circulate;
	}
	public void setCirculate(String circulate) {
		this.circulate = circulate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getRecFile() {
		return recFile;
	}
	public void setRecFile(String recFile) {
		this.recFile = recFile;
	}
	public String getReader() {
		return reader;
	}
	public void setReader(String reader) {
		this.reader = reader;
	}
	public int getObjectState() {
		return objectState;
	}
	public void setObjectState(int objectState) {
		this.objectState = objectState;
	}
	public boolean isSfnm() {
		return sfnm;
	}
	public void setSfnm(boolean sfnm) {
		this.sfnm = sfnm;
	}
	public boolean isSfyj() {
		return sfyj;
	}
	public void setSfyj(boolean sfyj) {
		this.sfyj = sfyj;
	}
	public boolean isSfsw() {
		return sfsw;
	}
	public void setSfsw(boolean sfsw) {
		this.sfsw = sfsw;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getXmzl() {
		return xmzl;
	}
	public void setXmzl(String xmzl) {
		this.xmzl = xmzl;
	}
	public int getIsExchanged() {
		return isExchanged;
	}
	public void setIsExchanged(int isExchanged) {
		this.isExchanged = isExchanged;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getFarea() {
		return farea;
	}
	public void setFarea(String farea) {
		this.farea = farea;
	}
	public String getCfjid() {
		return cfjid;
	}
	public void setCfjid(String cfjid) {
		this.cfjid = cfjid;
	}
	public String getOnturn() {
		return onturn;
	}
	public void setOnturn(String onturn) {
		this.onturn = onturn;
	}
	public String getOnturnDepart() {
		return onturnDepart;
	}
	public void setOnturnDepart(String onturnDepart) {
		this.onturnDepart = onturnDepart;
	}
	public String getOnturnLeader() {
		return onturnLeader;
	}
	public void setOnturnLeader(String onturnLeader) {
		this.onturnLeader = onturnLeader;
	}
	public int getCfcs() {
		return cfcs;
	}
	public void setCfcs(int cfcs) {
		this.cfcs = cfcs;
	}
	public String getHfjg() {
		return hfjg;
	}
	public void setHfjg(String hfjg) {
		this.hfjg = hfjg;
	}
	public String getHfryj() {
		return hfryj;
	}
	public void setHfryj(String hfryj) {
		this.hfryj = hfryj;
	}
	public Date getHfsj() {
		return hfsj;
	}
	public void setHfsj(Date hfsj) {
		this.hfsj = hfsj;
	}
	public String getSfxcxd() {
		return sfxcxd;
	}
	public void setSfxcxd(String sfxcxd) {
		this.sfxcxd = sfxcxd;
	}
	public String getLzblqk() {
		return lzblqk;
	}
	public void setLzblqk(String lzblqk) {
		this.lzblqk = lzblqk;
	}
	public String getLzbmlb() {
		return lzbmlb;
	}
	public void setLzbmlb(String lzbmlb) {
		this.lzbmlb = lzbmlb;
	}
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getFfzsqtdwlx() {
		return ffzsqtdwlx;
	}
	public void setFfzsqtdwlx(String ffzsqtdwlx) {
		this.ffzsqtdwlx = ffzsqtdwlx;
	}
	public String getFfzsqtdwmc() {
		return ffzsqtdwmc;
	}
	public void setFfzsqtdwmc(String ffzsqtdwmc) {
		this.ffzsqtdwmc = ffzsqtdwmc;
	}
	public Date getFfsx() {
		return ffsx;
	}
	public void setFfsx(Date ffsx) {
		this.ffsx = ffsx;
	}
	public boolean isSfff() {
		return sfff;
	}
	public void setSfff(boolean sfff) {
		this.sfff = sfff;
	}
	public Date getBlsx() {
		return blsx;
	}
	public void setBlsx(Date blsx) {
		this.blsx = blsx;
	}
	public boolean isSfbj() {
		return sfbj;
	}
	public void setSfbj(boolean sfbj) {
		this.sfbj = sfbj;
	}
	public Date getFksx() {
		return fksx;
	}
	public void setFksx(Date fksx) {
		this.fksx = fksx;
	}
	public boolean isSffk() {
		return sffk;
	}
	public void setSffk(boolean sffk) {
		this.sffk = sffk;
	}
	public Date getHcsx() {
		return hcsx;
	}
	public void setHcsx(Date hcsx) {
		this.hcsx = hcsx;
	}
	public boolean isSfhc() {
		return sfhc;
	}
	public void setSfhc(boolean sfhc) {
		this.sfhc = sfhc;
	}
	public boolean isSfps() {
		return sfps;
	}
	public void setSfps(boolean sfps) {
		this.sfps = sfps;
	}
	public boolean isSfjl() {
		return sfjl;
	}
	public void setSfjl(boolean sfjl) {
		this.sfjl = sfjl;
	}
	public boolean isSfzacl() {
		return sfzacl;
	}
	public void setSfzacl(boolean sfzacl) {
		this.sfzacl = sfzacl;
	}
	public boolean isSfgd() {
		return sfgd;
	}
	public void setSfgd(boolean sfgd) {
		this.sfgd = sfgd;
	}
	public String getGdlxid() {
		return gdlxid;
	}
	public void setGdlxid(String gdlxid) {
		this.gdlxid = gdlxid;
	}
	public String getGdms() {
		return gdms;
	}
	public void setGdms(String gdms) {
		this.gdms = gdms;
	}
	public String getAcceptid() {
		return acceptid;
	}
	
}
