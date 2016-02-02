package com.impart.xinfang.domain;
/**10
 * 部门电话（departstaffphone）
 * @author Administrator
 *
 */
public class Departstaffphone {
	private String departStaffid;  //部门编号  varchar2(20)  not null
	private int itemid;  //子表id  number(4, 0)  not null 
	private String phoneType;  //电话类型  varchar2(20)
	private String phone;  //电话号码  varchar2(20)
	private int mainFlag;  //主联系标志  number(1, 0)
	public String getDepartStaffid() {
		return departStaffid;
	}
	public void setDepartStaffid(String departStaffid) {
		this.departStaffid = departStaffid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getMainFlag() {
		return mainFlag;
	}
	public void setMainFlag(int mainFlag) {
		this.mainFlag = mainFlag;
	}
	@Override
	public String toString() {
		return "Departstaffphone [departStaffid=" + departStaffid + ", itemid="
				+ itemid + ", phoneType=" + phoneType + ", phone=" + phone
				+ ", mainFlag=" + mainFlag + "]";
	}
}
