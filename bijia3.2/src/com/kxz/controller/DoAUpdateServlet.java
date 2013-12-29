package com.kxz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kxz.model.BookManagerImpl;
import com.kxz.model.IBookManager;
import com.kxz.vo.Book;


public class DoAUpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8" );
		
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		String bookName = request.getParameter("bookName");
		double bookPrice = Double.parseDouble(request.getParameter("bookPrice"));
		String bookWeb = request.getParameter("bookWeb");
		String bookAuthor = request.getParameter("bookAuthor");
		String bookPicture = request.getParameter("bookPicture");
		String bookISBN =request.getParameter("bookISBN");
		String bookPubtime = request.getParameter("bookPubtime");
		String bookCBS =request.getParameter("bookCBS");
		
		Book book = new Book();
		book.setBookname(bookName);
		book.setBookprice(bookPrice);
		book.setBookweb(bookWeb);
		book.setBookauthor(bookAuthor);
		book.setBookpicture(bookPicture);
		book.setBookisbn(bookISBN);
		book.setBookpubtime(bookPubtime);
		book.setBookcbs(bookCBS);
		
		IBookManager manager = new BookManagerImpl();
		int result = manager.update(book, bookId);
		if(result>0){
			request.getRequestDispatcher("/WEB-INF/jsp/update_success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/WEB-INF/jsp/update_fail.jsp").forward(request, response);
			
		}
		
	}

}
