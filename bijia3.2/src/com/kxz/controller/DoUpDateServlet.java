package com.kxz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.UserManagerImp;
import com.kxz.vo.User;

@WebServlet(urlPatterns="/update.do")
public class DoUpDateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		int userId = Integer.parseInt(request.getParameter("userId"));
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");

		/**2服务器端验证**/
		/**3执行业务逻辑**/
		User user = new User(userId,userName,userPwd);
		int result = new UserManagerImp().upDate(user);
		/**4请求转发**/
		if(result>0){
			request.getRequestDispatcher("showall.do").forward(request, response);
		}
		return;
	}

}
