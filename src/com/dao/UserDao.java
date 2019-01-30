/**
 * @(#)UserDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月29日
 */
package com.dao;

import com.base.DaoSupport;
import com.domain.User;

/**
 * TODO 填写功能说明
 * @author 文一梅
 */
public interface UserDao extends DaoSupport<User>{
	/**
	 * 通过用户名和密码获取用户
	 * @return
	 */
	public User getUserByNameAndPwd(String username,String password);

	/**
	 * 通过用户名获取用户
	 */
	public User getUserByName(String username);
}