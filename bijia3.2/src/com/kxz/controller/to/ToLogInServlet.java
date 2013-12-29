package com.kxz.controller.to;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/tologin.do")
public class ToLogInServlet extends HttpServlet {
//跳转到登录页面
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		/**2服务器端验证**/
		/**3执行业务逻辑**/
		/**4请求转发**/
		request.getRequestDispatcher("/WEB-INF/jsp/logIn.jsp").forward(request, response);
	}
}
