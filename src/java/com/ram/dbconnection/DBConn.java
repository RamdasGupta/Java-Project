
package com.ram.dbconnection;

/**
 *
 * @author R D Gupta
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConn {
	Connection con = null;

	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * To Create Connections
	 */
	public static Connection getConnection() throws ClassNotFoundException,	SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = null;
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/world", "root", "root");
		return connection;
	}

	/**
	 * @param con
	 * @param stmt
	 * @param rs
	 * To close statements, result sets and Connection 
	 */
	public static void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param con
	 * @param stmt
	 * To close statements and Connection
	 */
	public static void close(Connection con, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param con
	 * @param pstmt
	 * @param rs
	 * To Close PreparedStatement and Connection
	 */
	public static void close(Connection con, PreparedStatement pstmt,
			ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param con
	 * To close connection
	 */
	public static void closeConnection(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param conn
	 * @throws SQLException
	 * To Commit and Close the connection
	 */
	public static void commitAndClose(Connection conn) throws SQLException {
		conn.commit();
		conn.close();
	}

}			

