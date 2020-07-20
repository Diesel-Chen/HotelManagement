<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>酒店订单管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style2.css">
</head>
<body>
	<div class="bbox">
		<%@ include file="../left.jsp" %>
		<div class="bright">
			<%@ include file="../menu.jsp" %>
			<div class="bit"><h2>客房管理</h2><a href="<%=request.getContextPath() %>/AdminHouseServlet?method=houseAddUI"><button class="anniu">添加客房</button></a></div>
			<table id="tab" class="ttab" >
				<tr>
				   <th width="100">客房号</th>
				   <th width="280">客房类型</th>
				   <th width="250">客房状态</th>
				   <th width="100">客房楼层</th>
				   <th width="150">操作</th>
				</tr>
				<c:forEach items="${list }" var="h">
					<tr>
				       <td >${h.hid }</td>
					   <td >${h.cname }</td>
					   <td >${h.hstate }</td>
					   <td>${h.hfloor }</td>
					   <td align="center" ><a href="<%=request.getContextPath() %>/AdminHouseServlet?method=findHouseByHid&hid=${h.hid}" ><img src="<%=request.getContextPath() %>/img/edit.gif" border="0" alt="编辑"></a><a href="<%=request.getContextPath() %>/AdminHouseServlet?method=houseDeleteByHid&hid=${h.hid}"><img src="<%=request.getContextPath() %>/img/delete.gif" border="0" alt="删除"></a></td>    
					</tr>	
				</c:forEach>	
			</table>
			<%@ include file="/jsp/pageModel.jsp"  %>
		</div>
	</div>
</body>
</html>