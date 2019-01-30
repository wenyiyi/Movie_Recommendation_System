<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
	body{background:black;margin:0;}
	#container{
		width:100%;
		min-height:1000px;
		background:#EDF4ED;
		margin:1px auto;
	}
	#banner{
		width:100%;
		height:100px;
		background:white;
		margin-bottom:10px;
	}
	 .g_top_fix {
    	position: fixed;
    	top: 0;
    	-webkit-transition: height .2s;
    	transition: height .2s;
		background:#fff;
		border-bottom: 1px solid #e6e9ed;
		padding-bottom:10px;
}
	.g_main {
    	width: 100%;
    	z-index: 10004;
    	min-width: 992px;
}
	
	#banner .logo{
		float:left;
		margin-left:15px;
		margin-top:15px;
}
	
	#banner .g-search .g-search-box{
		float:left;
		margin-left:10px;
		margin-top:30px;
}
	#banner .g-search .g-search-btn{
		float:left;
		margin-top:30px;
		width: 78px;
    	height: 40px;
		border-radius: 0 2px 2px 0;
		border: 2px solid #19B955;	
}

	#banner .g-search-submit {
    	width: 78px;
    	height: 40px;
    	line-height: 42px;
    	line-height: 36px\9;
    	border: 0;
    	background: #19B955;
    	cursor: pointer;
    	font-size: 17px;
    	color: #FFF;
    	white-space: nowrap;
}

	#banner .iconfont {
    	vertical-align:middle;
}

	#banner .g-search {
    	width: 360px;
		text-align: left;
		margin: 0 auto;
    	width: 410px;
    	position: relative;
    	z-index: 10000;
    	_display: inline;
    	text-align: left;
}

	#banner .g-search-text {
    	float: left;
    	border: 2px solid #19B955;
    	border-right-width: 1px;
    	padding: 0 10px;
    	width: 295px;
    	height: 40px;
    	line-height: 40px;
    	border-radius: 2px 0 0 2px;
    	background: #fff;
    	font-size: 14px;
}
	#banner .g-search-submit:hover{
		background:#2C7C4B;
}
	#banner .g-search-focus{
		color:#afafaf;	
}
	#left{
		width:20%;
		min-height:800px;
		margin-left:130px;
		background:#EDF4ED;
		float:left;
		border-radius: 4px;
	}

	.photo{
		width:250px;
		min-height:220px;
		margin:auto;
		background:white;
		margin-top:20px;
		border-radius: 4px;
	}
	.photo img{
		margin-top:10px;
		border-radius: 4px;
	}
	.sign{
		text-decoration: none;
    	position: relative;
    	display: block;
    	line-height: 20px;
    	color: #999;
    	font-size: 15px;
    	text-align: center;
    	border-bottom: 1px solid #f4f4f4;
    	border-radius: 4px;
    	cursor: pointer;
	}
	.friends{
    	float: left;
   	    width: 100%;
        height: auto;
		margin-top:20px;
        margin-bottom: 15px;
        background: #fff;
        border-radius: 4px;
	}
	.favorite{
		float: left;
   	    width: 100%;
        height: auto;
        margin-bottom: 15px;
        background: #fff;
		border-radius: 4px;
       
	}
	a{
		text-decoration: none;
	}
	a.nav-activity {
    	position: relative;
    	display: block;
    	width: 100%;
    	height: 60px;
    	line-height: 60px;
    	color: #999;
    	font-size: 20px;
    	text-align: center;
		border-top: 1px solid #f4f4f4;
    	border-bottom: 1px solid #f4f4f4;
    	border-radius: 4px;
    	cursor: pointer;
	}
	
	span{
		margin-left:20px;
	}
	
	#middle{
		width:42%;
		min-height:800px;
		margin-top:20px;
		background:white;
		margin-left:15px;
		float:left;
		border-radius: 4px;
		padding-left:15px;
	}
	
	#right{
		width:23%;
		min-height:800px;
		background:#EDF4ED;
		margin-left:10px;
		float:left;
	}
	
	.seen{
   	    width: 100%;
        height: auto;
	}
	
	.activity {
    	position: relative;
    	display: block;
    	width: 100%;
    	height: 60px;
    	line-height: 60px;
    	color: #6C6C6C;
    	font-size: 20px;
    	text-align: center;
		border-top: 1px solid #f4f4f4;
    	border-bottom: 1px solid #f4f4f4;
    	border-radius: 4px;
    	cursor: pointer;
	}
	
	.recommend_user{
		width: 100%;
        height: auto;
	}
	
	#footer{
		margin-top:10px;
		background:white;
		width:100%;
		height:30px;
	}
</style>
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
			</div>
		</div>
		<div id="left">
			<div class="photo">
				<center><img src="img/photo.png" width="100" height="139"/></center>
				<h1><center>帅气的文森特</center></h1>
				<span class="sign">(添加签名档)</span>
			</div>
			<div class="friends">
				<a href ="#" class="nav-activity">我的好友圈</a>
			</div>
			<div class="favorite">
				<a href ="#" class="nav-activity">我喜欢的电影</a>
			</div>
		</div>
		
		<div id="middle">
			<div class="info">
					<div class="title"><h4>基本资料</h4></div>
					<div class="basicinfo">
							<table><tbody>
								<tr>
									<td class="basicinfo_title">昵称：</td>
								</tr>
								<tr id="cert_hint" class="none"></tr>
								<tr>
									<td class="td_crossline bor3 basicinfo_title">性别：</td>
								</tr>
								<tr>
									<td class="td_crossline bor3 basicinfo_title">生日：</td>
								</tr>
								<tr>
									<td class="td_crossline bor3 basicinfo_title">星座：</td>
								</tr>
								<tr>
									<td class="td_crossline bor3 basicinfo_title">现居地：</td>
								</tr>
								<tr>
									<td class="basicinfo_title">故乡：</td>
								</tr>
								<tr>
									<td class="basicinfo_title">职业：</td>
								</tr>
							</tbody></table>
					</div>
			</div>
		</div>
		<div id="right">
			<div class="seen">
				<a href ="#" class="activity">我看过的电影</a>
			</div>
			<div class="recommend_user">
				<a href ="#" class="activity">与我兴趣相似的用户</a>
			</div>
		</div>
		<div style="clear:both"></div>
		<div id="footer"></div>
	</div>
</body>
</html>
