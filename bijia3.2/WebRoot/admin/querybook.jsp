<%--@page import="com.vo.Book"--%>
<%@page import="java.util.List"%>
<%--@page import="com.util.PageModel"--%>
<%--@page import="com.model.BookPage"--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'querybook.jsp' starting page</title>
    
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
                <td width="95%" class="STYLE4"><span class="STYLE3">您当前的位置是</span>：[浏览书籍]</td>
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
<table align="center">
	<tr><th>ID</th><th>书名</th><th>作者</th><th>出版社</th><th>出版时间</th><th>ISBN号</th><th>价格</th></tr>
<%--
int page1=0;
PageModel<Book> pageModel=null;
if(request.getParameter("page1")!=null){
	page1=Integer.parseInt(request.getParameter("page1"));
	 pageModel=BookPage.findBooks(page1, 8); 
}else{
	 pageModel=BookPage.findBooks(1, 8);
} 
List<Book> list=pageModel.getList(); 
for(Book a:list){ 
	--%>
	<%-- <tr><td align="center"><%=a.getB_id() %></td><td align="center"><%=a.getB_name() %></td><td><%=a.getB_auhor() %></td><td align="center"><%=a.getB_chubanshe() %></td><td align="center"><%=a.getDate()%></td><td align="center"><%=a.getISBN() %></td><td align="center"><%=a.getPrice() %></td></tr> --%>
	<%--
}
--%>
<%-- <tr><th>共<%=pageModel.getTotalPages()%>页</th><th>当前第<%=pageModel.getPageNo() %>页</th><th><a href="querybook.jsp?page1=<%=pageModel.getTopPageNo()%>">首页 </a></th><th><a href="querybook.jsp?page1=<%=pageModel.getPreviousPageNo()%>">上一页 </a></th><th><a href="querybook.jsp?page1=<%=pageModel.getNextPageNo()%>">下一页 </a></th><th><a href="querybook.jsp?page1=<%=pageModel.getBottomPageNo() %>">尾页</a></th><th>共条<%=pageModel.getTotalRecords() %>记录</th> </tr> --%>
</table>
</body>
</html>
