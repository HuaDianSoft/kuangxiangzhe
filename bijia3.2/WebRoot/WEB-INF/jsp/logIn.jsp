<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'logIn.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录 - 狂想者比价</title>
<script type="text/javascript"
	src="http://img.jb51.net/jslib/jquery/jquery-1.2.6.js"></script>
<script type="text/javascript"
	src="http://img.jb51.net/jslib/jquery/tween.js"></script>
<script type="text/javascript" src="js/picplayer.js"></script>
<link href="css/basic.css" rel="stylesheet" />
<script type="text/javascript">
	function ready() {
		i = 0;
		window.setInterval("change()", 50);
	}

	function change() {
		var str = document.getElementById("top-word");
		if (i < 320) {
			i = i + 2;
			str.style.marginLeft = i + "px";

		} else {
			i = 0;
			str.style.marginLeft = i + "px";
		}

	}
</script>

</head>

<body  onload="ready()">
	<div>
    	<%@include file="header.jsp" %>
		<div class="clear"></div>
        <div id="main">
        	<div id="main1">
            	<img src="img/cLogo.png"/>
            </div>
            <div class="clear"></div>
            <div id="main2">
            	<div id="left">
                	<div id="picplayer" style="position:relative;overflow:hidden;width:520px;height:400px;clear:none;border:solid 1px #ccc;"> 
            there is a pic-player 
        			</div> 
                </div>
                <div id="right">
                	<div id="title">
                    	<h1>用户登录</h1>
                    </div>
                        <form action="login.do" method="post">
                	<div class="line">
                    	<div class="tishi">用户名：</div>
                        <input type="text" name="uname" />
                        <div class="tishi">&nbsp;</div>
                        <div id="err"></div>
                    </div>
                    <div class="line">
                        <div class="tishi">密&nbsp;&nbsp;码：</div>
                        <input type="password" name="upwd" />
                        <div class="tishi">&nbsp;</div>
                        <div id="err"></div>
                    </div>
                    
                    <div class="line">
                    <input type="checkbox" style="margin:5px;margin-left:80px;width:13px;" /><span style="font-size:13px;color:#555">下次自动登录</span>
                    </div>
                    <div class="line">
                        <div class="tishi">&nbsp;</div>
                        <input type="image" src="img/denglu.png" width="136" height="38"/>
                    </div>
                    </form>
                </div>
            </div>
			<div class="clear"></div>
    	</div>
        
        <%@include file="footer.jsp" %>
    </div>
    
</body>
</html>
