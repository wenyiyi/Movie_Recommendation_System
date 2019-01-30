package com.domain;

import java.util.HashSet;
import java.util.Set;

public class Type implements java.io.Serializable {

	private static final long serialVersionUID = 5747202718230121929L;
	
	private Short typeId;
	private String typeName;
	private String remark;
	private Set<Film> films = new HashSet<Film>();
	
	public Short getTypeId() {
		return typeId;
	}
	public void setTypeId(Short typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
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