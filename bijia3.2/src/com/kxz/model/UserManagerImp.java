package com.kxz.model;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.kxz.model.imp.IUserManager;
import com.kxz.util.DBUtil;
import com.kxz.vo.Admin;
import com.kxz.vo.User;

public class UserManagerImp implements IUserManager {

	@Override
	public int addUser(User user) {
		int result = 0;
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "INSERT INTO bj_user (userId,userName,userPwd)VALUES(NULL,?,?)";    
		try {
			pstmt = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getUserPwd());
			int count = pstmt.executeUpdate();
			if(count==1){
				rs = pstmt.getGeneratedKeys();
				if(rs.next()){
					result = rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			result = -200;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delUser(int userId) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConnection();
		String sql = "DELETE FROM bj_user WHERE userId=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			int count = pstmt.executeUpdate();
			if(count==1){
				result =userId;
			}
		} catch (SQLException e) {
			result = -200;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<User> queryAllUser() {
		List<User> users = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "SELECT userId,userName,userPwd FROM bj_user";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int userId = rs.getInt("userId");
				String userName = rs.getString("userName");
				String userPwd = rs.getString("userPwd");

				User user = new User(userId,userName,userPwd);
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User queryById(int userId) {
		User user = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "SELECT userName,userPwd FROM bj_user WHERE userId=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			while(rs.next()){
				String userName = rs.getString("userName");
				String userPwd = rs.getString("userPwd");
	
				user = new User(userId,userName,userPwd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public User queryByName(String userName){
		User user = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql="SELECT userId,userPwd FROM bj_user WHERE userName=?";		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			rs = pstmt.executeQuery();
			System.out.println("userName===="+userName);
			while(rs.next()){
				int userId = rs.getInt("userId");
				System.out.println(userId+"====");
				String userPwd = rs.getString("userPwd");
				user = new User(userId,userName,userPwd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public int upDate(User user){
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConnection();
		String sql = "UPDATE bj_user SET userName=?,userPwd=?WHERE userId=?";
		try {
			pstmt = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1,user.getUserName());
			pstmt.setString(2,user.getUserPwd());
			pstmt.setInt(3,user.getUserId());
			int count = pstmt.executeUpdate();
			if(count==1){
				result = user.getUserId();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			result = -200;
		}
		return result;
	}
	@Override
	public Admin queryByAdminName(String adminName){
		Admin admin = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql="SELECT adminId,adminPwd FROM bj_admin WHERE adminName=?";		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, adminName);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int adminId = rs.getInt("adminId");
				String adminPwd = rs.getString("adminPwd");
	
				admin = new Admin(adminId,adminName,adminPwd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admin;
	}
}
