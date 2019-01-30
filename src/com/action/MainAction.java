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

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class MainAction extends ActionSupport {

	private static final long serialVersionUID = 1975562706419675171L;

	public String index(){
		return "index";
	}

	public String left() {
		return "left";
	}

	public String right() {
		return "right";
	}

}
