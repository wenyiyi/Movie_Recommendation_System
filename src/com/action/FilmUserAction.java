/**
 * @(#)ActorAction.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.action;

import java.math.BigDecimal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.base.BaseAction;
import com.domain.Film;
import com.domain.FilmUser;
import com.domain.FilmUserId;
import com.domain.User;

@Controller
@Scope("prototype")
public class FilmUserAction extends BaseAction<FilmUser>{

	private static final long serialVersionUID = 6072769925794854258L;
	private BigDecimal filmId;
	private BigDecimal userId;
	
	public BigDecimal getFilmId() {
		return filmId;
	}

	public void setFilmId(BigDecimal filmId) {
		this.filmId = filmId;
	}

	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}
	/**
	 * 保存用户的评分
	 */
	public void save(){
		FilmUser filmUser = filmUserService.getByFilmIdAndUserId(filmId, userId);
		if(filmUser==null){
			id();
			filmUserService.save(model);
		}else{
			id();
			filmUserService.updateScore(filmId, userId, model.getScore());
		}
	}
	/**
	 * 更新用户的观看时长
	 */
	public void update(){
		id();
		filmUserService.updateWatchTime(filmId, userId, model.getWatchTime());
	}
	
	/**
	 * 为复合主键赋值
	 */
	public void id(){
		FilmUserId id = new FilmUserId();
		Film film = new Film();
		film.setFilmId(filmId);
		User user = new User();
		user.setUserId(userId);
		id.setFilm(film);
		id.setUser(user);
		model.setId(id);
	}
	
	public void exportCsv(){
		filmUserService.exportCsv();
	}
}
