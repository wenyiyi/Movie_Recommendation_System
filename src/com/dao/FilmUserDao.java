/**
 * @(#)FilmUserDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨甲骨文培训基地  版权所有
 * Create by:	文一梅  2016年12月24日
 */
package com.dao;

import java.math.BigDecimal;
import java.util.List;

import com.base.DaoSupport;
import com.domain.FilmUser;

/**
 * TODO 填写功能说明
 * @author 文一梅
 */
public interface FilmUserDao extends DaoSupport<FilmUser>{
	/**
	 * 通过用户id和电影id获取记录
	 */
	public FilmUser getByFilmIdAndUserId(BigDecimal filmId,BigDecimal userId);
	
	/**
	 * 通过用户id获取记录
	 */
	public List<FilmUser> getByUserId(BigDecimal userId);

	/**
	 * 通过用户id和电影id修改score字段
	 */
	public void updateScore(BigDecimal filmId,BigDecimal userId,Short score);
	
	/**
	 * 通过用户id和电影id修改watchTime字段
	 */
	public void updateWatchTime(BigDecimal filmId,BigDecimal userId,String watchTime);
	
}
