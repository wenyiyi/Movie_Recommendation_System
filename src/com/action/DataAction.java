/**
 * @(#)ActorAction.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.base.BaseAction;
import com.domain.Actor;

@Controller
@Scope("prototype")
public class DataAction extends BaseAction<Actor>{

	private static final long serialVersionUID = 686845069503287365L;

	/**
	 * 电影数据抓取
	 */
	public String addFilmData(){
		
		return "addFilmData";
	}
	
	/**
	 * 用户数据抓取
	 */
	public String addUserData(){
		
		return "addUserData";
	}
	
	/**
	 * 管理电影数据
	 */
	public String editFilmData(){
		
		return "editFilmData";
	}
	
	/**
	 * 管理用户数据
	 */
	public String editUserData(){
		return "editUserData";
	}
	
	/**
	 * 管理爬取的URL
	 */
	public String editURL(){
		return "editURL";
	}
}
