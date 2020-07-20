<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>酒店管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
</head>
<body>
	<div class="abox">
		<div class="aleft"><img src="<%=request.getContextPath() %>/img/1.png" alt=""></div>
		<div class="aright" >
			<form action="<%=request.getContextPath() %>/UserServlet?method=userLogin" method="post">
				<span class="adl">管理员登陆</span>
				<div class="aimg_user"><img src="<%=request.getContextPath() %>/img/3.png"></div>
				<input type="text" name="username" class="ainput1" placeholder="请输入用户名">
				<div class="aimg_pass"><img src="<%=request.getContextPath() %>/img/4.png"></div>
				<input type="password" name="password" class="ainput2" placeholder="请输入密码">
				<div class="arepass">
					<input type="checkbox" name=""><span class="a1">记住密码</span>
					<a href="register.jsp"><span class="a2">还没有账号，先注册</span></a>
				</div>
				<input type="submit" value="登陆" class="adenglu">	
			</form>
		</div>
	</div>
</body>
</html>