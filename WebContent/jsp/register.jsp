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
			<form action="<%=request.getContextPath() %>/UserServlet?method=userRegister" method="post">
				<span class="adl">管理员注册</span>
				<table class="zctab" >
					<tr>
						<td>用户名：</td>
						<td><input type="text" name="username" ></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password" ></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input type="password" ></td>
					</tr>
					<tr>
						<td>手机号：</td>
						<td><input type="text" name="telephone" ></td>
					</tr>
					<tr>
						<td>邮箱：</td>
						<td><input type="text" name="email" ></td>
					</tr>
				</table>
				<input type="submit" value="注册" class="adenglu">	
			</form>
		</div>
	</div>
</body>
</html>