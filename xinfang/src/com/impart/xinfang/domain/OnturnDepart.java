package com.impart.xinfang.domain;

/**
 * ��ֵ����
 * @author ֣����
 * @version 1.0 016-02-02
 */
public class OnturnDepart {

	private String departid;//����id
	private String departType;//����
	private String departName;//��������
	private int sort;//����
	public String getDepartType() {
		return departType;
	}
	public void setDepartType(String departType) {
		this.departType = departType;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public String getDepartid() {
		return departid;
	}
	
}
