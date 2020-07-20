<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>酒店订单管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
	<style>
	.nav ul li:nth-of-type(1){
		background: rgb(255,255,86);
	}
	.bfenlei:nth-of-type(1){
		background: rgb(131,142,222);
	}
	</style>
</head>
<body>
	<div class="bbox">
		<%@ include file="left.jsp" %>
		<div class="bright">
			<%@ include file="header.jsp" %>
			<center>
			<form action="<%=request.getContextPath() %>/UserServlet?method=userSetHotelName"  method="post">
			<table class="tab1">
					<tr>
						<td colspan="2">欢迎用户${user.username }</td>
					</tr>
					<tr>
						<td width="100">酒店名字:</td>
						<td><input type="text" name="hotelname"  /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="提交" style="width: 60px; height: 30px;"/></td>
					</tr>
			</table>
			</form>
			</center>
		</div>
	</div>
</body>
</html>