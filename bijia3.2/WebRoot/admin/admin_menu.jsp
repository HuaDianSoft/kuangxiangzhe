<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//Dtd HTML 4.01 transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'admin_menu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/menu.css">
<script language="javascript">
	function expand(el)
	{
		childObj = document.getElementById("child" + el);

		if (childObj.style.display == 'none')
		{
			childObj.style.display = 'block';
		}
		else
		{
			childObj.style.display = 'none';
		}
		return;
	}
</script>
</head>

<body>
	<table height="100%" cellSpacing=0 cellPadding=0 width=170 background="img/menu/menu_bg.jpg" border=0>
		<tr>
			<td valign=top align=middle>
				<table cellSpacing=0 cellPadding=0 width="100%" border=0>

					<tr>
						<td height=10></td>
					</tr>
				</table>
				<table cellSpacing=0 cellPadding=0 width=150 border=0>
					<tr height=22>
						<td style="PaDDING-LEFT: 30px"
							background="img/menu/menu_bt.jpg"><a class=menuParent
							onclick=expand(1) href="javascript:void(0);">个人中心</a></td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>
				<table id=child1 style="DISPLaY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
						 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/admin_info.jsp"
							target="rightFrame">查看个人资料</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/admin_update.jsp"
							target="rightFrame">修改个人资料</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/update_pwd.jsp"
							target="rightFrame">修改密码</a></td>
					</tr>
					<tr height=4>
						<td colSpan=2></td>
					</tr>
				</table>
				<table cellSpacing=0 cellPadding=0 width=150 border=0>
					<tr height=22>
						<td style="PaDDING-LEFT: 30px"
							background=img/menu/menu_bt.jpg><a class=menuParent
							onclick=expand(4) href="javascript:void(0);">用户信息</a></td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>
				<table id=child4 style="DISPLaY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/adduser.jsp"
							target="rightFrame">添加用户</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/deleteuser.jsp"
							target="rightFrame">删除用户</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/queryuser.jsp"
							target="rightFrame">查看用户资料</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/updateuser.jsp"
							target="rightFrame">修改用户资料</a></td>
					</tr>
					<tr height=4>
						<td colSpan=2></td>
					</tr>
				</table>

				<table cellSpacing=0 cellPadding=0 width=150 border=0>
					<tr height=22>
						<td style="PaDDING-LEFT: 30px"
						 background="img/menu/menu_bt.jpg"><a class=menuParent
							onclick=expand(2) href="javascript:void(0);">书籍情况</a></td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>
				<table id=child2 style="display: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/querybook.jsp"
							target="rightFrame">分页浏览书籍</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/addbook.jsp"
							target="rightFrame">添加书籍</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							 src="img/menu/menu_icon.gif" width=9></td>
						<td><a class=menuChild href="admin/deletebook.jsp"
							target="rightFrame">删除书籍</a></td>
					</tr>
				</table>
				
			</td>
			<td width=1 bgColor=#d1e6f7></td>
		</tr>
	</table>
</body>
</html>