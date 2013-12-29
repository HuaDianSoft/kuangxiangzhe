package com.kxz.vo;

import java.util.ArrayList;
import java.util.List;

public class Pager {
	    private int currentPage;//��ǰҳ��
	    private int firstPage=1;//��ҳ
	    private int prePage;  //��һҳ
	    private int nextPage;//��һҳ
	    private int totalPage;//��ҳ��/βҳ
	    private int totalRecord;//�ܵļ�¼����
	    private int currentRecord;//��ǰ��¼������
	    private int pageSize;//ÿҳ��ʾ�ļ�¼����
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
