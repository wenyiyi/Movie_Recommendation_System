/**
 * @(#)FilmUserDaoImpl.java
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
import com.dao.FilmUserDao;
import com.domain.FilmUser;

@Repository
@Transactional
public class FilmUserDaoImpl extends DaoSupportImpl<FilmUser> implements FilmUserDao{

	@Override
	public FilmUser getByFilmIdAndUserId(BigDecimal filmId, BigDecimal userId) {
		return (FilmUser) getSession()
				.createQuery("select f from FilmUser f where f.id.film.filmId=? and f.id.user.userId=?")
				.setParameter(0, filmId)
				.setParameter(1, userId)
				.uniqueResult();
	}

	@Override
	public void updateScore(BigDecimal filmId, BigDecimal userId, Short score) {
		getSession()
		.createQuery("update FilmUser f set f.score=? where f.id.film.filmId=? and f.id.user.userId=?")
		.setParameter(0, score)
		.setParameter(1, filmId)
		.setParameter(2, userId)
		.executeUpdate();
	}

	@Override
	public void updateWatchTime(BigDecimal filmId, BigDecimal userId, String watchTime) {
		getSession()
		.createQuery("update FilmUser f set f.watchTime=? where f.id.film.filmId=? and f.id.user.userId=?")
		.setParameter(0, watchTime)
		.setParameter(1, filmId)
		.setParameter(2, userId)
		.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FilmUser> getByUserId(BigDecimal userId) {
		return (List<FilmUser>)getSession()
				.createQuery("select f from FilmUser f where f.id.user.userId=?")
				.setParameter(0, userId)
				.list();
	}


}
