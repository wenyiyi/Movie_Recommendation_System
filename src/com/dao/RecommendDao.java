/**
 * @(#)RecommendDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨甲骨文培训基地  版权所有
 * Create by:	文一梅  2016年12月24日
 */
package com.dao;

import java.math.BigDecimal;
import java.util.List;

import com.base.DaoSupport;
import com.domain.Recommend;

/**
 * TODO 填写功能说明
 * @author 文一梅
 */
public interface RecommendDao extends DaoSupport<Recommend>{
	
	//根据用户id查找推荐的列表，按推荐值排序
	public List<Recommend> getRecomByUserId(BigDecimal userId);
	
	//根据用户id和电影id查找推荐的记录
	public Recommend getRecomByUserIdAndFilmId(BigDecimal userId,BigDecimal filmId);
	
}
