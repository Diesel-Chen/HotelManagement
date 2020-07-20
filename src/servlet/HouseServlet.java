package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseServlet;
import dao.CategoryDao;
import dao.HouseDao;
import vo.Category;
import vo.House;


public class HouseServlet extends BaseServlet {
	
	public String findHousesByCname(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CategoryDao ctDao = new CategoryDao();
		List<Category> list01 = ctDao.findAllCats();
		request.setAttribute("categorylist", list01);
		String cname = request.getParameter("cname");
		HouseDao hDao = new HouseDao();
		List<House> list = hDao.findHousesByCname(cname);
		request.setAttribute("list", list);
		int result01 = hDao.findAllHousesCounts();
		int result02 =hDao.findKongXianCounts();
		int result03 =hDao.findZangFangCounts();
		int result04 =hDao.findYuDingCounts();
		int result05 =hDao.findZhuRenCounts();
		int result06 =hDao.findChangBaoCounts();
		int result07 =hDao.findZhongDianCounts();
		request.setAttribute("result01", result01);
		request.setAttribute("result02", result02);
		request.setAttribute("result03", result03);
		request.setAttribute("result04", result04);
		request.setAttribute("result05", result05);
		request.setAttribute("result06", result06);
		request.setAttribute("result07", result07);
		return "/jsp/house_list.jsp";
	}
	public String findHousesByHid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CategoryDao ctDao = new CategoryDao();
		List<Category> list01 = ctDao.findAllCats();
		request.setAttribute("categorylist", list01);
		int hid = Integer.parseInt(request.getParameter("hid"));
		HouseDao hDao = new HouseDao();
		House house = hDao.findHousesByHid(hid);
		request.setAttribute("house", house);
		int result01 = hDao.findAllHousesCounts();
		int result02 =hDao.findKongXianCounts();
		int result03 =hDao.findZangFangCounts();
		int result04 =hDao.findYuDingCounts();
		int result05 =hDao.findZhuRenCounts();
		int result06 =hDao.findChangBaoCounts();
		int result07 =hDao.findZhongDianCounts();
		request.setAttribute("result01", result01);
		request.setAttribute("result02", result02);
		request.setAttribute("result03", result03);
		request.setAttribute("result04", result04);
		request.setAttribute("result05", result05);
		request.setAttribute("result06", result06);
		request.setAttribute("result07", result07);
		return "/jsp/house_list.jsp";
	}
	public String findHousesByHfloor(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CategoryDao ctDao = new CategoryDao();
		List<Category> list01 = ctDao.findAllCats();
		request.setAttribute("categorylist", list01);
		int hfloor = Integer.parseInt(request.getParameter("hfloor"));
		HouseDao hDao = new HouseDao();
		List<House> list = hDao.findHousesByHfloor(hfloor);
		request.setAttribute("list", list);
		int result01 = hDao.findAllHousesCounts();
		int result02 =hDao.findKongXianCounts();
		int result03 =hDao.findZangFangCounts();
		int result04 =hDao.findYuDingCounts();
		int result05 =hDao.findZhuRenCounts();
		int result06 =hDao.findChangBaoCounts();
		int result07 =hDao.findZhongDianCounts();
		request.setAttribute("result01", result01);
		request.setAttribute("result02", result02);
		request.setAttribute("result03", result03);
		request.setAttribute("result04", result04);
		request.setAttribute("result05", result05);
		request.setAttribute("result06", result06);
		request.setAttribute("result07", result07);
		return "/jsp/house_list.jsp";
	}
	public String findHousesByHstate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CategoryDao ctDao = new CategoryDao();
		List<Category> list01 = ctDao.findAllCats();
		request.setAttribute("categorylist", list01);
		String hstate = request.getParameter("hstate");
		HouseDao hDao = new HouseDao();
		List<House> list = hDao.findHousesByHstate(hstate);
		request.setAttribute("list", list);
		int result01 = hDao.findAllHousesCounts();
		int result02 =hDao.findKongXianCounts();
		int result03 =hDao.findZangFangCounts();
		int result04 =hDao.findYuDingCounts();
		int result05 =hDao.findZhuRenCounts();
		int result06 =hDao.findChangBaoCounts();
		int result07 =hDao.findZhongDianCounts();
		request.setAttribute("result01", result01);
		request.setAttribute("result02", result02);
		request.setAttribute("result03", result03);
		request.setAttribute("result04", result04);
		request.setAttribute("result05", result05);
		request.setAttribute("result06", result06);
		request.setAttribute("result07", result07);
		return "/jsp/house_list.jsp";
	}
	
}
