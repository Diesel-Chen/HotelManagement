package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import base.BaseServlet;
import dao.CategoryDao;
import dao.HouseDao;
import vo.Category;
import vo.House;
import vo.Page;


public class AdminHouseServlet extends BaseServlet {
	
	public String findAllHousesByPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		int pageSize = 6;
		HouseDao  hDao = new HouseDao();
		//分页查询
		List<House> list = hDao.findAllHousesByPage(currentPage ,pageSize);
		request.setAttribute("list", list);
		//查询总记录数
		int totalRecord = hDao.findAllHousesCounts();
		int totalPage = totalRecord%pageSize == 0 ? totalRecord /pageSize : (totalRecord/pageSize) +1;
		String url = "AdminHouseServlet?method=findAllHousesByPage";
		//给页面信息
		Page page = new Page(currentPage,totalPage,pageSize,totalRecord,url);
		request.setAttribute("pageInfo", page);
		return "/admin/house/list.jsp";
	}
	public String houseAddUI(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CategoryDao ctDao = new CategoryDao();
		List<Category> list = ctDao.findAllCats();
		request.setAttribute("list", list);
		return "/admin/house/add.jsp";
	}
	public String houseAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		House house = new House();
		BeanUtils.populate(house, request.getParameterMap());
		HouseDao hDao = new HouseDao();
		hDao.houseAdd(house);
		return "/AdminHouseServlet?method=findAllHousesByPage&currentPage=1";
	}
	public String findHouseByHid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//查询分类
		CategoryDao ctDao = new CategoryDao();
		List<Category> list = ctDao.findAllCats();
		request.setAttribute("list", list);
		//查询房间
		int hid = Integer.parseInt(request.getParameter("hid"));
		HouseDao hDao = new HouseDao();
		House house = hDao.findHousesByHid(hid);
		request.setAttribute("house", house);
		return "/admin/house/edit.jsp";
	}
	public String houseUpdateByHid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		House house = new House();
		BeanUtils.populate(house, request.getParameterMap());
		HouseDao hDao = new HouseDao();
		hDao.houseUpdateByHid(house);
		return "/AdminHouseServlet?method=findAllHousesByPage&currentPage=1";
	}
	public String houseDeleteByHid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int hid = Integer.parseInt(request.getParameter("hid"));
		HouseDao hDao = new HouseDao();
		hDao.houseDeleteByHid(hid);
		return "/AdminHouseServlet?method=findAllHousesByPage&currentPage=1";
	}
	
	
	
	
	
}
