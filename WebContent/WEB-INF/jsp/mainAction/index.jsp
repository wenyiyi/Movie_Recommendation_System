<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8" />
		<title>时光机电影网</title>
		<link type="text/css" href="css/main.css" rel="stylesheet"/>
		<script src='js/jquery.js'></script>
		<script src='js/recommend.js'></script>
		
</head>

<body>
	<div id="container">
		<div id="banner">
		    <div class="g_main g_top_fix">
				<div class="logo">
					<a href="main_index"><img src="img/3.png" width="80" height="80"></a>
					<a href="main_index"><img src="img/7.png" width="170" height="70"></a>
				</div>
				
				<div class="g-search">
					<form action="#" method="get" searchtype="" target="_blank">
					<div class="g-search-box">
						<input class="g-search-text tui_searchint"  id="headq"  type="text" accesskey="s" value="" name="kw"
						autocomplete="off" onFocus="this['_gs_focus']=1" onBlur="this['_gs_focus']=0" />
					</div>
					<div class="g-search-btn">
						<button class="g-search-submit" type="submit">
							<i class="iconfont"><img src="img/search.png" width="23" height="25"></i>搜库
						</button>
					</div>
					<input type="hidden" value="td.t" name="cid" disabled="disabled" />
					</form>
				</div>
				
				
				<%
					String username =(String)session.getAttribute("username");
				%>
				
				<c:choose>
				<c:when test="${username==null}">
					<div id="user_operater">
						<div class="login" onclick="login()">
							<a href="user_login" target="_blank" >登录</a>
						</div>
						<div class="register" onclick="register()">
							<a href="user_register" target="_blank">注册</a>
						</div> 
					</div>
				</c:when>
				<c:when test="${username!=null&&username=='admin'}">
					<div id="user_operater">
						<div class="login" onclick="manager()">
							<a href="manager_main" target="_blank" >后台管理</a>
						</div>
						<div class="login">
							<a href="#" target="_blank">admin</a>
						</div> 
						<div class="register" onclick="logout()">
							<a href="main_index" target="_self" onclick="logout()">注销</a>
						</div> 
					</div>
				</c:when>
				<c:otherwise>
					<div id="user_operater">
						<div class="login" onclick="userHome()">
							<a href="user_userHome" target="_blank" >${username}</a>
						</div>
						<div class="register" onclick="logout()">
							<a href="main_index" target="_self" onclick="logout()">注销</a>
						</div> 
					</div>
				</c:otherwise>
			</c:choose>
				
			</div>
		</div>
		
		<c:choose>
				<c:when test="${username==null}">
					<s:action name="recommend_tourist" executeResult="true"></s:action>
				</c:when>
				<c:otherwise>
					<s:action name="recommend_user" executeResult="true"></s:action>
				</c:otherwise>
		</c:choose>
		
  		<div>
  			<s:action name="film_showByPage" executeResult="true"></s:action>
  		</div>
  		
		
	</div>
</body>
<script>
	function login(){
		 window.location = 'user_login';
	}
	
	function register(){
		 window.location = 'user_register';
	}
	
	function manager(){
		 window.location = 'manager_main';
	}
	
	function userHome(){
		 window.location = 'user_userHome';
	}
	
	function logout(){
		window.location = 'user_logout';
	}
</script>
	
</html>