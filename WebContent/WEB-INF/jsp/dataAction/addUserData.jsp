<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加网络数据</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<div style="margin-left:30px;margin-top:30px">
  	 	<form action="NewsAction_addNews" method="post">
		    <table style="margin-top:20px;margin-left:20px;font-size:12px">
			  <tr>
			    <td>爬取频率：</td>
			    <td><input name="" class="easyui-validatebox" required="true" /></td>
			    <td>电影名称：</td>
			    <td><input name="" class="easyui-validatebox" required="true" /></td>
			  </tr>
			  <tr>
			    <td>来源URL：</td>
			    <td>
			    	<input name="" class="easyui-validatebox" required="true" />
			    </td>
			    <td>文件路径：</td>
			    <td>
			    	<input name="" class="easyui-validatebox" required="true" />
			    </td>
			  </tr>
			  <tr>
			    <td>爬取时间：</td>
			    <td>
			    	<input name="news.newsTime" class="easyui-validatebox" required="true" />
			    </td>
			    <td>来源网站：</td>
			    <td>
			    	<input name="news.sourceNet" class="easyui-validatebox" required="true" />
				</td>
			  </tr>
			  <tr>
			    <td>备注：</td>
			    <td>
			    	<textarea rows="6" cols="40" name="news.mark" value=""></textarea>
			    </td>
			  </tr>
			</table>
			<div style="margin-top:10px;margin-left:180px;">
				<input type="submit" value="开始抓取" ><input type="reset" value="清空" >
			</div>
  	 	</form>
	</div>
  </body>
</html>
