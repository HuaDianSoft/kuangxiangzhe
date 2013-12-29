<%@page import="com.kxz.vo.User"%>
<%@ page language="java" import="java.util.*" import="com.ruilu.vo.User" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upDate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <% User user = (User)request.getAttribute("user");%>
    <form action="update.do" method="post">
    	
    		<div style="display: none">
    		<label for="userId">用户编号：</label>
			<input name="userId" type="text" value=<%=user.getUserId() %>>
    		</div>
    	
    		<div>
    		<label for="userName">用户名：</label>
			<input name="userName" type="text" value=<%=user.getUserName() %>>
			</div>
		
			<div>
			<label for="userPwd">密码：</label>
			<input name="userPwd" type="password" value=<%=user.getUserPwd() %>>
			</div>
		
			<div>
			<label for="userPwd2">确认密码：</label>
			<input name="userPwd2" type="password" value=<%=user.getUserPwd() %>>
			</div>
		
			<div>
			<input type="submit" value="提交"/>
			</div>
    	
    </form>
  </body>
</html>
