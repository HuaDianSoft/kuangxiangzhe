package com.kxz.controller.to;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.UserManagerImp;
import com.kxz.vo.User;

@WebServlet(urlPatterns="/toupdate.do")
public class ToUpDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1��ȡ��������**/
		int  userId = Integer.parseInt(request.getParameter("uno"));
		/**2����������֤**/
		/**3ִ��ҵ���߼�**/
		User user = new UserManagerImp().queryById(userId);
		/**4����ת��**/
		request.setAttribute("user", user);
		request.getRequestDispatcher("/WEB-INF/jsp/upDate.jsp").forward(request, response);
		return;
	}

}
