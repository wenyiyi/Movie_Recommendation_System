package com.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Actor entity. @author MyEclipse Persistence Tools
 */

public class Actor implements java.io.Serializable {

	private static final long serialVersionUID = 1860856915044727219L;

	private BigDecimal actorId;
	private String actorName;
	private String nationality;
	private String detail;
	private String remark;
	private Set<Film> films = new HashSet<Film>();
	
	public BigDecimal getActorId() {
		return actorId;
	}
	public void setActorId(BigDecimal actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set<Film> getFilms() {
		return films;
	}
	public void setFilms(Set<Film> films) {
		this.films = films;
	}

}