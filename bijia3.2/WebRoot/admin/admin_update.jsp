<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改管理员信息</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="30" background="img/tab/tab_05b.gif"><table
					width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="12" height="30"><img
							src="img/tab/tab_03l.gif" width="12" height="30" /></td>
						<td><table width="100%" border="0" cellspacing="0"
								cellpadding="0">
								<tr>
									<td width="46%" valign="middle"><table width="100%"
											border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td width="5%"><div align="center">
														<img src="img/tab/tb.gif" width="16" height="16" />
													</div></td>
												<td width="95%" class="STYLE4"><span class="STYLE3">您当前的位置是</span>：[修改管理员信息]</td>
											</tr>
										</table></td>
									<td width="54%"><table border="0" align="right"
											cellpadding="0" cellspacing="0">
											<tr>

											</tr>
										</table></td>
								</tr>

							</table></td>
						<td width="16"><img src="img/tab/tab_07.gif"
							width="16" height="30" /></td>
					</tr>
				</table></td>
		</tr>
	</table>
	<br />
	<form action="update.jsp" method="post">
		<table border="1" cellspacing="0" cellpadding="1" align="center">
			<tr>
				<td width="200" rowspan="6" colspan="2" align="center"
					valign="middle"><img src="../photo/admincher/${photo} "
					alt="照片" width="160" height="160"></td>
			</tr>
			<tr>
				<td height="30" width="100" align="center"><span class="STYLE1">姓&nbsp;&nbsp;&nbsp;&nbsp;名：</span>
				</td>
				<td><input type="text" name="aname"
					value="${aname}" />
				<td>
			</tr>
			<tr>
				<td width="100" height="30" align="center"><span class="STYLE1">性&nbsp;&nbsp;&nbsp;&nbsp;别：</span>
				</td>
				<td><input type="text" name="sex" value="${sex}" />
				<td>
			</tr>
			<tr>
				<td height="30" align="center"><span class="STYLE1">地&nbsp;&nbsp;&nbsp;&nbsp;址：</span>
				</td>
				<td><input type="text" name="address" value="${address}" />
				<td>
			</tr>
			<tr>
				<td height="30" align="center"><span class="STYLE1">电&nbsp;&nbsp;&nbsp;&nbsp;话：</span>
				</td>
				<td><input type="text" name="tel" value="${tel}" />
				<td>
			</tr>
			<tr>
			<tr>
				<td align="center" height="40" colspan="2"><input type="submit"
					value="提   交" onClick="window.close()"></td>
				<td align="center" height="40" colspan="2"><input type="reset"
					value="重   置" onClick="history.go(0)"></td>
			</tr>
		</table>
	</form>
</body>
</html>
