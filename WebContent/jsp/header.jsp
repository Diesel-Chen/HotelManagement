<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="bhead">
	<div class="dianming">${user.hotelname }</div>
	

	
		<div class="bhright">
			<c:if test="${ empty user }">
				<span><a href="<%=request.getContextPath() %>/jsp/login.jsp">登录</a>
				<a href="<%=request.getContextPath() %>/jsp/register.jsp">注册</a></span>
			</c:if>
			<c:if test="${ not empty user }">
				<span>Hi,${user.username }
					<a href="<%=request.getContextPath() %>/jsp/user_info.jsp">个人中心</a>
					<a href="<%=request.getContextPath() %>/UserServlet?method=userLogout">退出</a>
				</span>
				
			</c:if>
		</div>
	
</div>