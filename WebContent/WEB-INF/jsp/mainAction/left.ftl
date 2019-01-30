<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8" />
		<title>时光机电影网</title>
		<link type="text/css" href="css/main.css" rel="stylesheet"/>
</head>

<body >
		<div id="left">
			<div class="recommend_title">你可能喜欢看</div>
			<ul class="recommend">
			<#list films as film > 
			<li class="col1">
			<div class="pack pack_album">
				<div class="pic">
					<a href="film_film?filmId=${film.filmId}" title="${film.filmName}" target="_blank"></a>
					<i class="bg"></i>
						<img class="quic lazyImg" src="${film.cover}"/>
					<span class="vtime">
						<span class="bg"></span>
						<span class="di">正片</span>
					</span>
				</div>

				<div class="txt">
					<h6 class="caption">
					<a href="film_beginAgain" title="${film.filmName}" target="new">${film.filmName}</a>
					</h6>
					<span class="feed_wrap douban_show" style=""><span class="douban_btn" href="#"><span>${film.svgGrade}</span></span></span>
				</div>
			</div>
			</li>
			</#list>
			</ul>
		</div>
</body>
</html>