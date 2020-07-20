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
			<center>
				<div class="bit"><h2>添加房间</h2></div>
				<table id="tab" class="tab5">
					<form action="<%=request.getContextPath() %>/AdminHouseServlet?method=houseAdd" method="post">
						<tr>
							<td>房间号：</td>
							<td><input type="text" name="hid" /></td>
						</tr>
						<tr>
							<td>房间类型：</td>
							<td>
								<select name="cname">
									<option >--请选择--</option>
									<c:forEach items="${list}" var="c">
										<option value="${c.cname }">${c.cname }</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td>房间状态：</td>
							<td>
								<select name="hstate">
										<option >--请选择--</option>
										<option value="住人">住人</option>
										<option value="空房">空房</option>
										<option value="脏房">脏房</option>
										<option value="预订">预订</option>
										<option value="住人">住人</option>
										<option value="长包">长包</option>
										<option value="钟点">钟点</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>房间楼层：</td>
							<td>
								<select name="hfloor">
									<option >--请选择--</option>
										<option value="1">一楼</option>
										<option value="2">二楼</option>
										<option value="3">三楼</option>
										<option value="4">四楼</option>
										<option value="5">五楼</option>
										<option value="6">六楼</option>
										<option value="7">七楼</option>
										
								</select>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" value="确定" class="dlbtt" />
								<input type="reset" value="重置" class="dlbtt" />
							</td>
						</tr>
					</form>
				</table>
			</center>
		</div>
	</div>
</body>
</html>