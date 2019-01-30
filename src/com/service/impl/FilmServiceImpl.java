/**
 * @(#)FilmServiceImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.SysConstants;
import com.dao.FilmDao;
import com.domain.Actor;
import com.domain.Film;
import com.domain.Image;
import com.domain.Type;
import com.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService{
	@Resource 
	private FilmDao filmDao;

	public void setFilmDao(FilmDao filmDao) {
		this.filmDao = filmDao;
	}

	@Override
	public Image getCoverByFilmId(BigDecimal filmId) {
		return filmDao.getCoverByFilmId(filmId);
	}

	@Override
	public void save(Film film) {
		filmDao.save(film);
	}

	@Override
	public List<Film> findAllByPage(int pageNum, int pageSize) {
		return filmDao.findAllByPage(pageNum, pageSize);
	}

	@Override
	public int getPages() {
		int pages = 1;
		int totals = filmDao.getTotals();
		if((totals % SysConstants.PAGESIZE)==0)
			pages = totals/SysConstants.PAGESIZE;
		else
			pages = totals/SysConstants.PAGESIZE+1;
		return pages;
	}

	@Override
	public List<Image> getImagesByFilmId(BigDecimal filmId) {
		return filmDao.getImagesByFilmId(filmId);
	}

	@Override
	public List<Actor> getActorsByFilmId(BigDecimal filmId) {
		return filmDao.getActorsByFilmId(filmId);
	}

	@Override
	public Film getFilmByFilmId(BigDecimal filmId) {
		return filmDao.getFilmByFilmId(filmId);
	}

	@Override
	public List<Type> getTypesByFilmId(BigDecimal filmId) {
		return filmDao.getTypesByFilmId(filmId);
	}

	@Override
	public List<Film> getFilmOrderBySvgGrade() {
		return filmDao.getFilmOrderBySvgGrade();
	}
}
