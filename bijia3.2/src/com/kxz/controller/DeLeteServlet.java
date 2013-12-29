package com.kxz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.BookManagerImpl;
import com.kxz.model.IBookManager;
public class DeLeteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8" );
		
		int id = Integer.parseInt(request.getParameter("id"));
		IBookManager manager = new BookManagerImpl();
		int result = manager.deleteById(id);
		//Map<String, String> map = new HashMap<String, String>();
		if(result>0){
			//map.put("success", "É¾³ý³É¹¦£¡");
			request.getRequestDispatcher("/WEB-INF/page/delete_success.jsp").forward(request, response);
		}else{
			//map.put("fail", "É¾³ýÊ§°Ü£¡");
			request.getRequestDispatcher("/WEB-INF/page/delete_fail.jsp").forward(request, response);
		}
		
		
	}

}
