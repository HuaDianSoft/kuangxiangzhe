package com.kxz.controller.to;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ת����¼ҳ��
@WebServlet(urlPatterns="/toadminlogin.do")
public class ToAdminLogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1��ȡ��������**/
		/**2����������֤**/
		/**3ִ��ҵ���߼�**/
		/**4����ת��**/
		request.getRequestDispatcher("/WEB-INF/jsp/adminLogIn.jsp").forward(request, response);
	}
}
