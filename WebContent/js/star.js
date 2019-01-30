window.onload = function() {

		var oStar = document.getElementById("star");
		var aLi = oStar.getElementsByTagName("li");
		var oUl = oStar.getElementsByTagName("ul")[0];
		var oSpan = oStar.getElementsByTagName("span")[1];
		var oP = oStar.getElementsByTagName("p")[0];
		var i = iScore = iStar = 0;
		var aMsg = [ "很差| ", "较差| ", "一般| ", "推荐| ", "力荐| " ]
		
		var start;
		var end;
		var watchTime; //页面停留时间
		start = new Date();//start是用户进入页面时间  
		
		var filmId = document.getElementById("filmId").value;
		var userId =  document.getElementById("userId").value;
		var score;//电影评分
		
		for (i = 1; i <= aLi.length; i++) {
			aLi[i - 1].index = i;

			//鼠标移过显示分数
			aLi[i - 1].onmouseover = function() {
				fnPoint(this.index);
				//浮动层显示
				oP.style.display = "block";
				//计算浮动层位置
				oP.style.left = oUl.offsetLeft + this.index * this.offsetWidth
						- 104 + "px";
				//匹配浮动层文字内容
				oP.innerHTML = "<em><b>" + (this.index)*2 + "</b> 分 "
						+ aMsg[this.index - 1].match(/(.+)\|/)[1] + "</em>"
						+ aMsg[this.index - 1].match(/\|(.+)/)[1]
			};

			//鼠标离开后恢复上次评分
			aLi[i - 1].onmouseout = function() {
				fnPoint();
				//关闭浮动层
				oP.style.display = "none"
			};

			//点击后进行评分处理
			aLi[i - 1].onclick = function() {
				iStar = this.index;
				oP.style.display = "none";
				oSpan.innerHTML = "<strong>" + (this.index)*2 + " 分</strong> "
				
				$.post("filmUser_save", {
					score : (this.index)*2,
					filmId : filmId,
					userId : userId
				})
				
			}
		}

		//评分处理
		function fnPoint(iArg) {
			//分数赋值
			iScore = iArg || iStar;
			for (i = 0; i < aLi.length; i++)
				aLi[i].className = i < iScore ? "on" : "";
		}
		
		$(window).unload(function() {//页面卸载，就是用户关闭页面、点击链接跳转到其他页面或者刷新页面都会执行  
			end = new Date();//用户退出时间  
			watchTime = end.getTime() - start.getTime();//停留时间=退出时间-开始时间（得到的是一个整数，应该是毫秒为单位，1秒=1000）  
			$.post("filmUser_update", {
				watchTime : watchTime,
				filmId : filmId,
				userId : userId
			});
		});

	};