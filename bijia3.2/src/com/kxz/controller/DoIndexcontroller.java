package com.kxz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.BookManagerImpl;
import com.kxz.vo.Book;
import com.kxz.vo.Pager;
import com.mysql.jdbc.StringUtils;
@WebServlet(urlPatterns="/toindex.do")
public class DoIndexcontroller extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Pager page=new Pager();
        int pageSize=4;
        int pageCount=new BookManagerImpl().querytotalCount();
        int currentPage=1;
        
        if(request.getParameter("currentPage")!=null&&(request.getParameter("currentPage")).length()!=0){
           currentPage=Integer.parseInt(request.getParameter("currentPage"));
           System.out.println(currentPage);
        }
        page.setCurrentPage(currentPage);
        page.setPageSize(pageSize);
        page.setCurrentRecord(currentPage, pageSize);
        page.setTotalRecord(pageCount);
        page.setTotalPage(page.getTotalRecord(), pageSize);
        
        page.setNextPage(page.getNextPage());
        page.setPrePage(page.getPrePage());
        
        List<Book> list=new BookManagerImpl().queryAllASC(page.getCurrentRecord(), pageSize);
        page.setList(list);
        request.setAttribute("Pager", page);
        
        request.getRequestDispatcher("/WEB-INF/jsp/search.jsp").forward(request, response);
	   
        

	}

}
