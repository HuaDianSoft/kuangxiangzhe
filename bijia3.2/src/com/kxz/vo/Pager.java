package com.kxz.vo;

import java.util.ArrayList;
import java.util.List;

public class Pager {
	    private int currentPage;//当前页数
	    private int firstPage=1;//首页
	    private int prePage;  //上一页
	    private int nextPage;//下一页
	    private int totalPage;//总页数/尾页
	    private int totalRecord;//总的记录条数
	    private int currentRecord;//当前记录的条数
	    private int pageSize;//每页显示的记录数量
	    private List<Book> list=new ArrayList<Book>();
	public int getCurrentPage() {
	   return currentPage;
	}
	public void setCurrentPage(int currentRecord,int pageSize ) {
	      
	    currentPage = (currentRecord-1)/pageSize+1;
	   
	}
	
	public int getFirstPage() {
		return firstPage;
	}
	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}
	public int getPrePage() {
		return (this.currentPage-1==0?1:this.currentPage-1);
	}
	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}
	public int getNextPage() {
		return  (this.currentPage==this.totalPage?this.totalPage:this.currentPage+1);
	}
	
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setCurrentRecord(int currentRecord) {
		this.currentRecord = currentRecord;
	}
	public int getCurrentRecord() {
	   return currentRecord;
	}
	public void setCurrentRecord(int currentPage,int pageSize) {
		 currentRecord=(currentPage-1)*pageSize;
	}
	public int getPageSize() {
	   return pageSize;
	}
	public void setPageSize(int pageSize) {
	   this.pageSize = pageSize;
	}
	public int getTotalPage() {
	   return totalPage;
	}
	public void setTotalPage(int totalRecord,int pageSize) {
	  
	    totalPage = (totalRecord-1)/pageSize+1;
	   
	}
	public int getTotalRecord() {
	   return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
	   this.totalRecord = totalRecord;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	

}
