package utils;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class JDBCUtils {
	
	
	static ComboPooledDataSource dataSource = null;
	static{
		dataSource = new ComboPooledDataSource();
	}
	public static DataSource getDataSource(){
		return dataSource;
	}
	public static Connection getConn() throws SQLException{
		return dataSource.getConnection();
	}
	public static void rsClose(ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rs=null;
		}
	}
	public static void stClose(Statement st){
		try {
			if(st!=null){
				st.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			st=null;
		}
	}
	public static void pstmtClose(PreparedStatement pstmt){
		try {
			if(pstmt!=null){
				pstmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			pstmt=null;
		}
	}
	public static void connClose(Connection conn){
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn=null;
		}
	}
	public static void release(Connection conn,Statement st,ResultSet rs){
		rsClose(rs);
		stClose(st);
		connClose(conn);
	}
	public static void release(Connection conn,PreparedStatement pstmt,ResultSet rs){
		rsClose(rs);
		pstmtClose(pstmt);
		connClose(conn);
	}
	public static void main( String args[]) throws SQLException{
		Connection conn = getConn();
		System.out.println(conn);
	}

}
