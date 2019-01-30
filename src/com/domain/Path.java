package com.domain;

import java.math.BigDecimal;

public class Path implements java.io.Serializable {

	private static final long serialVersionUID = -5902747321300503956L;
	
	private BigDecimal pathId;
	private Film film;
	private String pathURL;
	private String remark;
	
	public BigDecimal getPathId() {
		return pathId;
	}
	public void setPathId(BigDecimal pathId) {
		this.pathId = pathId;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public String getPathURL() {
		return pathURL;
	}
	public void setPathURL(String pathURL) {
		this.pathURL = pathURL;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}