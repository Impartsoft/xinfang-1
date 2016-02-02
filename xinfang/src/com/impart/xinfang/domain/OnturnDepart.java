package com.impart.xinfang.domain;

/**
 * 轮值部门
 * @author 郑宝林
 * @version 1.0 016-02-02
 */
public class OnturnDepart {

	private String departid;//部门id
	private String departType;//类型
	private String departName;//部门名称
	private int sort;//排序
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
