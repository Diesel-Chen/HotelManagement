package base;


import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */
public class BaseServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String md = request.getParameter("method");
		if(null == md || "".equals(md) || md.trim().equals("")){
			md = "execute";
		}
		String path = null;
		Class	clazz = this.getClass();
		try {
			Method method = clazz.getMethod(md, HttpServletRequest.class, HttpServletResponse.class);
			if(null!=method){
				path=(String)method.invoke(this, request,response);
			}
			if(null!=path){
				request.getRequestDispatcher(path).forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return null;
	}

}
