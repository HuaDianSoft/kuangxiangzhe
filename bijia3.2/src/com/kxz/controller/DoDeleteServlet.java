package com.kxz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.UserManagerImp;

@WebServlet(urlPatterns="/delete.do")
public class DoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		int uno = Integer.parseInt(request.getParameter("uno"));
		/**2服务器端验证**/
		/**3执行业务逻辑**/
		int result = new UserManagerImp().delUser(uno);
		
		/**4请求转发**/
		if(result>0){
			request.getRequestDispatcher("showall.do").forward(request,response);
		}
		return;
	}

}
