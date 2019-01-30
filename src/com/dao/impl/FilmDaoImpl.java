/**
 * @(#)FilmDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月29日
 */
package com.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.DaoSupportImpl;
import com.dao.FilmDao;
import com.domain.Actor;
import com.domain.Film;
import com.domain.Image;
import com.domain.Type;

@Repository
@Transactional
@SuppressWarnings("unchecked")
public class FilmDaoImpl extends DaoSupportImpl<Film> implements FilmDao{

	public Image getCoverByFilmId(BigDecimal filmId){
		return (Image) getSession()
				.createQuery("select i from Image i join i.film f where f.filmId=? and imageId=?")
				.setParameter(0, filmId)
				.setParameter(1, filmId)
				.uniqueResult();
	}

	@Override
	public List<Film> findAllByPage(int pageNum,int pageSize) {
		return getSession()
				.createQuery("FROM Film")
				.setFirstResult((pageNum-1)*pageSize)
				.setMaxResults(pageSize)
				.list();
	}

	@Override
	public List<Image> getImagesByFilmId(BigDecimal filmId) {
		return getSession()
			    .createQuery("select i from Image i join i.film f where f.filmId=?")
				.setParameter(0, filmId)
				.list();
	}

	@Override
	public List<Actor> getActorsByFilmId(BigDecimal filmId) {
		return getSession()
			    .createQuery("select a from Actor a join a.films f where f.filmId=?")
				.setParameter(0, filmId)
				.list();
	}

	@Override
	public Film getFilmByFilmId(BigDecimal filmId) {
		return (Film) getSession()
				.createQuery("from Film f where f.filmId=?")
				.setParameter(0, filmId)
				.uniqueResult();
	}

	@Override
	public List<Type> getTypesByFilmId(BigDecimal filmId) {
		return getSession()
			    .createQuery("select t from Type t join t.films f where f.filmId=?")
				.setParameter(0, filmId)
				.list();
	}

	@Override
	public List<Film> getFilmOrderBySvgGrade() {
		return getSession()
				.createQuery("FROM Film f ORDER BY f.svgGrade DESC")
				.setFirstResult(0)
				.setMaxResults(4)
				.list();
	}
}
