/**
 * @(#)UserDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月29日
 */
package com.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.DaoSupportImpl;
import com.dao.UserDao;
import com.domain.User;

@Repository
@Transactional
public class UserDaoImpl extends DaoSupportImpl<User> implements UserDao{
		
	@Override
	public User getUserByNameAndPwd(String username,String password) {
		
		return (User) getSession()
				.createQuery("From User WHERE username=? and password=?")
				.setParameter(0, username)
				.setParameter(1, password)
				.uniqueResult();
	}

	
	@Override
	public User getUserByName(String username) {
		return (User) getSession()
				.createQuery("From User WHERE username=?")
				.setParameter(0, username)
				.uniqueResult();
	}
	
}
