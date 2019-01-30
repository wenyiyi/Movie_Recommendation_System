package com.domain;

import java.util.Date;

public class Recommend implements java.io.Serializable {

	private static final long serialVersionUID = 3531804174172103365L;
	
	private RecommendId id;
	private Float value;
	private Date recommendTime;
	private String remark;
	
	public RecommendId getId() {
		return id;
	}
	public void setId(RecommendId id) {
		this.id = id;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public Date getRecommendTime() {
		return recommendTime;
	}
	public void setRecommendTime(Date recommendTime) {
		this.recommendTime = recommendTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}