package com.impart.xinfang.domain;

import java.util.Date;

/**
 * �ٱ�Ͷ�߱�
 * @author ֣����
 * @version 1.0 2016-02-01
 */
public class Accept {

	private String acceptid;//���
	private Date acceptDate;//��������
	private String callNum;//�绰����
	private String acceptType;//��������
	private String callType;//Ͷ�߷�ʽ
	private String fname;//��ӳ��
	private String faddress;//��ַ
	private String fcontact;//��ϵ��ʽ
	private String backContact;//�𸴷�ʽ
	private String femail;//��ӳ��email
	private int fnum;//��ӳ������
	private int cfqc;//�Ƿ����ظ���
	private String fmatter;//��ӳ����
	private String bname;//����ӳ��
	private String bunit;//����ӳ�˵�λ
	private String baddress;//����ӳ�˵�ַ
	private String bjb;//����ӳ�˼���
	private String allowNet;//�������Ϸ���
	private String cbdw;//���а쵥λ
	private String lzdw;//��ת��λ
	private String result;//������
	private int acceptState;//����״̬
	private String secret;//���ܵȼ�
	private String remark;//��ע
	private String circulate;//��ת����
	private String userid;//��ϯ����
	private String recFile;//¼���ļ���
	private String reader;//���ߣ�ָʾ������˭����
	private int objectState;//�ύ״̬
	private boolean sfnm;//�Ƿ�����
	private boolean sfyj;//�Ƿ�Ҫ��
	private boolean sfsw;//�Ƿ�����
	private String xm;//��Ŀ
	private String xmzl;//��Ŀ����
	private int isExchanged;//��0
	private String postCode;//��������
	private String user_type;//��ӳ�����
	private String farea;//��ӳ�˵���
	private String cfjid;//�ظ����
	private String onturn;//��ֵ����
	private String onturnDepart;//��ֵ����
	private String onturnLeader;//��ֵ�쵼
	private int cfcs;//�ظ�����
	private String hfjg;//�طý��
	private String hfryj;//�ط������
	private Date hfsj;//�ط�ʱ��
	private String sfxcxd;//�ֳ��ж�
	private String lzblqk;//��ֵ�������
	private String lzbmlb;//��ֵ�������
	private String dealType;//������������,ȷ�ϡ��ر�����
	private String ffzsqtdwlx;//�ַ�ת��������λ���ͣ��ͼ졢��������
	private String ffzsqtdwmc;//�ַ�ת��������λ���ƣ��ͼ첿�š�������λ����
	private Date ffsx;//�ַ�ʱ�ޣ�Ĭ��һ��������
	private boolean sfff;//�Ƿ�ַ�
	private Date blsx;//����ʱ�ޣ����ʱ��Ҫ��
	private boolean sfbj;//�Ƿ���
	private Date fksx;//����ʱ�ޣ�5�������ո�Ͷ����
	private boolean sffk;//�Ƿ���
	private Date hcsx;//�˲�ʱ�ޣ�24Сʱ���������ͣ�
	private boolean sfhc;//�Ƿ�˲�
	private boolean sfps;//�Ƿ���ʾ
	private boolean sfjl;//�Ƿ���
	private boolean sfzacl;//�Ƿ�ר������
	private boolean sfgd;//�Ƿ�鵵
	private String gdlxid;//�鵵����id
	private String gdms;//�鵵����
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
