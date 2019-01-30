/**
 * @(#)ActorServiceImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.OperateLogDao;
import com.service.OperateLogService;

@Service 
public class OperateLogServiceImpl implements OperateLogService{
	@Resource 
	private OperateLogDao operateLogDao;

	public void setOperateLogDao(OperateLogDao operateLogDao) {
		this.operateLogDao = operateLogDao;
	}
	
}
