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

<title>My JSP 'addbook.jsp' starting page</title>

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
												<td width="95%" class="STYLE4"><span class="STYLE3">您当前的位置是</span>：[添加书籍]</td>
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


	<form action="addbook1.jsp">
		<table width="308" height="191" border="1" align="center"
			cellpadding="1" cellspacing="0">
			<tr>
				<td height="30" width="101" align="center"><span class="STYLE1">书&nbsp;&nbsp;&nbsp;&nbsp;名：</span></td>
				<td width="168"><input type="text" name="b_name" />
			</tr>
			<tr>
				<td height="30" width="101" align="center"><span class="STYLE1">作&nbsp;&nbsp;&nbsp;&nbsp;者：</span>
				</td>
				<td><input type="text" name="b_author" />
			</tr>
			<tr>
				<td width="101" height="30" align="center"><span class="STYLE1">出版社：</span></td>
				<td><input type="text" name="b_chubanshe" />
			</tr>
			<tr>
				<td height="30" align="center"><span class="STYLE1">出版时间：</span>
				</td>
				<td><input type="text" name="b_chubansj" />
			</tr>
			<tr>
				<td height="30" align="center"><span class="STYLE1">ISBN</span>
				</td>
				<td><input type="text" name="ISBN" />
			</tr>
			<tr>
				<td height="30" align="center"><span class="STYLE1">价格</span></td>
				<td><input type="text" name="price" />
			</tr>
			<tr>
				<td align="center" height="34"><input type="submit"
					value="提   交" onClick="window.close()"></td>
				<td align="center" height="34"><input name="reset"
					type="reset" onClick="history.go(0)" value="重   置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
