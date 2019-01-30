/**
 * @(#)ActorService.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service;

import java.math.BigDecimal;

import com.domain.FilmUser;

public interface FilmUserService {
	/**
	 * TODO 保存一个实体
	 */
	public void save(FilmUser filmUser);
	
	/**
	 * 通过用户id和电影id修改score字段
	 */
	public void updateScore(BigDecimal filmId,BigDecimal userId,Short score);
	
	/**
	 * 通过用户id和电影id修改watchTime字段
	 */
	public void updateWatchTime(BigDecimal filmId,BigDecimal userId,String watchTime);
	
	/**
	 * 通过用户id和电影id获取记录
	 */
	public FilmUser getByFilmIdAndUserId(BigDecimal filmId,BigDecimal userId);
	/**
	 * 通过用户id获取记录
	 */
	public void getByUserId(BigDecimal userId);
	/**
	 * 将记录写出到csv文件
	 */
	public void exportCsv();
}
