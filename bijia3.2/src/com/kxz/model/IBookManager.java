package com.kxz.model;

import java.util.List;

import com.kxz.vo.Book;

public interface IBookManager {
	/**
	 * ����鼮
	 * @param book �鼮���� �������鼮 ����������
	 * @return	
	 * -100:����ʧ��
	 * -200��ִ��SQL���ʧ��
	 * ����0����ӳɹ�
	 */
	public int add(Book book);

	/**
	 * ��ѯ�����鼮
	 * @return	���ݼ۸����򷵻ش����ݿ��в�ѯ���������鼮�ļ���
	 */
	public List<Book> queryAllASC(int currentRecord,int pagesize);
	/**
	 * ��ѯ�����鼮
	 * @return	���ݼ۸��򷵻ش����ݿ��в�ѯ���������鼮�ļ���
	 */
	public List<Book> queryAllDESC();
	
	/**
	 * ����id��ѯ
	 * @param id ĳһ����bookid����
	 * @return	����id��ѯ�����鼮����
	 */
	public Book queryById(int id);
	
	/**
	 * ͬ��idɾ������
	 * @param id ĳһ����bookid����
	 * @return
	 * -100:����ʧ��
	 * -200��ִ��SQL���ʧ��
	 * ����0��ɾ���ɹ�
	 */
	public int deleteById(int id);
	
	/**
	 * ͨ��ĳһidֵ�����鼮���鼮����
	 * @param book �鼮���� �������鼮 ����������
	 * @param id ĳһ����bookid����
	 * @return
	 * -100:����ʧ��
	 * -200��ִ��SQL���ʧ��
	 * ����0��ɾ���ɹ�
	 */
	public int update(Book book, int id);
	/**
	 * ģ����ѯ ͨ���ؼ���---pw���ҷ���Ҫ����鼮
	 * @param String pw �ؼ���
	 * @return  List<Book>
	 * 		null:����ʧ��
	 * 		
	 * 		
	 * */
	public List<Book> queryBookBypw(String pw);
}
