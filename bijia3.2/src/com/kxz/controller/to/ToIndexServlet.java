package com.kxz.controller.to;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/index.jsp")
public class ToIndexServlet extends HttpServlet {
//跳转到首页
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		/**2服务器端验证**/
		/**3执行业务逻辑**/
		/**4请求转发**/
		System.out.println("in");
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
			//request.getRequestDispatcher("/WEB-INF/foreground/index.html").forward(request, response);
	}
}
