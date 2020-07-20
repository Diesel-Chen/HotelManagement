<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="nav" >
	<ul>
		<li><a href="<%=request.getContextPath() %>/index.jsp">所有房间</a></li>
		<c:forEach items="${categorylist }" var="c">
			<li><a href="<%=request.getContextPath() %>/HouseServlet?method=findHousesByCname&cname=${c.cname}">${c.cname }</a></li>
		</c:forEach>
	</ul>
</div>