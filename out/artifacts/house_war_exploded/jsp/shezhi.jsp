<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>酒店订单管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
	<style>
	.bfenlei:nth-of-type(3){
		background: rgb(131,142,222);
	}
	</style>
</head>
<body>
	<div class="bbox">
		<%@ include file="left.jsp" %>
		<div class="bright">
			<div class="bbody">
				<div class="tishikuang">
					<span>想进行设置应用请先登录</span>
				<a href="<%=request.getContextPath() %>/jsp/login.jsp">前往登陆</a>
            </div>
			</div>
		</div>
	</div>
</body>
</html>