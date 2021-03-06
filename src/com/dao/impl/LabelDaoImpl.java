/**
 * @(#)LabelDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月29日
 */
package com.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.DaoSupportImpl;
import com.dao.LabelDao;
import com.domain.Label;

@Repository
@Transactional
public class LabelDaoImpl extends DaoSupportImpl<Label> implements LabelDao{

}
