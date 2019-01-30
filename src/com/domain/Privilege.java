package com.domain;

import java.util.HashSet;
import java.util.Set;

public class Privilege implements java.io.Serializable {

	private static final long serialVersionUID = -8000994583238966457L;
	
	private Short privilegeId;
	private String privilegeName;
	private String url;
	private String remark;
	private Set<Role> roles = new HashSet<Role>();
	
	public Short getPrivilegeId() {
		return privilegeId;
	}
	public void setPrivilegeId(Short privilegeId) {
		this.privilegeId = privilegeId;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}