package com.kxz.model;

import java.util.List;

import com.kxz.vo.Book;

public interface IBookManager {
	/**
	 * 添加书籍
	 * @param book 书籍对象 ，包含书籍 的所有属性
	 * @return	
	 * -100:连接失败
	 * -200：执行SQL语句失败
	 * 大于0：添加成功
	 */
	public int add(Book book);

	/**
	 * 查询所有书籍
	 * @return	根据价格升序返回从数据库中查询到的所有书籍的集合
	 */
	public List<Book> queryAllASC(int currentRecord,int pagesize);
	/**
	 * 查询所有书籍
	 * @return	根据价格降序返回从数据库中查询到的所有书籍的集合
	 */
	public List<Book> queryAllDESC();
	
	/**
	 * 根据id查询
	 * @param id 某一本书bookid属性
	 * @return	根据id查询到的书籍对象
	 */
	public Book queryById(int id);
	
	/**
	 * 同过id删除数据
	 * @param id 某一本书bookid属性
	 * @return
	 * -100:连接失败
	 * -200：执行SQL语句失败
	 * 大于0：删除成功
	 */
	public int deleteById(int id);
	
	/**
	 * 通过某一id值更新书籍库书籍属性
	 * @param book 书籍对象 ，包含书籍 的所有属性
	 * @param id 某一本书bookid属性
	 * @return
	 * -100:连接失败
	 * -200：执行SQL语句失败
	 * 大于0：删除成功
	 */
	public int update(Book book, int id);
	/**
	 * 模糊查询 通过关键字---pw查找符合要求的书籍
	 * @param String pw 关键字
	 * @return  List<Book>
	 * 		null:连接失败
	 * 		
	 * 		
	 * */
	public List<Book> queryBookBypw(String pw);
}
