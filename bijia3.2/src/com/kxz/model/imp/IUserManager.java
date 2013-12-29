package com.kxz.model.imp;

import java.util.List;

import com.kxz.vo.Admin;
import com.kxz.vo.User;

public interface IUserManager {
	/**
	 *����û�����
	 *@param user ����ӵ��û�  Ӧ���� userName,userPwd
	 *@return
	 *��ֵ����ӳɹ�,���ظ��û������ݿ��еı��>0
	 *��ֵ�����ʧ��
	 *-100 ���ݿ�����ʧ��
	 *-200 sql���ִ���쳣
	 */
	public int addUser(User user);
	
	
	/**
	 * ɾ���û�
	 * @param userId ��ɾ���û��ı��
	 * @return
	 * ��ֵ��ɾ���ɹ������ظ��û�ԭ�еı��
	 * ��ֵ��ɾ��ʧ��
	 * -100 ���ݿ�����ʧ��
	 * -200 sql���ִ���쳣
	 */
	public int delUser(int userId);
	
	
	/**
	 *��ѯ�����û�
	 *@return
	 *�������ݿ��е������û�
	 *���ݿ���û���û��򷵻�һ����СΪ0��List����
	 */
	public List<User> queryAllUser();
	
	
	
	/**
	 * �����û���Ų����û�
	 * @param  userId �û����
	 * @return
	 * û�в��ҵ��򷵻�null
	 * ���򷵻ظ��û�
	 */
	public User queryById(int userId);
	
	
	
	/**
	 * �����û��������û�
	 * @param  userName �û���
	 * @return
	 * û�в��ҵ��򷵻�null
	 * ���򷵻ظ��û�
	 */
	public User queryByName(String userName);
	
	
	
	/**
	 * �����û�����Ϣ
	 * @param  user �������û�  Ӧ���� userName,userPwd
	 * @return 
	 * ��ֵ�����³ɹ������ظ��û����
	 * ��ֵ������ʧ��
	 * -100  ���ݿ�����ʧ��
	 * -200 sql���ִ���쳣
	 */
	public int upDate(User user);
	
	
	/**
	 * ���ݹ���Ա�����ҹ���Ա
	 * @param  adminName �û���
	 * @return
	 * û�в��ҵ��򷵻�null
	 * ���򷵻ظ��û�
	 */
	public Admin queryByAdminName(String adminName);
}
