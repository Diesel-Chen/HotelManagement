package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import utils.JDBCUtils;
import vo.Category;

public class CategoryDao {

	public List<Category> findAllCats() throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from category";
		return qr.query(sql,new BeanListHandler<Category>(Category.class));
	}

	public void categoryAdd(String cname) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "insert into category values(null,?)";
		qr.execute(sql, cname);
	}

	public void categoryUpdateByCid(String cid, String cname) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql ="update category set cname = ? where cid = ?";
		qr.execute(sql, cname,cid);
		
	}

	public Category findCategoryByCid(String cid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from category where cid = ?";
		return qr.query(sql, new BeanHandler<Category>(Category.class),cid);
	}

	public void categoryDeleteByCid(String cid) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "delete from category where cid = ?";
		qr.execute(sql, cid);
	}

}
