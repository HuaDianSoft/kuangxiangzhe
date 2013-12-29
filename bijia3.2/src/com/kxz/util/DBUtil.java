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

	static { // �Զ�ִ���ҽ�ִ��һ��
		try {
			// ������Ŀ������Ϣ
			InputStream is = DBUtil.class.getClassLoader().getResourceAsStream(
					CONFIG_NAME);
			Properties ps = new Properties();
			ps.load(is); // ���������м����������ݡ�����ֵ�ԣ�����#��ͷ����
			driver = ps.getProperty("driver", "com.mysql.jdbc.Driver");
			url = ps.getProperty("url", "jdbc:mysql://bijia");
			uname = ps.getProperty("uname", "root");
			upwd = ps.getProperty("upwd", "");
			Class.forName(driver); // 1�������ݿ�����
		} catch (Exception e) {
			System.out.println("����������ش���");
			e.printStackTrace();
		}
	}

	public static Connection getConnection()  {
		Connection conn = null;
		// 2��������
		try {
			conn = DriverManager.getConnection(url, uname, upwd);
			//System.out.println("���ݿ����ӳɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���ݿ����Ӵ���");
		}
		return conn;
	}

	public static void close(Statement stmt, Connection conn) {
		// 5�ͷ���Դ
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
		// 5�ͷ���Դ
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
		// 5�ͷ���Դ
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
