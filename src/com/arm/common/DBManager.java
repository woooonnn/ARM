package com.arm.common;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//c
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost.3306/arm", "root", "abcd1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void dbClose(Connection conn
			, PreparedStatement pstmt
			, ResultSet rs) {
		try {
			if(rs !=null) 	 rs.close();
			if(pstmt !=null) pstmt.close();
			if(conn !=null)  conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void dbClose(Connection conn, PreparedStatement pstmt) {
		try {
			if(pstmt !=null) pstmt.close();
			if(conn !=null)  conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
