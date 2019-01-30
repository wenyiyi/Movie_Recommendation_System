/**
 * @(#)OperateDaoImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨甲骨文培训基地  版权所有
 * Create by:	文一梅  2016年12月24日
 */
package com.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.DaoSupportImpl;
import com.dao.OperateLogDao;
import com.domain.OperateLog;

@Repository
@Transactional
public class OperateDaoImpl extends DaoSupportImpl<OperateLog> implements OperateLogDao{

}
