package com.kxz.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.UserManagerImp;
import com.kxz.vo.User;

@WebServlet(urlPatterns="/showall.do")
public class DoShowAllUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request,response);

	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		/**2服务器端验证**/
		/**3执行业务逻辑**/
		List<User> users = new UserManagerImp().queryAllUser();
		/**4页面跳转，显示处理结果**/
		request.setAttribute("users",users);
		request.getRequestDispatcher("/WEB-INF/jsp/showAll.jsp").forward(request,response);
		return;
	}

}
