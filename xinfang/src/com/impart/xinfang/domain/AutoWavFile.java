package com.impart.xinfang.domain;

/**
 * �Զ�������
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class AutoWavFile {

	private String autoWavFileid;//������id
	private String wavFileName;//�����ļ���
	private String wavTitle;//��������
	private String wavDescribe;//��������
	private int keyPress;//����
	private boolean seatService;//�Ƿ�ת��ϯ
	private boolean ttsFlag;//�Ƿ�tts
	private boolean recFlag;//�Ƿ񲥷�¼��
	public String getWavFileName() {
		return wavFileName;
	}
	public void setWavFileName(String wavFileName) {
		this.wavFileName = wavFileName;
	}
	public String getWavTitle() {
		return wavTitle;
	}
	public void setWavTitle(String wavTitle) {
		this.wavTitle = wavTitle;
	}
	public String getWavDescribe() {
		return wavDescribe;
	}
	public void setWavDescribe(String wavDescribe) {
		this.wavDescribe = wavDescribe;
	}
	public int getKeyPress() {
		return keyPress;
	}
	public void setKeyPress(int keyPress) {
		this.keyPress = keyPress;
	}
	public boolean isSeatService() {
		return seatService;
	}
	public void setSeatService(boolean seatService) {
		this.seatService = seatService;
	}
	public boolean isTtsFlag() {
		return ttsFlag;
	}
	public void setTtsFlag(boolean ttsFlag) {
		this.ttsFlag = ttsFlag;
	}
	public boolean isRecFlag() {
		return recFlag;
	}
	public void setRecFlag(boolean recFlag) {
		this.recFlag = recFlag;
	}
	public String getAutoWavFileid() {
		return autoWavFileid;
	}
	
}
