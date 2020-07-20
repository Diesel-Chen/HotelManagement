<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div id="menu">
	欢迎, ${user.username }用户
	 | <a href="<%=request.getContextPath() %>/AdminCategoryServlet?method=findAllCats">分类管理</a>
	 | <a href="<%=request.getContextPath() %>/AdminHouseServlet?method=findAllHousesByPage&currentPage=1">客房管理</a>
	 | <a href="<%=request.getContextPath() %>/UserServlet?method=userLogout">退出</a>
</div>