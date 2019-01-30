<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>



<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>登录时光机</title>
<style type="text/css">
/* Reset */
body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,form,fieldset,input,textarea,p,blockquote,th,td { margin:0; padding:0; }
table { border-collapse:collapse; border-spacing:0; }
fieldset,img { border:0; }
address,caption,cite,code,dfn,em,strong,th,var { font-style:normal; font-weight:normal; }
ol,ul { list-style:none; }
caption,th { text-align:left; }
h1,h2,h3,h4,h5,h6 { font-size:100%; font-weight:normal; }
q:before,q:after { content:''; }
abbr,acronym { border:0; }

/* Font,  Link & Container */
body { font:12px/1.6 arial,helvetica,sans-serif; }
a:link { color:#369;text-decoration:none; }
a:visited { color:#669;text-decoration:none; }
a:hover { color:#fff;text-decoration:none;background:#039; }
a:active { color:#fff;text-decoration:none;background:#f93; }
button { cursor:pointer;line-height:1.2; }
.mod { width:100%; }
.hd:after, .bd:after, .ft:after, .mod:after {content:'\0020';display:block;clear:both;height:0; }
.error-tip { margin-left:10px; }
.error-tip, .error { color:#fe2617; }

/* Layout */
.wrapper { width:950px;margin:0 auto; }
#header { padding-top:30px; }
#content { min-height:400px;*height:400px; }
#header, #content { margin-bottom:40px; }
#header, #content, #footer { width:100%;overflow:hidden; }
.article { float:left;width:590px; }
.aside { float:right;width:310px;color:#666; }
.aside li { padding-bottom: 1em; }

.narrow-layout .wrapper { width:90%; }
.narrow-layout h1 { padding-bottom:10px; }
.narrow-layout #header { padding-top:10px;margin-bottom:20px; }
.narrow-layout .article, .narrow-layout .aside { width:auto;float:none;margin-bottom:20px; }
.narrow-layout .aside li { padding:0;margin-bottom:10px; }
.narrow-layout .fright { display:block;float:none; }

/* header */
.logo { float:left; width:215px;  height:30px; overflow:hidden; line-height:10em; }
a.logo:link,
a.logo:visited,
a.logo:hover,
a.logo:active { background:transparent url(data:image/png;base64,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) no-repeat;
*background-image:url(mhtml:https://accounts.douban.com/login!logo); }
h1 { color:#494949;display:block;font-size:25px;font-weight:bold;line-height:1.1;margin:0;padding:0 0 30px;word-wrap:break-word; }

/* form */
.item { clear:both;margin:0 0 15px;zoom:1; }
label { display: inline-block; float:left; margin-right: 15px; text-align: right; width: 60px; font-size: 14px; line-height: 30px; vertical-align: baseline }
.remember { cursor: pointer; font-size: 12px; display: inline; width: auto; text-align: left; float: none; margin: 0; color: #666 }
.item-captcha input,
.basic-input { width: 200px; padding: 5px; height: 18px; font-size: 14px;vertical-align:middle; -moz-border-radius: 3px; -webkit-border-radius: 3px; border-radius: 3px; border: 1px solid #c9c9c9 }
.basic-input.small {width:100px;}
.item-captcha input:focus,
.basic-input:focus { border: 1px solid #a9a9a9 }
.item-captcha input { width:100px; }
.item-captcha .pl { color:#666; }
.btn-submit { cursor: pointer;color: #ffffff;background: #3fa156; border: 1px solid #528641; font-size: 14px; font-weight: bold; padding:6px 26px; border-radius: 3px; -moz-border-radius: 3px; -webkit-border-radius: 3px; *width: 100px;*height:30px; }
.btn-submit:hover { background-color:#4fca6c;border-color:#6aad54; }
.btn-submit:active { background-color:#3fa156;border-color:#528641; }
#item-error { padding-left:75px; }
.item-captcha img { max-width:70%; }
body { -webkit-text-size-adjust: none;-webkit-touch-callout: none;-webkit-tap-highlight-color: transparent; }
/* 3rd login*/
.item-3rd { padding:5px 0;width:200px;margin:20px 0 0 75px;border-top:1px solid #eee;border-bottom:1px solid #eee; }
.item-3rd label { width:auto;margin:0;font-size:12px;color:#999;line-height:1.5; }
.item-3rd img { margin:0 5px;vertical-align:middle; }
.item-3rd a:hover { background-color:transparent; }
.item-3rd a:active { background-color:transparent; }
/* sms login */
.item.extra{float:left;}
#post-code-button {float:none;padding-left:200px;width:87px;text-align:right;margin:5px 0;}
#post-code {float:left;width:200px;}
.item-right {text-align:right;width:287px;}
</style>


<style type="text/css">
#footer { color:#999;padding-top:6px;border-top: 1px dashed #ddd; }
.fright { float:right; }
.icp { float:left; }
</style>

<script>
 function changeWindowSize(){var e=document.documentElement,n=document.getElementById("header").offsetHeight+document.getElementById("content").offsetHeight+document.getElementById("side-nav").offsetHeight;e.offsetWidth<=500||e.offsetHeight<=n?(changeWindowSize.changed||(window.resizeTo(500,n),changeWindowSize.changed=!0),e.className="narrow-layout",resizeEvent(!0)):(e.className="",resizeEvent(!1))}function resizeEvent(e){return e?void(window.onresize=function(){var e;return function(){e&&window.clearTimeout(e),e=window.setTimeout(changeWindowSize,100)}}()):void(window.onresize=null)}
 function set_cookie(e,t,n,o){var i,r,c=new Date;c.setTime(c.getTime()+24*(t||30)*60*60*1e3),i="; expires="+c.toGMTString();for(r in e)document.cookie=r+"="+e[r]+i+"; domain="+(n||"douban.com")+"; path="+(o||"/")}function get_cookie(e){var t,n,o=e+"=",i=document.cookie.split(";");for(t=0;t<i.length;t++){for(n=i[t];" "==n.charAt(0);)n=n.substring(1,n.length);if(0===n.indexOf(o))return n.substring(o.length,n.length).replace(/\"/g,"")}return null}
</script>
</head>
<body onLoad="changeWindowSize()">
<div class="wrapper">
  <div id="header">
     <img src="img/content.png" width="330" height="60">
  </div>

<div id="content">
  <h1>登录时光机</h1>
  <div class="article">
      

<form id="lzform" name="lzform" method="post" onSubmit="return validateForm(this);" action="user_login">
  <input name="source" type="hidden" value="movie"/>
  <div class="item">
    <label>帐号</label>
    <input id="username" name="username" type="text" class="basic-input"
           maxlength="60" value="0-16位数字或字母" tabindex="1"/>
  </div>
  <div class="item">
    <label>密码</label>
    <input id="password" name="password" type="password" class="basic-input" maxlength="20" tabindex="2"/>
  </div>
  
  <div class="item">
    <label>&nbsp;</label>
    <input type="submit" value="登录" name="login" class="btn-submit" tabindex="5"/>
  </div>
  
</form>

  </div>
  <ul id="side-nav" class="aside">
    <li>&gt;&nbsp;还没有时光机帐号？<a rel="nofollow" href="user_register">立即注册</a></li>
  </ul>
</div>
<div id="footer">

</div>

<script>
function trim(e){return e.replace(/^(\s|\u00A0)+/,"").replace(/(\s|\u00A0)+$/,"")}function validateForm(e){var r=0,t=e.elements["captcha-solution"],l=e.elements.form_username,n=e.elements.form_password,a=document.getElementById("item-error");if(a&&(a.style.display="none"),t){var o=trim(t.value);""===o?(displayError(t,"请输入验证码"),r=1):o.length<4?(displayError(t,"请输入正确的验证码"),r=1):clearError(t)}if(l){var i=trim(l.value);""===i||"0-16位数字或字母"===i?(displayError(l,"请输入正确的账号"),r=1):clearError(l)}return n&&(""===n.value?(displayError(n,"请输入密码"),r=1):n&&clearError(n)),!r}function displayError(e,r){var t=document.getElementById(e.name+"_err");t||(t=document.createElement("span"),t.id=e.name+"_err",t.className="error-tip",e.parentNode.appendChild(t)),t.style.display="inline",t.innerHTML=r}function clearError(e){var r=document.getElementById(e.name+"_err");r&&(r.style.display="none")}!function(e){var r=function(r){return e.getElementById(r)},t="0-16位数字或字母",l=r("username"),n=r("password"),a=r("captcha_field");l.onfocus=function(){this.value==t&&(this.value="",this.style.color="#000")},l.onblur=function(){this.value||(this.value=t,this.style.color="#ccc")},l.value==t?l.style.color="#ccc":""===n.value?n.focus():a&&a.focus()}(document);
</script>

<!-- COLLECTED JS -->


</div>
</body>
</html>




