<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>${model.filmName}</title>
<link type="text/css" href="css/videomain.css" rel="stylesheet" />
<script src='js/jquery.js'></script>
<script src='js/javascript.js'></script>
<script src="js/star.js" type="text/javascript"></script>

<script>
	$(document).ready(function() {

		$('video').videoPlayer({
			'playerWidth' : 0.95,
			'videoClass' : 'video'
		});

		$("#star").fadeIn(3);//星星评分显示
	});
	
</script>

</head>
<body>
	<div id="container">
		<div id="banner">
			<div class="g_main g_top_fix">

				<div class="logo">
					<a href="main_index"><img src="img/3.png" width="80"
						height="80"></a> <a href="main_index"><img src="img/7.png"
						width="170" height="70"></a>
				</div>

				<div class="g-search">
					<form action="#" method="get" searchtype="" target="_blank">
						<div class="g-search-box">
							<input class="g-search-text tui_searchint" id="headq" type="text"
								accesskey="s" value="" name="kw" autocomplete="off"
								onFocus="this['_gs_focus']=1" onBlur="this['_gs_focus']=0" />
						</div>
						<div class="g-search-btn">
							<button class="g-search-submit" type="submit">
								<i class="iconfont"><img src="img/search.png" width="23"
									height="25"></i>搜库
							</button>
						</div>
						<input type="hidden" value="td.t" name="cid" disabled="disabled" />
					</form>
				</div>
				<%
					String username = (String)session.getAttribute("username");
					String userId = (String)session.getAttribute("userId");
				%>
				
				<!-- 用隐藏的input为后台传值 -->
				<input id="filmId" type="hidden" value="${model.filmId}">
				<input id="userId" type="hidden" value="${userId}">

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

		<div id="left">
			<div id="homeplayer">
				<div id="title">
					<h1>
						<a href="#" style="color: #19B955">${model.filmName}</a>：${model.filmName}
					</h1>
				</div>

				<div id="video">
					<video width="720" height="400">
						<source src="video/movie.mp4" type="video/mp4">
						<source src="video/movie.webm" type="video/webm">
					</video>
					<c:if test="${username!=null}">
					
					<div id="star">
						<span>给该影片评分</span>
						<ul>
							<li><a href="javascript:;">2</a></li>
							<li><a href="javascript:;">4</a></li>
							<li><a href="javascript:;">6</a></li>
							<li><a href="javascript:;">8</a></li>
							<li><a href="javascript:;">10</a></li>
						</ul>
						<span></span>
						<p></p>
					</div>
					<br />
					<div style="width: 400px; margin: 0 auto; text-align: center; font-size: 12px;"></div>
					</c:if>
				</div>
			</div>

			<div id="comments">
				<div id="mycomment">
					<form method="post" class="cmt_form" action="#">
						<div class="ta">
							<textarea name="content" maxlength="300"></textarea>
						</div>
						<div class="tools fix">
							<button type="submit" class="submit_post">提交</button>
						</div>
					</form>
				</div>

				<div id="lists">
					<ol id="hotList">
						<li class="item item_last">
							<div class="user_icon">
								<a href="#" class="atUser"
									data-oid="32388104" data-ucode="7zVWuBpet7g" title="考据狂人的自频道"
									target="_blank"><img src="http://u3.tdimg.com/u/M-07.gif"></a>
							</div>
							<p class="hd fix">
								<a class="name" href="#">考据狂人</a>&nbsp;&nbsp;&nbsp;
								<i class="time">2016年10月02日</i>
							</p>
							<div class="content">
							<p>&nbsp;&nbsp;&nbsp;
							看来这片子营销做得不错，12年了，都还有这么多马屁的赞扬，而且只要有不和谐声音就被群攻。
							我只能说12年时间出了这个天朝人习以为见的剧情也是醉了，画风也没见比现今其它高产动漫好多少。
							只能说如果国人一味的自我啊Q精神，违心吹捧不敢直言，那中国动漫也就这样了，继续等着不知道你死之前是否看的到的电影，看着比日漫预告还短的几分钟连载动画吧。
							</p>
							</div>
					</ol>
				</div>

			</div>
		</div>

		<div id="right">
			<div class="introduce">
				<div id="mainpic">
					<img src="${model.cover}" width="100" height="139">
				</div>

				<div id="info">
					<h1>${model.filmName}评分：</h1>
					<br>
					<ul>
						<li>导演：${model.director}</li>
						<li>主演： <c:forEach items="${model.actorList}" var="actor">
								${actor.actorName}/
							</c:forEach>
						</li>
						<li>类型： <c:forEach items="${model.typeList}" var="type">
								${type.typeName}/
							</c:forEach>
						</li>
						<li>制片国家/地区：${model.area}</li>
						<li>语言：${model.language}</li>
						<li>上映时间：${model.releaseDate}</li>
						<li>片长：${model.mins}</li>
						<li>播放次数：</li>
					</ul>
				</div>
				<div style="clear: both"></div>
				<div id="intor">
					<h2>${model.filmName}的剧情简介····</h2>
					<p>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${model.introduce}
					</P>
				</div>
			</div>

			<div id="relationship">
				<div class="film">
					<h2>看过这部电影的人也看过· · · ·</h2>
				</div>

				<div class="person">
					<h2>谁在看这部电影· · · ·</h2>
				</div>

				<div class="bgm">
					<h2>这部电影的背景音乐· · · ·</h2>
				</div>

				<div class="clothing">
					<h2>这部电影的演员服装· · · ·</h2>
				</div>

			</div>
		</div>

		<div style="clear: both"></div>

		<div id="footer"></div>
	</div>
</body>
<script>
	function login() {
		window.location = 'user_login';
	}

	function register() {
		window.location = 'user_register';
	}

	function manager() {
		window.location = 'manager_main';
	}

	function userHome() {
		window.location = 'user_userHome';
	}
	function logout(){
		window.location = 'user_logout';
	}
</script>
</html>
