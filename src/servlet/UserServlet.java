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
import dao.UserDao;
import vo.Category;
import vo.House;
import vo.User;

public class UserServlet extends BaseServlet {
	
	public String userRegister(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = new User();
		BeanUtils.populate(user, request.getParameterMap());
		UserDao userDao =new UserDao();
		boolean flag = userDao.userRegister(user);
		if(flag == true){
			request.setAttribute("msg", "注册成功，请登录！");
		}else{
			request.setAttribute("msg", "注册失败，请重新注册");
		}
		return "/jsp/info.jsp";
	}
	public String userSetHotelName(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String hotelname = request.getParameter("hotelname");
		User user =(User) request.getSession().getAttribute("user");
		UserDao userDao = new UserDao();
		boolean flag = userDao.userSetHotelName(hotelname,user);
		if (flag == true){
			 request.getSession().removeAttribute("user");
		}
		//首页信息
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
	public String userLogout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().removeAttribute("user");
		//首页信息
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
	public String userLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao userDao =new UserDao();
		User user = userDao.userLogin(username,password);
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
		if(user != null){
			request.getSession().setAttribute("user", user);
			return "/jsp/index.jsp";
		}else{
			request.setAttribute("msg", "用户名或密码错误，请输入正确的用户名密码！");
			return "/jsp/info.jsp";
		}	
	}

}
