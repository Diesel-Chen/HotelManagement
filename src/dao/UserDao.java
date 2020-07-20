package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import utils.JDBCUtils;
import vo.User;

public class UserDao {

	public boolean userRegister(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String  sql = "insert into user values (null,?,?,?,?,?)";
		Object [] params = {user.getUsername(),user.getPassword(),user.getTelephone(),user.getEmail(),user.getHotelname()};
		int result = qr.execute(sql, params);
		return result>0;
	}

	public User userLogin(String username, String password) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from user where username=? and password=?";
		return qr.query(sql, new BeanHandler<User>(User.class),username,password);
		 
	}

	public boolean userSetHotelName(String hotelname, User user) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "update user set hotelname=? where uid=?";
		int rs = qr.execute(sql, hotelname,user.getUid());
		if(rs >0){
			return true;
		}else{
			return false;
		}
	}



}
