/**
 * @(#)LabelAction.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.base.BaseAction;
import com.domain.Label;

@Controller
@Scope("prototype")
public class LabelAction extends BaseAction<Label>{

	private static final long serialVersionUID = -3476443397177024628L;

}
