<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<div class="bit"><center><h2>修改分类</h2></center></div>
			<center>
				<table id="tab" >
					<form action="<%=request.getContextPath() %>/AdminCategoryServlet?method=categoryUpdateByCid" method="post">
						<tr>
					       <td>分类名称</td>
					       <input type="hidden" name="cid" value="${category.cid }" />
						   <td ><input type="text" name="cname" value="${category.cname }" /></td>
						</tr>		
						<tr>
						  <td colspan="2"><input type="submit" value="确定" /></td>
						</tr>	
					</form>
				</table>
			</center>
		</div>
	</div>
</body>
</html>