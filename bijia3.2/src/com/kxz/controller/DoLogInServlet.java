package com.kxz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.UserManagerImp;
import com.kxz.vo.User;

@WebServlet(urlPatterns="/login.do")
public class DoLogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request,response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**1获取请求数据**/
		String userName = request.getParameter("uname");
	System.out.println(userName+"===");
		String userPwd = request.getParameter("upwd");
		
		/**2服务器端验证**/
		User user = null;
		int result = 0;
		user = new UserManagerImp().queryByName(userName);
		
		if(user==null){
			result = 1;  //该用户不存在
		}else if(!user.getUserPwd().equals(userPwd)){
			result = 2; //密码错误
		}
		
		System.out.println(result);
		/**3执行业务逻辑**/
		
		/**4页面跳转，显示处理结果**/
	    if(result==0){
	    	System.out.println(result);
	    	request.getRequestDispatcher("/WEB-INF/jsp/logIn_succ.jsp").forward(request,response);
	    }else{
	    	request.getRequestDispatcher("/WEB-INF/jsp/logIn.jsp").forward(request,response);
	    }
	    
	    return;
	
	}
}
