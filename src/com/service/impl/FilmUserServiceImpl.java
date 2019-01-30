/**
 * @(#)ActorServiceImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.SysConstants;
import com.dao.FilmUserDao;
import com.domain.FilmUser;
import com.service.FilmUserService;
import com.util.FileUtil;

@Service 
public class FilmUserServiceImpl implements FilmUserService{
	@Resource 
	private FilmUserDao filmUserDao;

	public void setFilmUserDao(FilmUserDao filmUserDao) {
		this.filmUserDao = filmUserDao;
	}

	@Override
	public void save(FilmUser filmUser) {
		filmUserDao.save(filmUser);
	}

	public FilmUser getByFilmIdAndUserId(BigDecimal filmId, BigDecimal userId) {
		return filmUserDao.getByFilmIdAndUserId(filmId, userId);
	}

	public void updateScore(BigDecimal filmId, BigDecimal userId, Short score) {
		filmUserDao.updateScore(filmId, userId, score);
	}

	public void updateWatchTime(BigDecimal filmId, BigDecimal userId, String watchTime) {
		filmUserDao.updateWatchTime(filmId, userId, watchTime);
	}

	public void getByUserId(BigDecimal userId) {
		List<FilmUser> lst = filmUserDao.getByUserId(userId);
		
	}
	
	public void exportCsv() {
		List<FilmUser> lst = filmUserDao.findAll();
		List<String> dataList = new ArrayList<String>();
		String userId = "";
		String filmId = "";
		String score = "";
		for(FilmUser f:lst){
			userId = f.getId().getUser().getUserId().toString();
			filmId = f.getId().getFilm().getFilmId().toString();
			score = f.getScore().toString();
			dataList.add(userId.toString()+","+filmId+","+score);
		}
		Boolean isSuccess = FileUtil.exportCsvToLocal(SysConstants.FILEPATH, dataList);
		if(isSuccess==true){
			System.out.println("更新数据源成功---");
		}
	}

}
