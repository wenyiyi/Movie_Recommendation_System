package com.base;

import java.util.regex.Pattern;

public final class SysConstants {
	public static final Integer PAGESIZE = 12;//每页显示的电影个数
	public static final String FILEPATH = "d:/user.csv";//csv文件创建的路径
	public static final String RESULRTPATH = "d:/result.csv";//推荐结果输出文件的路径
	public static final String HDFS = "hdfs://192.168.0.128:9000";//hdfs路径
	public static final Pattern DELIMITER = Pattern.compile("[\t,]");//设定分隔符
	
}
