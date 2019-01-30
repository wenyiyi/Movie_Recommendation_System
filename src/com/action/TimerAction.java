/**
 * @(#)TimerAction.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨甲骨文培训基地  版权所有
 * Create by:	文一梅  2017年2月16日
 */
package com.action;

import org.springframework.stereotype.Controller;

import com.base.BaseAction;
import com.hadoop.OperateHdfs;
import com.recommend.Recommend;

/**
 * TODO 填写功能说明
 * @author 文一梅
 */
@Controller
public class TimerAction extends BaseAction<Recommend>{

	private static final long serialVersionUID = 1950756675383522452L;

	/**
	 * 每隔1小时
	 * 更新数据库中用户电影关联表中的数据到本地
	 * 并上传到hdfs启动推荐算法
	 */
	 //@Scheduled(cron="* 0/5 * * * ? ")
	public String run(){
		//导出数据库的评分记录
		filmUserService.exportCsv();
		//启动推荐模块
		Recommend.run();
		//下载推荐结果到本地
		OperateHdfs.downloadFile();
		//读取推荐结果，并存到数据库
		recommendService.save();
		System.out.println("数据保存成功");
		return SUCCESS;
	}
	
	
}
