/**
 * @(#)UserService.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service;

import com.domain.User;

public interface UserService {

	/**
	 * TODO 保存一个实体
	 */
	public void save(User user);
	
	/**
	 * TODO 验证登录
	 * @param username
	 * @param password
	 * @return
	 */
	public User checkLogin(String username,String password);
	
	/**
	 * 通过用户名获取用户
	 */
	public User getUserByName(String username);
}
