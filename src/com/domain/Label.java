package com.domain;

import java.util.HashSet;
import java.util.Set;

public class Label implements java.io.Serializable {

	private static final long serialVersionUID = -7614885446879894862L;
	
	private Short labelId;
	private String labelName;
	private String remark;
	private Set<User> users = new HashSet<User>();
	
	public Short getLabelId() {
		return labelId;
	}
	public void setLabelId(Short labelId) {
		this.labelId = labelId;
	}
	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}