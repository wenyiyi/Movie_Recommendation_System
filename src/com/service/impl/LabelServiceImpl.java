/**
 * @(#)LabelServiceImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.LabelDao;
import com.service.LabelService;

@Service
public class LabelServiceImpl implements LabelService {
	@Resource 
	private LabelDao lableDao;

	public void setLableDao(LabelDao lableDao) {
		this.lableDao = lableDao;
	}
	
}
