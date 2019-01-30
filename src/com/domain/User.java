package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable {

	private static final long serialVersionUID = -199648432875285187L;
	
	private BigDecimal userId;
	private String username;
	private String password;
	private String age;
	private String gender;
	private String phoneNumber;
	private String nickname;
	private String occupation;
	private String qq;
	private String mailbox;
	private String favorite;
	private Date registerTime;
	private Date logoutTime;
	private String truename;
	private String remark;
	private Set<FilmUser> filmUsers = new HashSet<FilmUser>();
	private Set<Label> labels = new HashSet<Label>();
	private Set<LoginLog> loginLogs = new HashSet<LoginLog>();
	private Set<Image> images = new HashSet<Image>();
	private Set<Recommend> recommends = new HashSet<Recommend>();
	private Set<Role> roles = new HashSet<Role>();
	private Set<OperateLog> operateLogs = new HashSet<OperateLog>();
	private Set<Address> addresses = new HashSet<Address>();
	
	public User() {
		super();
	}

	public User(BigDecimal userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<FilmUser> getFilmUsers() {
		return filmUsers;
	}

	public void setFilmUsers(Set<FilmUser> filmUsers) {
		this.filmUsers = filmUsers;
	}

	public Set<Label> getLabels() {
		return labels;
	}

	public void setLabels(Set<Label> labels) {
		this.labels = labels;
	}

	public Set<LoginLog> getLoginLogs() {
		return loginLogs;
	}

	public void setLoginLogs(Set<LoginLog> loginLogs) {
		this.loginLogs = loginLogs;
	}

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	public Set<Recommend> getRecommends() {
		return recommends;
	}

	public void setRecommends(Set<Recommend> recommends) {
		this.recommends = recommends;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<OperateLog> getOperateLogs() {
		return operateLogs;
	}

	public void setOperateLogs(Set<OperateLog> operateLogs) {
		this.operateLogs = operateLogs;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
}