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

<title>My JSP 'admin_right.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/main.css">

</head>
<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="30" background="img/tab/tab_05b.gif"><table
					width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="12" height="30"><img src="img/tab/tab_03l.gif"
							width="12" height="30" /></td>
						<td><table width="100%" border="0" cellspacing="0"
								cellpadding="0">
								<tr>
									<td width="46%" valign="middle"><table width="100%"
											border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td width="5%"><div align="center">
														<img src="img/tab/tb.gif" width="16" height="16" />
													</div></td>
												<td width="95%" class="STYLE4"><span class="STYLE3">您当前的位置是</span>：[首页]-[管理员]</td>
											</tr>
										</table></td>
									<td width="54%"><table border="0" align="right"
											cellpadding="0" cellspacing="0">
											<tr>
											</tr>
										</table></td>
								</tr>

							</table></td>
						<td width="16"><img src="img/tab/tab_07.gif" width="16"
							height="30" /></td>
					</tr>
				</table></td>
		</tr>
	</table>
	<%
		/* String aname = (String) session.getAttribute("name");
		System.out.print("aname==>" + aname);
		String apwd = (String) session.getAttribute("pwd");
		Admin admin = new Admin(aname, apwd);
		String sql = "select aname,apassword,login_time,ip from admin where aname='"
				+ aname + "' ";
		Set<Admin> list = new HashSet();
		list = new AdminManager().query(sql);
		for (Admin a : list) {
			if (a != null) {
				admin = a;
			}
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = df.format(new Date(admin.getDate())); */
	%>
	<div>
		登录成功！欢迎回来:
		<%--=admin.getName()--%>
	</div>
	<div>
		您上次登录时间:
		<%--=time--%>
	</div>
	<div>
		您上次登录IP地址：
		<%--=admin.getIp()--%>
	</div>
</body>
</html>
