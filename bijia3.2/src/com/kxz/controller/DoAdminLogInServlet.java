package com.kxz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.UserManagerImp;
import com.kxz.vo.Admin;

@WebServlet(urlPatterns="/adminlogin.do")
public class DoAdminLogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request,response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		String adminName = request.getParameter("aname");
		String adminPwd = request.getParameter("apwd");
		
		/**2服务器端验证**/
		Admin admin = null;
		int result = 0;
		admin = (new UserManagerImp()).queryByAdminName(adminName);
		if(admin==null){
			result = 1;  //该用户不存在
		}else if(!(admin.getAdminPwd()).equals(adminPwd)){
			result = 2; //密码错误
		}
		
		
		/**3执行业务逻辑**/
		
		/**4页面跳转，显示处理结果**/
	    if(result==0){
	    	request.getRequestDispatcher("/WEB-INF/jsp/adminLogIn_succ.jsp").forward(request,response);
	    }else{
	    	request.getRequestDispatcher("/WEB-INF/jsp/adminLogIn.jsp").forward(request,response);
	    }
	    
	    return;
	
	}
}
