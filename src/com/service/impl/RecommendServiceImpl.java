/**
 * @(#)ActorServiceImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.SysConstants;
import com.dao.RecommendDao;
import com.domain.Film;
import com.domain.Recommend;
import com.domain.RecommendId;
import com.domain.User;
import com.service.RecommendService;

@Service 
public class RecommendServiceImpl implements RecommendService{
	@Resource 
	private RecommendDao recommendDao;

	public void setActorDao(RecommendDao recommendDao) {
		this.recommendDao = recommendDao;
	}

	@Override
	public List<Recommend> getRecomByUserId(BigDecimal userId){
		return recommendDao.getRecomByUserId(userId);
	}

	@Override
	public void save() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		Recommend recommend = null;
		RecommendId id = null;
		Film film = new Film();
		User user = new User();
		try {
			is = new FileInputStream("d:\\result.csv");
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String r = "";
			while((r = br.readLine()) != null){
				System.out.println(r);
				recommend = new Recommend();
				id = new RecommendId();
				film = new Film();
				user = new User();
			
				String[] strs = SysConstants.DELIMITER.split(r.toString());
				user.setUserId(new BigDecimal(strs[0]));
				film.setFilmId(new BigDecimal(strs[1]));
				recommend.setValue(Float.valueOf(strs[2]));
				id.setUser(user);
				id.setFilm(film);
				recommend.setId(id);
				//根据用户id和电影id查找推荐的记录
				if((getRecomByUserIdAndFilmId(user.getUserId() ,film.getFilmId())) !=null )
					recommendDao.update(recommend);
				else
					recommendDao.save(recommend);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (isr != null)
					isr.close();
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}

	/* (non-Javadoc)
	 * @see com.service.RecommendService#getRecomByUserIdAndFilmId(java.math.BigDecimal, java.math.BigDecimal)
	 */
	@Override
	public Recommend getRecomByUserIdAndFilmId(BigDecimal userId, BigDecimal filmId) {
		return recommendDao.getRecomByUserIdAndFilmId(userId, filmId);
	}
	
}
