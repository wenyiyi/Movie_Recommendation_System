/**
 * @(#)FilmDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月29日
 */
package com.dao;

import java.math.BigDecimal;
import java.util.List;

import com.base.DaoSupport;
import com.domain.Actor;
import com.domain.Film;
import com.domain.Image;
import com.domain.Type;

/**
 * TODO 填写功能说明
 * @author 文一梅
 */
public interface FilmDao extends DaoSupport<Film>{

	/**
	 * TODO 通过分页查找电影
	 * @return
	 */
	public List<Film> findAllByPage(int pageNum,int pageSize);
	
	/**
	 * 根据电影id查找电影的封面图片
	 * @param filmId
	 * @return
	 */
	public Image getCoverByFilmId(BigDecimal filmId);
	
	/**
	 * 根据电影id查找电影的相关图片
	 */
	public List<Image> getImagesByFilmId(BigDecimal filmId);
	
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
