package com.impart.xinfang.domain;

import java.util.Date;

/**2
 * 处理情况表：举报投诉明细表
 * @author Administrator
 *
 */
public class Acceptdeal {
	
	private String acceptid;//受理编号  :与accept关联
	private String itemid;//办理编号
	private Date acceptTime;//办理时间 
	private Date acceptType;//办件类别
	private String acceptName;//承办人
	private String unitCode;//承办单位编号
	private String unitName;//承办单位
	private String opinion;//办理内容
	private String idea1;//局长定稿反馈
	private String idea2;//科长审核反馈
	private String idea3;//分管审核反馈
	private String idea4;//科长办结反馈
	private String idea5;//阅办意见
	private String idea6;//阅示意见
	private Date ideaTime1;//局长定稿时间
	private Date ideaTime2;//科长审核
	private Date ideaTime3;//分管审核（呈）
	private Date ideaTime4;//科长办结
	private Date ideaTime5;//承办单位办理
	private Date ideaTime6;//市领导审核
	private String tjpsbm;//提交批示部门  :提交审批
	private String tjpsld;//提交批示领导
	private String nbyj;//拟办意见
	private Boolean tjpssfcy;	//提交批示是否查阅  ：是否黑体
	private Date pssj;	//批示时间  ：审批
	private String psld;//批示领导  ：（人员姓名）
	private String psyj;//批示意见
	private String cbdw;//承办单位（代码） :分发
	private String cbr;//承办人（主）  :（编号）
	private String xbr;//协办人  （编号）
	private Date blsx;	//办理时限
	private String blyq;//办理要求
	private Boolean zaz;	 //是否专案办理  :专案办理
	private String zazcy;//专案组成员  :（人员姓名）
	private String zazms;//专案描述
	private Boolean ffsfcy;//分发是否查阅  :是否黑体
	private Date hcsj;	//核查时间   :办理
	private String hcry;//核查人员  :（人员姓名）
	private String hcqk;//核查情况  :办理
	private int sfss;//tinyint  是否属实
	private String ccqk;//查处情况
	private Date bjsj;	//办结时间
	private Date fksj;	//反馈时间
	private String fklx;//反馈类型  :（办理反馈、奖励反馈）
	private String fkdxlx;//反馈对象类型  :（投诉人、单位）
	private String fkdwdm;//反馈单位代码   :（类型＝单位）
	private String fkdwry;//反馈单位人员
	private String fknr;//反馈内容
	private Boolean fksfcy;//反馈是否查阅  :查阅后就不提醒了
	private Date jlsj;	//奖励时间
	private String jlnr;//奖励内容
	private Date jllqsx;//奖励领取时限  :[告知]
	private String jllqtj;//奖励领取途径
	private String jllqed;//奖励领取额度
	private Date jllqsj;	//奖励领取时间  :是否领奖
	public String getAcceptid() {
		return acceptid;
	}
	public void setAcceptid(String acceptid) {
		this.acceptid = acceptid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public Date getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}
	public Date getAcceptType() {
		return acceptType;
	}
	public void setAcceptType(Date acceptType) {
		this.acceptType = acceptType;
	}
	public String getAcceptName() {
		return acceptName;
	}
	public void setAcceptName(String acceptName) {
		this.acceptName = acceptName;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public String getIdea1() {
		return idea1;
	}
	public void setIdea1(String idea1) {
		this.idea1 = idea1;
	}
	public String getIdea2() {
		return idea2;
	}
	public void setIdea2(String idea2) {
		this.idea2 = idea2;
	}
	public String getIdea3() {
		return idea3;
	}
	public void setIdea3(String idea3) {
		this.idea3 = idea3;
	}
	public String getIdea4() {
		return idea4;
	}
	public void setIdea4(String idea4) {
		this.idea4 = idea4;
	}
	public String getIdea5() {
		return idea5;
	}
	public void setIdea5(String idea5) {
		this.idea5 = idea5;
	}
	public String getIdea6() {
		return idea6;
	}
	public void setIdea6(String idea6) {
		this.idea6 = idea6;
	}
	public Date getIdeaTime1() {
		return ideaTime1;
	}
	public void setIdeaTime1(Date ideaTime1) {
		this.ideaTime1 = ideaTime1;
	}
	public Date getIdeaTime2() {
		return ideaTime2;
	}
	public void setIdeaTime2(Date ideaTime2) {
		this.ideaTime2 = ideaTime2;
	}
	public Date getIdeaTime3() {
		return ideaTime3;
	}
	public void setIdeaTime3(Date ideaTime3) {
		this.ideaTime3 = ideaTime3;
	}
	public Date getIdeaTime4() {
		return ideaTime4;
	}
	public void setIdeaTime4(Date ideaTime4) {
		this.ideaTime4 = ideaTime4;
	}
	public Date getIdeaTime5() {
		return ideaTime5;
	}
	public void setIdeaTime5(Date ideaTime5) {
		this.ideaTime5 = ideaTime5;
	}
	public Date getIdeaTime6() {
		return ideaTime6;
	}
	public void setIdeaTime6(Date ideaTime6) {
		this.ideaTime6 = ideaTime6;
	}
	public String getTjpsbm() {
		return tjpsbm;
	}
	public void setTjpsbm(String tjpsbm) {
		this.tjpsbm = tjpsbm;
	}
	public String getTjpsld() {
		return tjpsld;
	}
	public void setTjpsld(String tjpsld) {
		this.tjpsld = tjpsld;
	}
	public String getNbyj() {
		return nbyj;
	}
	public void setNbyj(String nbyj) {
		this.nbyj = nbyj;
	}
	public Boolean getTjpssfcy() {
		return tjpssfcy;
	}
	public void setTjpssfcy(Boolean tjpssfcy) {
		this.tjpssfcy = tjpssfcy;
	}
	public Date getPssj() {
		return pssj;
	}
	public void setPssj(Date pssj) {
		this.pssj = pssj;
	}
	public String getPsld() {
		return psld;
	}
	public void setPsld(String psld) {
		this.psld = psld;
	}
	public String getPsyj() {
		return psyj;
	}
	public void setPsyj(String psyj) {
		this.psyj = psyj;
	}
	public String getCbdw() {
		return cbdw;
	}
	public void setCbdw(String cbdw) {
		this.cbdw = cbdw;
	}
	public String getCbr() {
		return cbr;
	}
	public void setCbr(String cbr) {
		this.cbr = cbr;
	}
	public String getXbr() {
		return xbr;
	}
	public void setXbr(String xbr) {
		this.xbr = xbr;
	}
	public Date getBlsx() {
		return blsx;
	}
	public void setBlsx(Date blsx) {
		this.blsx = blsx;
	}
	public String getBlyq() {
		return blyq;
	}
	public void setBlyq(String blyq) {
		this.blyq = blyq;
	}
	public Boolean getZaz() {
		return zaz;
	}
	public void setZaz(Boolean zaz) {
		this.zaz = zaz;
	}
	public String getZazcy() {
		return zazcy;
	}
	public void setZazcy(String zazcy) {
		this.zazcy = zazcy;
	}
	public String getZazms() {
		return zazms;
	}
	public void setZazms(String zazms) {
		this.zazms = zazms;
	}
	public Boolean getFfsfcy() {
		return ffsfcy;
	}
	public void setFfsfcy(Boolean ffsfcy) {
		this.ffsfcy = ffsfcy;
	}
	public Date getHcsj() {
		return hcsj;
	}
	public void setHcsj(Date hcsj) {
		this.hcsj = hcsj;
	}
	public String getHcry() {
		return hcry;
	}
	public void setHcry(String hcry) {
		this.hcry = hcry;
	}
	public String getHcqk() {
		return hcqk;
	}
	public void setHcqk(String hcqk) {
		this.hcqk = hcqk;
	}
	public int getSfss() {
		return sfss;
	}
	public void setSfss(int sfss) {
		this.sfss = sfss;
	}
	public String getCcqk() {
		return ccqk;
	}
	public void setCcqk(String ccqk) {
		this.ccqk = ccqk;
	}
	public Date getBjsj() {
		return bjsj;
	}
	public void setBjsj(Date bjsj) {
		this.bjsj = bjsj;
	}
	public Date getFksj() {
		return fksj;
	}
	public void setFksj(Date fksj) {
		this.fksj = fksj;
	}
	public String getFklx() {
		return fklx;
	}
	public void setFklx(String fklx) {
		this.fklx = fklx;
	}
	public String getFkdxlx() {
		return fkdxlx;
	}
	public void setFkdxlx(String fkdxlx) {
		this.fkdxlx = fkdxlx;
	}
	public String getFkdwdm() {
		return fkdwdm;
	}
	public void setFkdwdm(String fkdwdm) {
		this.fkdwdm = fkdwdm;
	}
	public String getFkdwry() {
		return fkdwry;
	}
	public void setFkdwry(String fkdwry) {
		this.fkdwry = fkdwry;
	}
	public String getFknr() {
		return fknr;
	}
	public void setFknr(String fknr) {
		this.fknr = fknr;
	}
	public Boolean getFksfcy() {
		return fksfcy;
	}
	public void setFksfcy(Boolean fksfcy) {
		this.fksfcy = fksfcy;
	}
	public Date getJlsj() {
		return jlsj;
	}
	public void setJlsj(Date jlsj) {
		this.jlsj = jlsj;
	}
	public String getJlnr() {
		return jlnr;
	}
	public void setJlnr(String jlnr) {
		this.jlnr = jlnr;
	}
	public Date getJllqsx() {
		return jllqsx;
	}
	public void setJllqsx(Date jllqsx) {
		this.jllqsx = jllqsx;
	}
	public String getJllqtj() {
		return jllqtj;
	}
	public void setJllqtj(String jllqtj) {
		this.jllqtj = jllqtj;
	}
	public String getJllqed() {
		return jllqed;
	}
	public void setJllqed(String jllqed) {
		this.jllqed = jllqed;
	}
	public Date getJllqsj() {
		return jllqsj;
	}
	public void setJllqsj(Date jllqsj) {
		this.jllqsj = jllqsj;
	}
	@Override
	public String toString() {
		return "Acceptdeal [acceptid=" + acceptid + ", itemid=" + itemid
				+ ", acceptTime=" + acceptTime + ", acceptType=" + acceptType
				+ ", acceptName=" + acceptName + ", unitCode=" + unitCode
				+ ", unitName=" + unitName + ", opinion=" + opinion
				+ ", idea1=" + idea1 + ", idea2=" + idea2 + ", idea3=" + idea3
				+ ", idea4=" + idea4 + ", idea5=" + idea5 + ", idea6=" + idea6
				+ ", ideaTime1=" + ideaTime1 + ", ideaTime2=" + ideaTime2
				+ ", ideaTime3=" + ideaTime3 + ", ideaTime4=" + ideaTime4
				+ ", ideaTime5=" + ideaTime5 + ", ideaTime6=" + ideaTime6
				+ ", tjpsbm=" + tjpsbm + ", tjpsld=" + tjpsld + ", nbyj="
				+ nbyj + ", tjpssfcy=" + tjpssfcy + ", pssj=" + pssj
				+ ", psld=" + psld + ", psyj=" + psyj + ", cbdw=" + cbdw
				+ ", cbr=" + cbr + ", xbr=" + xbr + ", blsx=" + blsx
				+ ", blyq=" + blyq + ", zaz=" + zaz + ", zazcy=" + zazcy
				+ ", zazms=" + zazms + ", ffsfcy=" + ffsfcy + ", hcsj=" + hcsj
				+ ", hcry=" + hcry + ", hcqk=" + hcqk + ", sfss=" + sfss
				+ ", ccqk=" + ccqk + ", bjsj=" + bjsj + ", fksj=" + fksj
				+ ", fklx=" + fklx + ", fkdxlx=" + fkdxlx + ", fkdwdm="
				+ fkdwdm + ", fkdwry=" + fkdwry + ", fknr=" + fknr
				+ ", fksfcy=" + fksfcy + ", jlsj=" + jlsj + ", jlnr=" + jlnr
				+ ", jllqsx=" + jllqsx + ", jllqtj=" + jllqtj + ", jllqed="
				+ jllqed + ", jllqsj=" + jllqsj + "]";
	}
}
