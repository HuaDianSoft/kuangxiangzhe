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
<title>管理员登录 - 狂想者比价</title>
<link rel="stylesheet" type="text/css" href="css1/basic.css">
<script type="text/javascript">
	function ready() {
		i = 0;
		window.setInterval("change()", 50);
	}

	function change() {
		var str = document.getElementById("top-word");
		if (i < 800) {
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
	<div id="container">
    	<!-- ----------- Header ----------- -->
        <div id="header">
        	<span id="top-word" style="color:#FF6633">狂想者比价网欢迎您</span>
        </div>
        
        <!-- --------------mainContent-------------- -->
        <div id="mainContent">
        	<h1>狂想者比价网</h1>
            <h3>管理员登录界面</h3>
            <div id="main">
                <form action="adminlogin.do" method="post">
                    <div class="line">
                    <div class="tishi">管理员名：</div>
                    <input type="text" name="uname" id="uname"/>
                    <span id="uname_desc"></span>
                    </div>
                    
                    <div class="line">
                    <div class="tishi">密码：</div>
                    <input type="password" name="upwd" id="upwd"/>
                    <span id="upwd_desc"></span>
                    </div>
                    
                    <div class="line">
                    <div class="tishi">&nbsp;</div>
                    <input type="image" src="img/denglu.png" width="136" height="38"/>
                    </div>
                </form>
            </div>
        </div>
        
        <!-- --------footer----------- -->
        <div id="footer">
        </div>
    </div>
</body>
</html>

