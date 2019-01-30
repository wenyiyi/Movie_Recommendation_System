/**
 * @(#)RecommendDaoImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨甲骨文培训基地  版权所有
 * Create by:	文一梅  2016年12月24日
 */
package com.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.DaoSupportImpl;
import com.dao.RecommendDao;
import com.domain.Recommend;

@Repository
@Transactional
public class RecommendDaoImpl extends DaoSupportImpl<Recommend> implements RecommendDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Recommend> getRecomByUserId(BigDecimal userId) {
		return getSession()
				.createQuery("select r FROM Recommend r join r.id i join i.user u where u.userId=? order by r.value desc")
				.setParameter(0, userId)
				.setFirstResult(0)
				.setMaxResults(4)
				.list();
	}
	
	public Recommend getRecomByUserIdAndFilmId(BigDecimal userId,BigDecimal filmId){
		return (Recommend) getSession()
		.createQuery("select r FROM Recommend r join r.id i join i.user u join i.film f where u.userId=? and f.filmId=?")
		.setParameter(0, new BigDecimal(1))
		.setParameter(1, new BigDecimal(1))
		.uniqueResult();
	}


}
