package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OperateLog implements java.io.Serializable {

	private static final long serialVersionUID = -1568703635377022016L;
	
	private BigDecimal operateLogId;
	private User user;
	private Date operateTime;
	private String remark;
	
	public BigDecimal getOperateLogId() {
		return operateLogId;
	}
	public void setOperateLogId(BigDecimal operateLogId) {
		this.operateLogId = operateLogId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}