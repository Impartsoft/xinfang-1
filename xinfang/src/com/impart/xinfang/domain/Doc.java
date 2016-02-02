package com.impart.xinfang.domain;

import javax.websocket.Decoder.Text;
/**
 * 12文档（doc）
 * @author Administrator
 *
 */
public class Doc {
private int docid;  //编号  int
private String docKey;  //文档编号  varchar  用于生成树
private String docChapter;  //章节名  varchar
private String docText;  //搜索内容  varchar
private String docType;  //类型  varchar
private Text docFile;  //文件  Text
public int getDocid() {
	return docid;
}
public void setDocid(int docid) {
	this.docid = docid;
}
public String getDocKey() {
	return docKey;
}
public void setDocKey(String docKey) {
	this.docKey = docKey;
}
public String getDocChapter() {
	return docChapter;
}
public void setDocChapter(String docChapter) {
	this.docChapter = docChapter;
}
public String getDocText() {
	return docText;
}
public void setDocText(String docText) {
	this.docText = docText;
}
public String getDocType() {
	return docType;
}
public void setDocType(String docType) {
	this.docType = docType;
}
public Text getDocFile() {
	return docFile;
}
public void setDocFile(Text docFile) {
	this.docFile = docFile;
}
@Override
public String toString() {
	return "Doc [docid=" + docid + ", docKey=" + docKey + ", docChapter="
			+ docChapter + ", docText=" + docText + ", docType=" + docType
			+ ", docFile=" + docFile + "]";
}
}
