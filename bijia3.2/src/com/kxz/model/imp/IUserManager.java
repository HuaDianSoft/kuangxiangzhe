package com.kxz.model.imp;

import java.util.List;

import com.kxz.vo.Admin;
import com.kxz.vo.User;

public interface IUserManager {
	/**
	 *添加用户方法
	 *@param user 待添加的用户  应包含 userName,userPwd
	 *@return
	 *正值：添加成功,返回该用户在数据库中的编号>0
	 *负值：添加失败
	 *-100 数据库连接失败
	 *-200 sql语句执行异常
	 */
	public int addUser(User user);
	
	
	/**
	 * 删除用户
	 * @param userId 待删除用户的编号
	 * @return
	 * 正值：删除成功，返回该用户原有的编号
	 * 负值：删除失败
	 * -100 数据库连接失败
	 * -200 sql语句执行异常
	 */
	public int delUser(int userId);
	
	
	/**
	 *查询所有用户
	 *@return
	 *返回数据库中的所有用户
	 *数据库中没有用户则返回一个大小为0的List对象
	 */
	public List<User> queryAllUser();
	
	
	
	/**
	 * 根据用户编号查找用户
	 * @param  userId 用户编号
	 * @return
	 * 没有查找到则返回null
	 * 否则返回该用户
	 */
	public User queryById(int userId);
	
	
	
	/**
	 * 根据用户名查找用户
	 * @param  userName 用户名
	 * @return
	 * 没有查找到则返回null
	 * 否则返回该用户
	 */
	public User queryByName(String userName);
	
	
	
	/**
	 * 更新用户的信息
	 * @param  user 待更新用户  应包含 userName,userPwd
	 * @return 
	 * 正值：更新成功，返回该用户编号
	 * 负值：更新失败
	 * -100  数据库连接失败
	 * -200 sql语句执行异常
	 */
	public int upDate(User user);
	
	
	/**
	 * 根据管理员名查找管理员
	 * @param  adminName 用户名
	 * @return
	 * 没有查找到则返回null
	 * 否则返回该用户
	 */
	public Admin queryByAdminName(String adminName);
}
