package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Film implements java.io.Serializable {

	private static final long serialVersionUID = 5176061542123321560L;
	
	private BigDecimal filmId;
	private String filmName;
	private Date releaseDate;
	private BigDecimal gradeTime;
	private String introduce;
	private String svgGrade;
	private String area;
	private String mins;
	private String fee;
	private String letter;
	private String language;
	private BigDecimal playCount;
	private String director;
	private String cover;
	private String remark;
	private List<Actor> actorList;
	private List<Type> typeList;
	private Set<Image> images = new HashSet<Image>();
	private Set<Type> types = new HashSet<Type>();
	private Set<Path> paths = new HashSet<Path>();
	private Set<Actor> actors = new HashSet<Actor>();
	private Set<Recommend> recommends = new HashSet<Recommend>();
	private Set<FilmUser> filmUsers = new HashSet<FilmUser>();
	
	public List<Actor> getActorList() {
		return actorList;
	}

	public void setActorList(List<Actor> actorList) {
		this.actorList = actorList;
	}
	
	public List<Type> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Type> typeList) {
		this.typeList = typeList;
	}

	public Film() {
		super();
	}

	public Film(BigDecimal filmId, String filmName, Date releaseDate, BigDecimal gradeTime, String introduce,
			String svgGrade, String area, String mins, String fee, String letter, String language, BigDecimal playCount,
			String director, String remark) {
		super();
		this.filmId = filmId;
		this.filmName = filmName;
		this.releaseDate = releaseDate;
		this.gradeTime = gradeTime;
		this.introduce = introduce;
		this.svgGrade = svgGrade;
		this.area = area;
		this.mins = mins;
		this.fee = fee;
		this.letter = letter;
		this.language = language;
		this.playCount = playCount;
		this.director = director;
		this.remark = remark;
	}
	
	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getMins() {
		return mins;
	}
	public void setMins(String mins) {
		this.mins = mins;
	}
	public BigDecimal getFilmId() {
		return filmId;
	}
	public void setFilmId(BigDecimal filmId) {
		this.filmId = filmId;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public BigDecimal getGradeTime() {
		return gradeTime;
	}
	public void setGradeTime(BigDecimal gradeTime) {
		this.gradeTime = gradeTime;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getSvgGrade() {
		return svgGrade;
	}
	public void setSvgGrade(String svgGrade) {
		this.svgGrade = svgGrade;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public BigDecimal getPlayCount() {
		return playCount;
	}
	public void setPlayCount(BigDecimal playCount) {
		this.playCount = playCount;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set<Image> getImages() {
		return images;
	}
	public void setImages(Set<Image> images) {
		this.images = images;
	}
	public Set<Type> getTypes() {
		return types;
	}
	public void setTypes(Set<Type> types) {
		this.types = types;
	}
	public Set<Path> getPaths() {
		return paths;
	}
	public void setPaths(Set<Path> paths) {
		this.paths = paths;
	}
	public Set<Actor> getActors() {
		return actors;
	}
	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}
	public Set<Recommend> getRecommends() {
		return recommends;
	}
	public void setRecommends(Set<Recommend> recommends) {
		this.recommends = recommends;
	}
	public Set<FilmUser> getFilmUsers() {
		return filmUsers;
	}
	public void setFilmUsers(Set<FilmUser> filmUsers) {
		this.filmUsers = filmUsers;
	}
	
	

}