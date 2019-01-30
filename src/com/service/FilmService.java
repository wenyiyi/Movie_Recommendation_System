/**
 * @(#)FilmService.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service;

import java.math.BigDecimal;
import java.util.List;

import com.domain.Actor;
import com.domain.Film;
import com.domain.Image;
import com.domain.Type;

public interface FilmService {
	/**
	 * TODO 根据电影id查找电影的封面图
	 */
	public Image getCoverByFilmId(BigDecimal filmId);
	/**
	 * 根据电影id获取电影的相关图片
	 */
	public List<Image> getImagesByFilmId(BigDecimal filmId);
	/**
	 * TODO 保存电影
	 */
	public void save(Film film);
	
	/**
	 * TODO 分页查找电影
	 */
	public List<Film> findAllByPage(int pageNum,int pageSize);
	
	/**
	 * 获取电影的总数
	 */
	public int getPages();
	
	/**
	 * 根据电影id查找演员
	 */
	public List<Actor> getActorsByFilmId(BigDecimal filmId);
	
	/**
	 * 根据电影id查找电影
	 */
	public Film getFilmByFilmId(BigDecimal filmId);
	
	/**
	 * 根据电影id查找类型
	 */
	public List<Type> getTypesByFilmId(BigDecimal filmId);

	/**
	 * 将电影按评分排序，取前4部
	 */
	public List<Film> getFilmOrderBySvgGrade();
}
