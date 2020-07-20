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
			<div class="bit"><h2>分类管理</h2><a href="<%=request.getContextPath() %>/AdminCategoryServlet?method=addUI"><button class="anniu">添加分类</button></a></div>
			<table id="tab" class="tab8">
				<tr>
				   <th width="250">序号</th>
				   <th width="300">分类名称</th>
				   <th width="320">操作</th>
				</tr>
				<c:forEach items="${list }" var="c" varStatus="status">
					<tr>
				       <td align="center" >${status.count }</td>
					   <td align="center" >${c.cname }</td>
					   <td align="center" ><a href="<%=request.getContextPath() %>/AdminCategoryServlet?method=findCategoryByCid&cid=${c.cid}" ><img src="<%=request.getContextPath() %>/img/edit.gif" border="0" alt="编辑"></a><a href="<%=request.getContextPath() %>/AdminCategoryServlet?method=categoryDeleteByCid&cid=${c.cid}"><img src="<%=request.getContextPath() %>/img/delete.gif" border="0" alt="删除"></a></td>    
					</tr>	
				</c:forEach>		
			</table>
		</div>
	</div>
</body>
</html>