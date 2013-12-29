<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<%
	String name = (String) session.getAttribute("name");
	String pwd = (String) session.getAttribute("pwd");
%>
<title>update admin's password</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/main.css">

<script type="text/javascript">


function checkdata() {  
	var pwd0=form.pwd0.value;
	var pwd=<%=pwd%>;
	if(!checkPassword(pwd0,pwd))return false;//旧密码检查
    var pwd1 = form.pwd.value;  
    if (!checkPassword1(pwd1)) return false;  //新密码1检查  
    var pwd2 = form.pwd2.value;  
    if (!checkPassword1(pwd2)) return false;  //确认密码检查  
 
}
function checkPassword(pwd0,pwd){
	if(pwd0!=pwd){
		 document.getElementById("pwd0Err").innerHTML = "<font color='red'>密码错误！</font>";  
         form.pwd0.focus();  
         return false;  
	} 
	document.getElementById("pwd0Err").innerHTML = "";  
    return true;  
}

function checkPassword1(pwd1) {  
      if(strlen(pwd1)<6 || strlen(pwd1)>16 ) {  
            //alert("/正确地登录密码长度为6-16位，仅可用英文、数字、特殊字符！")  
            document.getElementById("pwdErr").innerHTML = "<font color='red'>正确地登录密码长度为6-16位，仅可用英文、数字、特殊字符！</font>";  
            form.pwd.focus();  
            return false;  
      }  
       
      if( strlen2(pwd1) ) {  
            //alert("/您的密码中包含了非法字符，仅可用英文、数字、特殊字符！")  
            document.getElementById("pwdErr").innerHTML = "<font color='red'>您的密码中包含了非法字符，仅可用英文、数字、特殊字符！</font>";  
            form.pwd.focus();  
            return false;  
      }  
      document.getElementById("pwdErr").innerHTML = "";  
      return true;  
}  
//确认密码检查  
function checkPassword2(pwd2) {  
       
      if( pwd2 =="" ) {  
            //alert("/请输入密码确认！")  
            document.getElementById("pwd2Err").innerHTML = "<font color='red'>请输入密码确认！</font>";  
            form.pwd2.focus() ; 
            return false;  
      }  
      if( pwd2 != form.pwd.value ) {  
            //alert("/两次密码输入不一致！")  
            document.getElementById("pwd2Err").innerHTML = "<font color='red'>两次密码输入不一致！</font>";  
            form.pwd2.focus() ; 
            return false;  
      }  
      document.getElementById("pwd2Err").innerHTML = "";  
      return true;  
}  
function strlen(str){  
    var len;  
    var i;  
    len = 0;  
    for (i=0;i<str.length;i++){  
          if (str.charCodeAt(i)>255) len+=2;
          else len++;  
    }  
    return len;  
} 
function strlen2(str){  
    var i;  
    for (i=0;i<str.length;i++){  
          if (str.charCodeAt(i)>255) return true;  
    }  
    return false;  
}  

</script>
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
												<td width="95%" class="STYLE4"><span class="STYLE3">您当前的位置是</span>：[修改管理员密码]</td>
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
	<form name="form" action="updatepassword.jsp" method="post"
		onsubmit="return checkdata()">
		<table align="center">
			<tr>
				<td>请输入旧密码：</td>
				<td><input type="text" name="pwd0"
					onblur="checkPassword(this.value,<%=pwd%>)"> <span
					id="pwd0Err"></span></td>
			</tr>
			<tr>
				<td>请输入新密码：</td>
				<td><input type="text" name="pwd"
					onblur="checkPassword1(this.value)"> <span id="pwdErr"></span>
				</td>
			</tr>
			<tr>
				<td>请再次输入：</td>
				<td><input type="text" name="pwd2" onfocus="check()"
					onblur="checkPassword2(this.value)"> <span id="pwd2Err"></span>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>

</body>
</html>