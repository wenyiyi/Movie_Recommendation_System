package com.domain;

import java.math.BigDecimal;

public class Image implements java.io.Serializable {

	private static final long serialVersionUID = 8791843178700620483L;
	
	private BigDecimal imageId;
	private User user;
	private Film film;
	private String imageURL;
	private String remark;
	
	public BigDecimal getImageId() {
		return imageId;
	}
	public void setImageId(BigDecimal imageId) {
		this.imageId = imageId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}