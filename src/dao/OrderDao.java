package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import utils.JDBCUtils;
import vo.House;
import vo.Order;

public class OrderDao {

	public List<Order> findAllOrdersByPage(int currentPage, int pageSize) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from dingdan order by date desc limit ?,?";
		return qr.query(sql, new BeanListHandler<Order>(Order.class),(currentPage-1)*pageSize,pageSize);
	}

	public int findAllCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from dingdan ";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public Order findOrderByConsumer(String consumer) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from dingdan where consumer =?";
		return qr.query(sql, new BeanHandler<Order>(Order.class),consumer);
	}

	public List<Order> findOrderByState(String state, int currentPage, int pageSize) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from dingdan where ostate = ? limit  ?,?";
		return qr.query(sql, new BeanListHandler<Order>(Order.class),state,(currentPage-1)*pageSize,pageSize);
	}

	public int findCountsByState(String state) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from dingdan where ostate = ?";
		Long result = (Long)qr.query(sql, new ScalarHandler(),state);
		return result.intValue();
	}

	public void orderQuXiaoByOid(int oid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "update dingdan set ostate = '已取消'  where oid = ?";
		qr.execute(sql, oid);
	}

	public void orderQueDingByOid(int oid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "update dingdan set ostate = '已预订'  where oid = ?";
		qr.execute(sql, oid);
	}

	public void addHid(int hid, int oid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "update dingdan set hid = ? where oid = ?";
		qr.execute(sql, hid,oid);
		
	}

	public void deleteHid( int oid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "update dingdan set hid =  null where oid = ?";
		qr.execute(sql, oid);
		
	}


}
