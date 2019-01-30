/**
 * @(#)UserAction.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.base.BaseAction;
import com.domain.User;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{

	private static final long serialVersionUID = 8542035684950417689L;
	
	private List<User> list;
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	/**
	 * TODO 登录
	 * @return
	 */
	public String login(){
		if(model.getUsername() == null){
			return "login";
		}else{
			User user = userService.checkLogin(model.getUsername(), model.getPassword());
			if(user != null){
				sessionAdd("username",user.getUsername());
				sessionAdd("userId",user.getUserId().toString());
				return "login_success";
			}else
				return "login_fail";
		}
	}
	/**
	 * TODO 注册
	 * @return
	 */
	public String register(){
		if(model.getUsername() == null){
			return "register";
		}else{
			userService.save(model);
			return "register_success";
		}
	}
	
	/**
	 * TODO 注销用户
	 * @return
	 */
	public String logout(){
		sessionRemove();
		return "logout";
	}
	
	/**
	 * TODO 用户主页
	 * @return
	 */
	public String userHome(){
		
		return "userHome";
	}
	
	/**
	 * 编辑用户
	 */
	public String editUser(){
		return "editUser";
	}
	
	
}
