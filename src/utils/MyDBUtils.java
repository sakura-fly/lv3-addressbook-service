package utils;

import java.io.*;
import java.sql.*;
import java.util.*;

//自定义的jdbc工具类
public class MyDBUtils {
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String password = null;

	static {
		// 将配置文件读入inputstream中
		try {
			InputStream is = new FileInputStream("db.properties");
			Properties p = new Properties();
			// 将inputSream流中的数据，读入Properties对象中
			p.load(is);
			driver = p.getProperty("driver");
			url = p.getProperty("url");
			user = p.getProperty("user");
			password = p.getProperty("password");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// 初始化驱动类
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//
	private MyDBUtils() {
	}
	// 返回一个创建好的connection对象
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	// 封装关闭资源代码
	public static void myClose(ResultSet rs, Statement stmt, Connection con) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			con = null;
		}
	}
}

