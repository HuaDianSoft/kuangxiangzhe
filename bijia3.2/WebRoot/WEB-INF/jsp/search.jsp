<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>My JSP 'search.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/basic.css" rel="stylesheet" />
<style type="text/css">
.star-rating {
	list-style: none;
	margin: 3px;
	padding: 0px;
	width: 90px;
	height: 15px;
	position: relative;
	background: url(img/star4.gif) top left repeat-x;
}

.star-rating li {padding：0px;
	margin: 0px;
	float: left;
}

.star-rating li a {
	display: block;
	width: 18px;
	height: 17px;
	text-decoration: none;
	text-indent: -9000px; z-index : 20;
	padding: 0px;
	background-image: none;
	z-index: 20;
}

.star-rating li a:hover {
	background: url(img/star4.gif) left bottom;
	z-index: 1;
	left: 0px;
}

.star-rating a,one-star {
	left: 0px;
}

.star-raing a,one-star:hover {
	width: 20px;
}

.star-rating a,two-stars {
	left: 40px;
}

.star-raing a,two-stars:hover {
	width: 40px;
}

.star-rating a,three-stars {
	left: 60px;
}

.star-raing a,three-stars:hover {
	width: 60px;
}

.star-rating a,four-stars {
	left: 80px;
}

.star-raing a,four-stars:hover {
	width: 80px;
}

.star-rating a,five-stars {
	left: 100px;
}

.star-raing a,five-stars:hover {
	width: 100px;
}
</style>
<script type="text/javascript">
	function appear(obj) {
		obj.style.borderColor = "#DEDEDE";
	}
	function disappear(obj) {
		obj.style.borderColor = "#F4F4F4";
	}

	var i = 1;
	function change(r) {
		i = -r;
		var price = document.getElementById("search-top-price");
		str1 = '<a href="tosearch.do" onclick="change(1)">价格↑</a>';
		str2 = '<a href="tosearch2.do" onclick="change(-1)">价格↓</a>';

		if (i == 1) {
			price.innerHTML = str1;
		} else {
			price.innerHTML = str2;
		}
	}
	function check() {
		var totalpage = document.getElementById("totalpage1");
		var page = document.getElementById("page");
		// alert(totalpage.value);
		//alert(page.value);
	}
	var a = [ 1, 1, 1, 1, 1 ];
	function ch(object, i) {
		a[i] = -a[i];
		if (a[i] == -1) {
			object.style.cssText = " background: url(img/star4.gif) left bottom;z-index: 1;left:0px;"
		} else {
			object.style.cssText = " background: url(img/star4.gif) top left repeat-x;z-index: 1;height:15px;left:0px;"
		}
	}
</script>
</head>

<body>

	<div>
		<div id="top">
			<span>欢迎来到狂想者图书比价网!</span> <span><a href="">请登录</a></span> <span><a
				href="" style="color:#ff6400">免费注册</a></span>
		</div>
		<div id="search">
			<div class="search_menu">
				<div class="cLogo">
					<a href="index.html"><img src="img/cLogo.png" /></a>
				</div>
				<div id="domain">
					<form name="f" action="dosearch.do" method="post">
						<input type="text" name="wd" id="word" value="输入书名，作者，出版社或者ISBN" />
						<input type="submit" value="" id="search11" style="cursor:hand" />
					</form>
				</div>
				<div id="clear"></div>
			</div>
		</div>
		<div id="search_main">
			<div class="right">
				<div class="search_top">
					<ul>
						<li><a href="script:void(0)" onClick="script:void(0)">默认排序</a></li>
						<li><a href="script:void(0)" onClick="script:void(0)">出版时间</a></li>
						<li id="search-top-price"></li>
					</ul>
				</div>
				<div id="bkinfo" class="search_main">
					<table id="showbk">


						<c:forEach items="${Pager.list }" var="c">
							<tr>
								<td width="800px">
									<div class="sku" onMouseMove="appear(this)"
										onmouseout="disappear(this)">
										<div class="pic">
											<a href=${c.bookweb}><img height="200px"
												src=${c.bookpicture } /></a>
										</div>

										<div class="title-panel">
											<div class="title">
												<a href=${c.bookweb}>${c.bookname}</a>
											</div>
											<div class="description">上市时间:${c.bookpubtime}</div>
											<div class="sales-volume">月销量 568件</div>
											<div style="">
												<ul class="star-rating">
													<li><a href="script:void(0)" title="" class="one-star"
														onclick="ch(this,0)">1</a></li>
													<li><a href="script:void(0)" title=""
														class="two-stars" onclick="ch(this,1)">2</a></li>
													<li><a href="script:void(0)" title=""
														class="three-stars" onclick="ch(this,2)">3</a></li>
													<li><a href="script:void(0)" title=""
														class="four-stars" onclick="ch(this,3)">4</a></li>
													<li><a href="script:void(0)" title=""
														class="five-stars" onclick="ch(this,4)">5</a></li>
												</ul>
											</div>
										</div>

										<div class="price-panel">
											<ul>
												<li><span class="ck-name"><a
														href="foreground/info.html">参考价</a></span><span class="ck-price"><a
														href="scirpt:void(0)">${c.bookprice}</a></span></li>
												<li><span class="jd-name"><a href=${c.bookweb}>京东</a></span><span
													class="jd-price"> <a href="scirpt:void(0)">${c.bookprice}元</a></span></li>
												<li><span class="dd-name"><a
														href="scirpt:void(0)">当当</a></span><span class="dd-price"><a
														href="scirpt:void(0)">28.30元</a></span></li>
												<li><span class="price-trend"><a
														href="foreground/1.html">价格走势</a></span></li>
											</ul>
										</div>

										<div class="comment-panel"></div>

									</div>
								</td>
							</tr>

						</c:forEach>
					</table>
				</div>
				<div align="center">
					<form href="toindex.do">
						<a href="toindex.do?currentPage=${Pager.firstPage }">首页</a> <a
							href="toindex.do?currentPage=${Pager.prePage }">上一页</a> <a
							href="toindex.do?currentPage=${Pager.nextPage }">下一页</a> <a
							href="toindex.do?currentPage=${Pager.totalPage }">尾页</a> <span
							style="color:#256EB1;font-size:13px;">当前${Pager.currentPage
							}/<span id="totalpage1">${Pager.totalPage }</span>页
							总${Pager.totalRecord}条 <span>到第</span><input id="page"
							name="currentPage" value=${Pager.currentPage } style="width:30px" />页<input
							type="submit" value="确定" id="sub" /><span>
					</form>

				</div>
			</div>
			<div class="left">
				<div class="search_top">
					<p>相关推荐</p>
				</div>
				<div class="search_main">
					<div class="tj-title-panel">
						<div class="tj-pic">
							<img src="img/sku1.jpg" />
						</div>
						<div class="tj-price">
							<p>￥28.00</p>
						</div>
						<div class="tj-title">
							<a href="script:void(0)">西游记</a>
						</div>
						<div class="tj-sales-volume">月销量 568件</div>
					</div>
					<div class="tj-title-panel">
						<div class="tj-pic">
							<img src="img/sku1.jpg" />
						</div>
						<div class="tj-price">
							<p>￥28.00</p>
						</div>
						<div class="tj-title">
							<a href="script:void(0)">西游记</a>
						</div>
						<div class="tj-sales-volume">月销量 568件</div>
					</div>
					<div class="tj-title-panel">
						<div class="tj-pic">
							<img src="img/sku1.jpg" />
						</div>
						<div class="tj-price">
							<p>￥28.00</p>
						</div>
						<div class="tj-title">
							<a href="script:void(0)">西游记</a>
						</div>
						<div class="tj-sales-volume">月销量 568件</div>
					</div>
					<div class="tj-title-panel">
						<div class="tj-pic">
							<img src="img/sku1.jpg" />
						</div>
						<div class="tj-price">
							<p>￥28.00</p>
						</div>
						<div class="tj-title">
							<a href="script:void(0)">西游记</a>
						</div>
						<div class="tj-sales-volume">月销量 568件</div>
					</div>
				</div>
			</div>

			<div id="clear"></div>
		</div>


		<div id="footer">
			<div id="footer1">
				<div id="footLink">
					<a href="about.html">关于我们</a> <span>&nbsp;</span> <a
						href="disclaimer.html">免责声明</a> <span>&nbsp;</span> <a
						href="sitemap.html">网站地图</a> <span>&nbsp;</span> <a
						href="links.html">友情链接</a> <span>&nbsp;</span> <a
						href="contact.html">联系我们</a>
					<p>Copyright @ 2010-2013 www.biyibi.com 狂想者</p>
					<p>
						旗下网站：<a href="index.html">狂想者图书比价网</a>
					</p>
				</div>
			</div>
		</div>

	</div>
</body>
</html>

