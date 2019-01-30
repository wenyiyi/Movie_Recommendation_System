$(window).unload(function() {//页面卸载，就是用户关闭页面、点击链接跳转到其他页面或者刷新页面都会执行  
		$.post("timer_run");
});