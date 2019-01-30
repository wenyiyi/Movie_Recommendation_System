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
import com.domain.Image;

@Controller
@Scope("prototype")
public class ImageAction extends BaseAction<Image>{

	private static final long serialVersionUID = -3441141705195697676L;


}
