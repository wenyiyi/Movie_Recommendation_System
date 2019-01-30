/**
 * @(#)FilmAction.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.action;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.base.BaseAction;
import com.base.SysConstants;
import com.domain.Film;

@Controller
@Scope("prototype")
public class FilmAction extends BaseAction<Film>{

	private static final long serialVersionUID = 926495288036239396L;
	
	private List<Film> films;
	private int pages;
	private int pageNum;
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	/**
	 * TODO 分页显示电影
	 * @return
	 * @throws ParseException
	 */
	public String showByPage() throws ParseException{
		if(null == request.getParameter("pageNum"))
			pageNum = 1;
		else 
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		films = filmService.findAllByPage(pageNum, SysConstants.PAGESIZE);
		for(Film film:films){
			film.setActorList(filmService.getActorsByFilmId(film.getFilmId()));
		}
		pages = filmService.getPages();
		return "showByPage";
	}
	
	/**
	 * TODO 跳转相应电影的页面
	 * @return
	 */
	public String film(){
		model.setFilmId(new BigDecimal(request.getParameter("filmId")));
		model = filmService.getFilmByFilmId(model.getFilmId());
		model.setActorList(filmService.getActorsByFilmId(model.getFilmId()));
		model.setTypeList(filmService.getTypesByFilmId(model.getFilmId()));
		return "film";
	}
	
	/**
	 * 添加爬取的电影数据
	 */
	public String addFIlmData(){
		return "addFIlmData";
	}
	
	/**
	 * 编辑抓取的电影数据
	 */
	public String editFilmData(){
		return "editFilmData";
	}
	
	/**
	 * 自主录入电影
	 */
	public String addFilm(){
		return "addFilm";
	}
	
	/**
	 * 编辑电影
	 */
	public String editFilm(){
		return "editFilm";
	}
	
	/**
	 * 修改电影
	 */
	public String updateFilm(){
		return "updateFilm";
	}
	
}
