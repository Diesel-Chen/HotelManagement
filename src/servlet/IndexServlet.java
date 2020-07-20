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


public class IndexServlet extends BaseServlet {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CategoryDao ctDao = new CategoryDao();
		List<Category> list = ctDao.findAllCats();
		HouseDao hDao = new HouseDao();
		List<House> list02 = hDao.findAllHouses();
		int result01 = hDao.findAllHousesCounts();
		int result02 =hDao.findKongXianCounts();
		int result03 =hDao.findZangFangCounts();
		int result04 =hDao.findYuDingCounts();
		int result05 =hDao.findZhuRenCounts();
		int result06 =hDao.findChangBaoCounts();
		int result07 =hDao.findZhongDianCounts();
		request.setAttribute("categorylist", list);
		request.setAttribute("houselist", list02);
		request.setAttribute("result01", result01);
		request.setAttribute("result02", result02);
		request.setAttribute("result03", result03);
		request.setAttribute("result04", result04);
		request.setAttribute("result05", result05);
		request.setAttribute("result06", result06);
		request.setAttribute("result07", result07);
		return "/jsp/index.jsp";
	}
	

}
