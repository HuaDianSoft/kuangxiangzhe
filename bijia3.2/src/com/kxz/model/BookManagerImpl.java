package com.kxz.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kxz.util.DBUtil;
import com.kxz.vo.Book;

public class BookManagerImpl implements IBookManager{

	@Override
	public int add(Book book) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "INSERT INTO bj_book (bookName,bookPrice,bookWeb,bookAuthor,bookPicture,bookISBN,bookPubtime,bookCBS) VALUES (?,?,?,?,?,?,?,?)";
		System.out.println(sql);
		try {
			conn = DBUtil.getConnection();
		} catch (Exception e) {
			return result = -100;
		}
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookname());
			pstmt.setDouble(2, book.getBookprice());
			pstmt.setString(3, book.getBookweb());
			pstmt.setString(4, book.getBookauthor());
			pstmt.setString(5, book.getBookpicture());
			pstmt.setString(6, book.getBookisbn());
			pstmt.setString(7, book.getBookpubtime());
			pstmt.setString(8, book.getBookcbs());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -200;
			e.printStackTrace();
		}finally{
			DBUtil.close(pstmt, conn);
		}
		return result;
	}

	@Override
	public List<Book> queryAllASC(int currentRecord,int pagesize) {
		List<Book> list = new ArrayList<Book>();
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt=null;
		String sql = "SELECT bookId,bookName,bookPrice,bookWeb,bookAuthor,bookPicture,bookISBN,bookPubtime,bookCBS FROM bj_book ORDER BY bookPrice ASC LIMIT "+currentRecord+","+pagesize+"";
		
		try {
			conn = DBUtil.getConnection();
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				Book book = new Book();
				
				book.setBookid(rs.getInt("bookId"));
				book.setBookname(rs.getString("bookName"));
				book.setBookprice(rs.getDouble("bookPrice"));
				book.setBookweb(rs.getString("bookWeb"));
				book.setBookauthor(rs.getString("bookAuthor"));
				book.setBookpicture(rs.getString("bookPicture"));
				book.setBookisbn(rs.getString("bookISBN"));
				book.setBookpubtime(rs.getString("bookPubtime"));
				book.setBookcbs(rs.getString("bookCBS"));
				list.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, stmt, conn);
		}
		return list;
	}
	@Override
	public List<Book> queryAllDESC() {
		List<Book> list = new ArrayList<Book>();
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs = null;
		String sql = "SELECT bookId,bookName,bookPrice,bookWeb,bookAuthor,bookPicture,bookISBN,bookPubtime,bookCBS FROM bj_book ORDER BY bookPrice DESC";
		
		try {
			conn = DBUtil.getConnection();
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				Book book = new Book();
				
				book.setBookid(rs.getInt("bookId"));
				book.setBookname(rs.getString("bookName"));
				book.setBookprice(rs.getDouble("bookPrice"));
				book.setBookweb(rs.getString("bookWeb"));
				book.setBookauthor(rs.getString("bookAuthor"));
				book.setBookpicture(rs.getString("bookPicture"));
				book.setBookisbn(rs.getString("bookISBN"));
				book.setBookpubtime(rs.getString("bookPubtime"));
				book.setBookcbs(rs.getString("bookCBS"));
				list.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, stmt, conn);
			
		}
		return list;
	}

	@Override
	public Book queryById(int id) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt=null;
		String sql = "SELECT bookId,bookName,bookPrice,bookWeb,bookAuthor,bookPicture,bookISBN,bookPubtime,bookCBS FROM bj_book WHERE bookId="+id+"";
		System.out.println(sql);
		Book book = new Book();
		try {
			conn = DBUtil.getConnection();
			stmt=conn.createStatement();
			rs =stmt.executeQuery(sql);
			while(rs.next()){
				book.setBookid(rs.getInt("bookId"));
				book.setBookname(rs.getString("bookName"));
				book.setBookprice(rs.getDouble("bookPrice"));
				book.setBookweb(rs.getString("bookWeb"));
				book.setBookauthor(rs.getString("bookAuthor"));
				book.setBookpicture(rs.getString("bookPicture"));
				book.setBookisbn(rs.getString("bookISBN"));
				book.setBookpubtime(rs.getString("bookPubtime"));
				book.setBookcbs(rs.getString("bookCBS"));
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}finally{
			DBUtil.close(rs, stmt, conn);
		}
		return book;
	}

	@Override
	public int deleteById(int id) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String sql = "DELETE FROM bj_book WHERE bookId="+id+"";
		try {
			conn = DBUtil.getConnection();
		} catch (Exception e) {
			return result = -100;
		}
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			result = -200;
		}finally {
			DBUtil.close(stmt, conn);
		}
		return result;
	}

	@Override
	public int update(Book book, int id) {
		int count = 0;
		PreparedStatement pstmt =null;
		Connection conn = null;  
	    String sql = "update bj_book set bookName=?,bookPrice=?,bookWeb=?,bookAuthor=?,bookPicture=?,bookISBN=?,bookPubtime=?,bookCBS=? where bookId="+id+"";
	    System.out.println(sql);
	    try {
			conn = DBUtil.getConnection();
		} catch (Exception e1) {
			return count = -100;
		}
	    try {  
	    	pstmt = conn.prepareStatement(sql); 
	    	pstmt.setString(1, book.getBookname());
			pstmt.setDouble(2, book.getBookprice());
			pstmt.setString(3, book.getBookweb());
			pstmt.setString(4, book.getBookauthor());
			pstmt.setString(5, book.getBookpicture());
			pstmt.setString(6, book.getBookisbn());
			pstmt.setString(7, book.getBookpubtime());
			pstmt.setString(8, book.getBookcbs());
	        count = pstmt.executeUpdate(); 
	    } catch (Exception e) {  
	    	e.printStackTrace();
	        count =-200;  
	    }finally{  
	        DBUtil.close(pstmt, conn);  
	    }
	    return count;
	}
	public int querytotalCount() {
		int recordCount=0;
		String sql=" SELECT count(*) FROM bj_book";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()){
				recordCount=rs.getInt("count(*)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, pstmt, conn);
		}
		return recordCount;
	}

	@Override
	public List<Book> queryBookBypw(String pw) {
		List<Book>list = null;
		Connection conn = DBUtil.getConnection();
		if(conn!=null){
			list = new ArrayList<Book>();
			PreparedStatement pstmt = null;
			ResultSet rs =null;
			String sql = "SELECT bookId,bookName,bookPrice,bookWeb,bookAuthor,bookISBN,bookPubtime,bookCBS FROM bj_book WHERE bookName LIKE '%С˵%'";
			try {
				pstmt = conn.prepareStatement(sql);
				//pstmt.setString(1,pw);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Book book = new Book();
					book.setBookid(rs.getInt("bookId"));
					book.setBookname(rs.getString("bookName"));
					book.setBookprice(rs.getDouble("bookPrice"));
					book.setBookweb(rs.getString("bookWeb"));
					book.setBookauthor(rs.getString("bookAuthor"));
					//book.setBookpicture(rs.getString("bookPicture"));
					book.setBookisbn(rs.getString("bookISBN"));
					book.setBookpubtime(rs.getString("bookPubtime"));
					book.setBookcbs(rs.getString("bookCBS"));
					list.add(book);
				}
				System.out.println(list.size());
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				DBUtil.close(rs, pstmt, conn);
			}
			
		}
		return list;
	}
	

}
