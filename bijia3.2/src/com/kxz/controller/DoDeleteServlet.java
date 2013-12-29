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
		/**1��ȡ��������**/
		int uno = Integer.parseInt(request.getParameter("uno"));
		/**2����������֤**/
		/**3ִ��ҵ���߼�**/
		int result = new UserManagerImp().delUser(uno);
		
		/**4����ת��**/
		if(result>0){
			request.getRequestDispatcher("showall.do").forward(request,response);
		}
		return;
	}

}
