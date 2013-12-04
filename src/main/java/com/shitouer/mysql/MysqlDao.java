package com.shitouer.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fowler
 * @since Nov 18, 2013
 * 
 */
public class MysqlDao {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("driver not found.");
		}
	}

	public static Connection getConnection() {
		// 连接MySql数据库，用户名和密码都是root
		String url = "jdbc:mysql://localhost:3306/mytest";
		String username = "root";
		String password = "1qaz2wsx";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println("connect failed.");
			se.printStackTrace();
		}
		return conn;
	}

	public static List<String> getByOffset(int categoryId, int offset, int size) {
		List<String> result = new ArrayList<String>();
		String sql = "select orderby, dataid, cid from feed where cid = "
				+ categoryId + " limit " + offset + ", " + size;
		Statement sm = null;
		try {
			sm = getConnection().createStatement();
			ResultSet set = sm.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
