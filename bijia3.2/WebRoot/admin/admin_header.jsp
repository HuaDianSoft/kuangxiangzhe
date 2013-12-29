<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//Dtd HTML 4.01 transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'admin_header.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
<base href="http://localhost:8080/biyibi/" />
</head>
<body>
	<table cellSpacing=0 cellPadding=0 width="100%"
		background="img/top/header_bg.jpg" border=0>
		<tr height=56>
			<td width=260><img height=56 src="img/top/header-left.jpg"
				width=260></td>
			<td style="font-weigth: bold; color: #fff; padding-top: 20px"
				align=middle>
				<%
					if (session.getAttribute("name") != null)
						out.print("欢迎您，" + ((String) session.getAttribute("name")));
				%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
				src="img/top/quit.gif" width="16" height="16"> <a
				style="color: #fff" href="./common/logout.jsp">退出系统</a>
			</td>
			<td align="right" width="268"><img height="56"
				src="img/top/header_right.gif" width=268></td>
		</tr>
	</table>
	<table cellSpacing=0 cellPadding=0 width="100%" border=0>
		<tr bgColor=#1c5db6 height=4>
			<td></td>
		</tr>
	</table>
</BODY>
</HTML>