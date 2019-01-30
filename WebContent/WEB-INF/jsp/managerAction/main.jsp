<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台主页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	
	<%
		String type = request.getParameter("type");
		if("addIndex".equals(type)){
	 %>
	 	<script type="text/javascript">
	 		$(document).ready(function(){
				$('#main').load("");
			});
	 	</script>
	<%
		}else if("addColumn".equals(type)){
	 %>
		 <script type="text/javascript">
		 		$(document).ready(function(){
					$('#main').load("");
				});
		 </script>
	 <%
	 	}else if("addNews".equals(type)){
	  %>
	  	<script type="text/javascript">
		 		$(document).ready(function(){
					$('#main').load("");
				});
		 </script>
	  <%
	  	}else if("delNews".equals(type)){
	   %>
	   	<script type="text/javascript">
		 		$(document).ready(function(){
					$('#main').load("");
				});
		 </script>
	   <%
	   	}else if("addLocal".equals(type)){
	    %>
	    <script type="text/javascript">
		 		$(document).ready(function(){
					$('#main').load("");
				});
		 </script>
	    <%
	    }else if("delFileDocument".equals(type)){
	     %>
	     <script type="text/javascript">
		 		$(document).ready(function(){
					$('#main').load("");
				});
		 </script>
	     <%
	     }
	      %>
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/demo.css">
	<style type="text/css">
		a {
			text-decoration:none;
			border:none;
			color:#05497A
		}
		a:hover{
			text-decoration:none;
			color:#ccc
		}
		#title span{
			font-size:35px;
		}
	</style>

  </head>
  
  <body class="easyui-layout">
	<div id="title" data-options="region:'north',border:false" style="height:80px;width:100%;background:#B3DFDA;padding:10px">
		<span>时光机电影网后台管理系统</span>
	</div>
	
	<div data-options="region:'west',split:true,title:'业务管理'" style="width:200px;padding:0px;">
		<div class="easyui-accordion" style="width:192px;height:485px;">
			<div id="selectone" title="数据来源管理" style="padding:10px;">
				<p>
					<!-- 跳到main.js -->
					<a href="javascript:$.treeLink('data_addFilmData');" >电影数据抓取</a>
				</p>
				<p>
					<a href="javascript:$.treeLink('data_addUserData');" >用户数据抓取</a>
				</p>
				<p>
					<a href="javascript:$.treeLink('data_editFilmData');" >电影数据管理</a>
				</p>
				<p>
					<a href="javascript:$.treeLink('data_editUserData');" >用户数据管理</a>
				</p>
				<p>
					<a href="javascript:$.treeLink('data_editURL');" >URL管理</a>
				</p>
			</div>
			<div id="selecttwo" title="电影管理" style="padding:10px">
				<p>
					<a href="javascript:$.treeLink('film_addFilm');" >录入电影</a>
				</p>
				<p>
					<a href="javascript:$.treeLink('film_editFilm');" >编辑电影</a>
				</p>
			</div>
			<div title="用户管理" style="padding:10px">
			<p>
				<a href="javascript:$.treeLink('user_editUser');" >编辑用户</a>
			</p>
			</div>
			<div title="角色管理" style="padding:10px">
			</div>
			<div title="权限管理" style="padding:10px">
			</div>
		</div>
	</div>
	
	<div data-options="region:'south',border:false" style="height:30px;background:#A9FACD;padding:5px;">
		<div>
			<a href="#">首页</a>
		</div>
	</div>
	<div id="main" data-options="region:'center',title:' '">
	
	</div>
  </body>
</html>
