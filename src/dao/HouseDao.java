package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import utils.JDBCUtils;
import vo.Category;
import vo.House;

public class HouseDao {

	public List<House> findAllHouses() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from house";
		return qr.query(sql,new BeanListHandler<House>(House.class));
	}

	public int findAllHousesCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from house ";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public int findKongXianCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from house where hstate ='空房'";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public int findZangFangCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from house where hstate ='脏房'";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public int findYuDingCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from house where hstate ='预订'";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public int findZhuRenCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from house where hstate ='住人'";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public int findChangBaoCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from house where hstate ='长包'";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public int findZhongDianCounts() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from house where hstate ='钟点'";
		Long result = (Long)qr.query(sql, new ScalarHandler());
		return result.intValue();
	}

	public List<House> findHousesByCname(String cname) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from house where cname = ?";
		return qr.query(sql,new BeanListHandler<House>(House.class),cname);
	}

	public House findHousesByHid(int hid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from house where hid = ?";
		return qr.query(sql,new BeanHandler<House>(House.class),hid);
	}

	public List<House> findHousesByHfloor(int hfloor) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from house where hfloor = ?";
		return qr.query(sql,new BeanListHandler<House>(House.class),hfloor);
	}

	public House findrandHouseByCname(String cname) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "SELECT * FROM house WHERE cname = ? and hstate = '空房' ORDER BY RAND() LIMIT 1";
		return qr.query(sql, new BeanHandler<House>(House.class),cname);
		
	}

	public void houseYuding(int hid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql ="update house set hstate ='预订' where hid = ? ";
		qr.execute(sql, hid);
	}

	public void houseQuXiaoYuDing(int hid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "update house set hstate ='空房' where hid = ? ";
		qr.execute(sql, hid);
		
	}

	public List<House> findAllHousesByPage(int currentPage, int pageSize) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from house limit ?,?";
		return qr.query(sql,new BeanListHandler<House>(House.class),(currentPage-1)*pageSize,pageSize);
	}

	public void houseAdd(House house) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "insert into house values(?,?,?,?)";
		Object [] params = {house.getHid(),house.getCname(),house.getHstate(),house.getHfloor()};
		qr.execute(sql, params);
	}

	public void houseUpdateByHid(House house) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "update house set cname=? ,hstate =?,hfloor=? where hid =?";
		Object [] params = {house.getCname(),house.getHstate(),house.getHfloor(),house.getHid()};
		int rs = qr.execute(sql, params);
	}

	public void houseDeleteByHid(int hid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "delete from house where hid =?";
		qr.execute(sql, hid);
		
	}

	public List<House> findHousesByHstate(String hstate) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select *from house where hstate = ?";
		return qr.query(sql, new BeanListHandler<House>(House.class),hstate);
		
	}
	
	
}
