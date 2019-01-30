/**
 * @(#)ActorService.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service;

import java.math.BigDecimal;
import java.util.List;

import com.domain.Recommend;

public interface RecommendService {

	//根据用户id查找推荐的电影列表，按推荐值排序
	public List<Recommend> getRecomByUserId(BigDecimal userId);
	//保存记录
	public void save();
	
	//根据用户id和电影id查找推荐的记录
	public Recommend getRecomByUserIdAndFilmId(BigDecimal userId,BigDecimal filmId);
}
