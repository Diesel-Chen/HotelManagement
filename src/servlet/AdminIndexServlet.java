package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseServlet;
import vo.User;


public class AdminIndexServlet extends BaseServlet {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User)request.getSession().getAttribute("user");
		if( null != user){
			return "/admin/index.jsp";
		}else{
			return "/jsp/shezhi.jsp";
		}
	}

}
