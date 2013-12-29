<%@page import="com.kxz.vo.User"%>
<%@ page language="java" import="java.util.*"  import="com.fengqi.vo.User" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userManager.jsp' starting page</title>
    
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
    <h1>用户列表</h1>
    <%
    List<User> users = (List<User>)request.getAttribute("users");
    %>
    <table>
		<thead>
		<tr>
			<th>用户编号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>性别</th>
			<th>生日</th>
			<th>地址</th>
			<th>邮箱</th>
			<th>电话</th>
			<th>爱好</th>
			<th>个人签名</th>
			<th>操作</th>
		</tr>
		</thead>
		
		<tbody>

		<%
		for(User user :users){
			
		%>
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getUserName()%></td>
			<td><%=user.getUserPwd()%></td>

			<td><a href="del.do?uno=<%=user.getUserId()%>">删除</a>&nbsp;<a href="update.to?uno=<%=user.getUserId() %>">修改</a></td>
		</tr>
		<%}%>
		</tbody>
    </table>
    <a href="index.to">返回首页</a>

  </body>
</html>
