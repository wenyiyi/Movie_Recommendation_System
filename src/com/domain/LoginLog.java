package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class LoginLog implements java.io.Serializable {

	private static final long serialVersionUID = 6428036463097938422L;
	
	private BigDecimal loginlogId;
	private User user;
	private Date loginTime;
	private String remark;
	
	public BigDecimal getLoginlogId() {
		return loginlogId;
	}
	public void setLoginlogId(BigDecimal loginlogId) {
		this.loginlogId = loginlogId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}