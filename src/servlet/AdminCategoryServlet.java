package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseServlet;
import dao.CategoryDao;
import vo.Category;


public class AdminCategoryServlet extends BaseServlet {
	
	public String findAllCats(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CategoryDao ctDao = new CategoryDao();
		List<Category> list = ctDao.findAllCats();
		request.setAttribute("list", list);
		return "/admin/category/list.jsp";
	}
	
	public String addUI(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/admin/category/add.jsp";
	}
	
	public String categoryAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cname = request.getParameter("cname");
		CategoryDao ctDao = new CategoryDao();
		ctDao.categoryAdd(cname);
		return "/AdminCategoryServlet?method=findAllCats";
	}
	
	
	public String findCategoryByCid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cid = request.getParameter("cid");
		CategoryDao ctDao = new CategoryDao();
		Category category = ctDao.findCategoryByCid(cid);
		request.setAttribute("category", category);
		return "/admin/category/edit.jsp";
	}
	
	public String categoryUpdateByCid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		CategoryDao ctDao = new CategoryDao();
		ctDao.categoryUpdateByCid(cid,cname);
		return "/AdminCategoryServlet?method=findAllCats";
	}
	public String categoryDeleteByCid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cid = request.getParameter("cid");
		CategoryDao ctDao = new CategoryDao();
		ctDao.categoryDeleteByCid(cid);
		return "/AdminCategoryServlet?method=findAllCats";
	}
	
	

}
