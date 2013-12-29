package com.kxz.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.kxz.model.UserManagerImp;
import com.kxz.vo.Admin;
import com.kxz.vo.User;

public class TestManager {


	
	@Test
	public void testAdd(){
		com.kxz.vo.User user = new User("tom","123");
		int result = new UserManagerImp().addUser(user);
		System.out.print("result="+result);
	}
	
	@Test
	public void testQueryAll(){
		List<User> users = new UserManagerImp().queryAllUser();
		for(User user : users){
			System.out.println("name="+user.getUserName());
		}
	}
	
	@Test
	public void testQueryById(){
		User user = null;
		user = new UserManagerImp().queryById(2);
		System.out.println("user="+user);
	}
	
	@Test
	public void testQueryByName(){
		User user = null;
		user = new UserManagerImp().queryByName("tom");
		System.out.println("user="+user);
	}
   
	@Test
	public void testDel(){
		int uno = 4;
		int result = new UserManagerImp().delUser(uno);
		System.out.print("result="+result);
	}
	@Test
	public void testqueryByAdminName(){
		Admin admin = null;
		admin = new UserManagerImp().queryByAdminName("admin");
		System.out.println("admin="+admin);
	}
	
	@Test
	public void testupdate(){
		
		User user = new User(22,"xlf","xlf");
		int result = new UserManagerImp().upDate(user);
		System.out.println(result);
	}
	
}
