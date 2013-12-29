package com.kxz.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	private static final String CONFIG_NAME = "dbconfig.properties";
	private static String driver;
	private static String url;
	private static String uname;
	private static String upwd;

	static { // 自动执行且仅执行一次
		try {
			// 加载项目配置信息
			InputStream is = DBUtil.class.getClassLoader().getResourceAsStream(
					CONFIG_NAME);
			Properties ps = new Properties();
			ps.load(is); // 从输入流中加载属性数据——键值对，忽略#开头的行
			driver = ps.getProperty("driver", "com.mysql.jdbc.Driver");
			url = ps.getProperty("url", "jdbc:mysql://bijia");
			uname = ps.getProperty("uname", "root");
			upwd = ps.getProperty("upwd", "");
			Class.forName(driver); // 1加载数据库驱动
		} catch (Exception e) {
			System.out.println("驱动程序加载错误！");
			e.printStackTrace();
		}
	}

	public static Connection getConnection()  {
		Connection conn = null;
		// 2创建连接
		try {
			conn = DriverManager.getConnection(url, uname, upwd);
			//System.out.println("数据库连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("数据库连接错误！");
		}
		return conn;
	}

	public static void close(Statement stmt, Connection conn) {
		// 5释放资源
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(PreparedStatement pstmt, Connection conn) {
		// 5释放资源
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		// 5释放资源
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
