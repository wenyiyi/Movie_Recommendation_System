<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="referrer" content="always">
    
    <title>欢迎加入时光机</title>
    
<style>
html{color:#111;background:#fff}body,div,dl,dt,dd,ul,li,h1,h2,h3,h4,h5,h6,pre,code,form,fieldset,legend,input,button,textarea,blockquote,p{margin:0;padding:0}table{border-collapse:collapse;border-spacing:0}fieldset,img{border:0}address,caption,cite,code,dfn,em,i,strong,th,var,optgroup{font-style:normal;font-weight:normal}ul,ol{list-style:none}caption,th{text-align:left}h1,h2,h3,h4,h5,h6{font-size:100%;font-weight:normal}q:before,q:after{content:""}abbr,acronym{border:0;font-variant:normal}sup{vertical-align:baseline}sub{vertical-align:baseline}legend{color:#000}input,button,textarea,select,optgroup,option{font-family:inherit;font-size:inherit;font-style:inherit;font-weight:inherit}input,button,textarea,select{*font-size:100%}pre{white-space:pre-wrap;word-wrap:break-word}a{cursor:pointer}a:link{color:#369;text-decoration:none}a:visited{color:#669;text-decoration:none}a:hover{color:#fff;text-decoration:none;background:#039}a:active{color:#fff;text-decoration:none;background:#f93}a img{border-width:0;vertical-align:middle}body,td,th{font:12px Helvetica,Arial,sans-serif;line-height:1.62}table{border-collapse:collapse;border:none;padding:0;margin:0}wbr:after{content:"\00200B"}textarea{resize:none}input[type=text]:focus,input[type=password]:focus,textarea:focus{outline:none}body{-webkit-text-size-adjust:none;-webkit-touch-callout:none;-webkit-tap-highlight-color:transparent}.bn-small,a.bn-cta,.bn-cta input,.bn-flat input{margin:0;border:none;background:transparent;cursor:pointer;-webkit-appearance:none}.lnk-flat,.bn-flat{display:inline-block;*display:inline;zoom:1;overflow:hidden;vertical-align:middle;color:#444;border-width:1px;border-style:solid;border-color:#bbb #bbb #999;-webkit-border-radius:4px;-moz-border-radius:4px;border-radius:4px}.lnk-flat,.bn-flat input{height:2.1em;padding:0 1.16em 2px;line-height:2.2;*line-height:2.3;font-size:12px;cursor:pointer;-webkit-border-radius:3px;-moz-border-radius:3px;border-radius:3px;background:url(https://img3.doubanio.com/f/accounts/23850eee993fea8be43be857dcbaa23961de56aa/pics/bn_ie_bg.png) repeat-x top;background-image:-webkit-gradient(linear, left top, left bottom, from(#fcfcfc), to(#e9e9e9));background-image:-webkit-linear-gradient(top, #fcfcfc, #e9e9e9);background-image:-moz-linear-gradient(top, #fcfcfc, #e9e9e9);background-image:-ms-linear-gradient(top, #fcfcfc, #e9e9e9);background-image:-o-linear-gradient(top, #fcfcfc, #e9e9e9);background-image:linear-gradient(top, #fcfcfc, #e9e9e9)}.lnk-flat:hover,.bn-flat input:hover,.bn-flat-over{color:#333;border-color:#999 #999 #666;background-color:transparent;filter:progid:DXImageTransform.Microsoft.gradient( startColorstr='#f8f8f8', endColorstr='#dddddd',GradientType=0 );background-image:-webkit-gradient(linear, left top, left bottom, from(#f8f8f8), to(#ddd));background-image:-webkit-linear-gradient(top, #f8f8f8, #ddd);background-image:-moz-linear-gradient(top, #f8f8f8, #ddd);background-image:-ms-linear-gradient(top, #f8f8f8, #ddd);background-image:-o-linear-gradient(top, #f8f8f8, #ddd);background-image:linear-gradient(top, #f8f8f8, #ddd)}.lnk-flat:active,.bn-flat input:active,.bn-flat-active input{color:#333;border-color:#999 #999 #666;background:#ddd}.lnk-flat{line-height:2.2em}.lnk-flat:link,.lnk-flat:visited{text-decoration:none}a.bn-cta,.bn-cta input{display:inline-block;padding:4px 20px;border:1px solid #528641;background:#3fa156;color:#fff;font-size:14px;letter-spacing:2px;*position:relative;*display:inline;zoom:1;*padding:6px 20px 4px;*line-height:1.2;-webkit-border-radius:3px;-moz-border-radius:3px;border-radius:3px}a.bn-cta{vertical-align:middle}.bn-cta input{padding:5px 18px;*padding:4px 10px 2px;*vertical-align:middle}a.bn-cta:link,a.bn-cta:visited{color:#fff}.bn-cta input:hover,a.bn-cta:hover{background-color:#4fca6c;border-color:#6aad54}.bn-cta input:active,a.bn-cta:active{background-color:#3fa156;border-color:#528641}.bn-small{padding:1px 2px;border:1px solid #ffabab;color:#ff7676;background:#ffdddd;height:1.5em\9;line-height:1.56;*line-height:1.4;*position:relative;-webkit-appearance:none;-webkit-border-radius:3px;-moz-border-radius:3px;border-radius:3px}a.bn-small:link,a.bn-small:visited,a.bn-small:hover,a.bn-small:active{padding:0 4px;line-height:1.8;font-size:12px;*line-height:1.3;zoom:1;*height:13px;*overflow:hidden;color:#ff7676;background:#ffdddd}a.bn-small:hover,a.bn-small:active{border-color:#ff7676;background-color:#ff7676;color:#ffdddd}.recsubmit .bn-flat{margin:0 10px}.basic-input,.basic-textarea{padding:5px;height:18px;font-size:14px;vertical-align:middle;border:1px solid #c9c9c9;-webkit-border-radius:3px;-moz-border-radius:3px;border-radius:3px}.basic-input:focus,.basic-textarea:focus{border:1px solid #a9a9a9}.disabled-input{background:#eee;color:#999}.basic-textarea{height:auto}ul,ol{margin:0;padding:0}.wrapper,.header,.footer{width:950px;margin:0 auto 40px;overflow:hidden;zoom:1}.header{margin-bottom:40px}.article{float:left;width:590px;margin-right:50px}.aside{color:#666;overflow:hidden;zoom:1}.aside h2{font-size:15px;color:#072;margin:0 0 12px 0;line-height:150%}.single-nav{padding-top:30px}.sidenav{margin-top:1em}.sidenav li{margin-bottom:1em}h1{display:block;margin:0;padding:0 0 15px 0;font-size:25px;font-weight:bold;color:#494949;line-height:1.1}p{margin:1em 0}.site-nav-logo a:hover{background:none}
</style>

<script>
setTimeout("javascript:location.href='user_login'", 3000);  
</script>
    
  </head>
  <body>
    <div class="header">
      
		<div id="header">
		  <div class="site-nav single-nav">
		    <div class="site-nav-logo">
		      <a href="">
		          <img src="img/content.png" width="330" height="60">
		      </a>
		    </div>
		  </div>
		</div>

    </div>
    
  	<div class="wrapper">
    
		<h1>
		注册成功!正在自动为您跳转到登录页面......
		</h1>

  	</div>

</body>
    
</html>













