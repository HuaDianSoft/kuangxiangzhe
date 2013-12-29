package com.kxz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.UserManagerImp;
import com.kxz.vo.User;

@WebServlet(urlPatterns="/register.do")
public class DoRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		String userName = request.getParameter("uname");
		String userPwd = request.getParameter("upwd");

		
		/**2服务器端验证**/
		
		
		
		
		
		
		
		
		/**3执行业务逻辑**/
		int result = 0;
		User user = new User(userName,userPwd);

		result = new UserManagerImp().addUser(user);
		
		/**4页面跳转，显示处理结果**/
			request.setAttribute("result", result);
			request.getRequestDispatcher("/WEB-INF/jsp/register_succ.jsp").forward(request, response);
			return;
	}
}
