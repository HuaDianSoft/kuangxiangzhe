<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员详细信息</title>
    
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
    <td height="30" background="img/tab/tab_05b.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
        <td width="12" height="30"><img src="img/tab/tab_03l.gif" width="12" height="30" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="46%" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="5%"><div align="center"><img src="img/tab/tb.gif" width="16" height="16" /></div></td>
                <td width="95%" class="STYLE4"><span class="STYLE3">您当前的位置是</span>：[管理员详细信息]</td>
              </tr>
            </table></td>
            <td width="54%"><table border="0" align="right" cellpadding="0" cellspacing="0">
              <tr>
                            
              </tr>
            </table></td>
          </tr>
          
        </table></td>
        <td width="16"><img src="img/tab/tab_07.gif" width="16" height="30" /></td>
      </tr>
	 </table></td>
  </tr>	
</table>
		<br />
		<table border="1" cellspacing="0" cellpadding="1" align="center">
			<tr>
				<td height="30" width="100" align="center">
					<span class="STYLE1">编&nbsp;&nbsp;&nbsp;&nbsp;号：</span>
				</td>
				<td>
					<span class="STYLE2">&nbsp;${id }</span>
				</td>
				<td width="200" rowspan="6" colspan="2" align="center"
					valign="middle">
					<img src="../photo/admincher/${photo} " alt="照片"
						width="160" height="160">
				</td>
			</tr>
			<tr>
				<td height="30" width="100" align="center">
					<span class="STYLE1">姓&nbsp;&nbsp;&nbsp;&nbsp;名：</span>
				</td>
				<td>
					<span class="STYLE2">&nbsp;${aname }</span>
				</td>
			</tr>
				<tr>
				<td height="30" align="center">
					<span class="STYLE1">密&nbsp;&nbsp;&nbsp;&nbsp;码：</span>
				</td>
				<td>
				<span class="STYLE2">&nbsp;${apwd}</span>
				</td>
			</tr>
			
			<tr>
				<td width="100" height="30" align="center">
					<span class="STYLE1">性&nbsp;&nbsp;&nbsp;&nbsp;别：</span>
				</td>
				<td>
					<span class="STYLE2">&nbsp;${sex}</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="center">
					<span class="STYLE1">地&nbsp;&nbsp;&nbsp;&nbsp;址：</span>
				</td>
				<td>
					<span class="STYLE2">&nbsp;${address}</span>
				</td>
			</tr>
				<tr>
				<td height="30" align="center">
					<span class="STYLE1">电&nbsp;&nbsp;&nbsp;&nbsp;话：</span>
				</td>
				<td>
				<span class="STYLE2">&nbsp;${tel}</span>
				</td>
			</tr>
			<tr>
				<td align="center" height="30">
					<span class="STYLE1">上次登录的IP：</span>
				</td>
				<td>
					<span class="STYLE2">&nbsp;${ip}</span>
				</td>
				<td align="center" height="30">
					<span class="STYLE1">上次登录的时间：</span>
				</td>
				<td>
					<span class="STYLE2">&nbsp;${time}</span>
				</td>
			</tr>
		
			<tr>
			<tr>
				<td align="center" height="40" colspan="2">
					<input type="button" value="返回" onClick="javascript:window.history.go(-1)">
				</td>
				<td align="center" height="40" colspan="2">
					<input type="button" value="刷   新"onClick="javascript:location.reload()">
				</td>
			</tr>
		</table>
	</body>
</html>
