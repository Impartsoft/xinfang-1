package com.impart.xinfang.domain;

/**
 * 自动语音表
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class AutoWavFile {

	private String autoWavFileid;//语音表id
	private String wavFileName;//语音文件名
	private String wavTitle;//语音标题
	private String wavDescribe;//内容描述
	private int keyPress;//按键
	private boolean seatService;//是否转坐席
	private boolean ttsFlag;//是否tts
	private boolean recFlag;//是否播放录音
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
