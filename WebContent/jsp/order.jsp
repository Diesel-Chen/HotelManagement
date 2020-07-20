<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>酒店订单管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
	<style>
	.bfenlei:nth-of-type(2){
		background: rgb(131,142,222);
	}
	</style>
</head>
<body>
	<div class="bbox">
		<%@ include file="left.jsp" %>
		<div class="bright">
			<div class="bhead">
				<div class="dianming">秦皇岛汉庭连锁酒店(燕山大街店)</div>
				<div class="bhright">
					<span>Hi,用户名<a href="#">设置</a></span>
				</div>
			</div>
			<div class="bbody">
				<div class="chead">
					<div class="chead_1">订单</div>
					<c:if test="${not empty order }">
						<div class="chead_2">共<font color="red">1</font>条记录</div>
					</c:if>
					<c:if test="${empty order }">
						<div class="chead_2">共<font color="red">${pageInfo.totalRecord }</font>条记录</div>
					</c:if>
				</div>
				<div class="cchazhao">
					<form action="<%=request.getContextPath() %>/OrderServlet?method=findOrderByState&currentPage=1" method="post" >
						<div class="cchazhao_1">
							状态：<select name="state">
									<option>请选择订单状态</option>
									<option value="待处理">待处理</option>
									<option value="已预订">已预订</option>
									<option value="已取消">已取消</option>
									<option value="已完成">已完成</option>
							</select>
							<input type="submit" value="查询" class="cxb" />
						</div>
					</form>
					<form action="<%=request.getContextPath() %>/OrderServlet?method=findOrderByConsumer" method ="post">
						<div class="cchazhao_2">
							姓名：<input type="text" name="consumer" placeholder="搜索入住人姓名">
							<button><img src="img/5.png"></button>
						</div>
					</form>
				</div>
				<table border="1" class="ctable">
					<tr>
						<td>订单编号</td>
						<td>房型</td>
						<td>订单金额</td>
						<td>入住人</td>
						<td>电话</td>
						<td>入住日期</td>
						<td>离店日期</td>
						<td>订单状态</td>
						<td>下单时间</td>
						<td>操作</td>
					</tr>
					<c:if test="${not empty order }">
						<tr>
							<td>${order.oid }</td>
							<td>${order.cname }</td>
							<td>${order.money }</td>
							<td>${order.consumer }</td>
							<td>${order.telephone }</td>
							<td>${order.comedate }</td>
							<td>${order.departuredate }</td>
							<td>${order.ostate }</td>
							<td>${order.date }</td>
							<td>
								<c:if test="${order.ostate eq '已取消' or order.ostate eq '已完成' }">
									 <div class="queren" style="background: #aaa;">确认预订</div>
									 <div class="quxiao" style="background: #aaa;">取消预订</div>
								 </c:if>
									<c:if test="${order.ostate eq '已预订' }">
									 <div class="queren" style="background: #aaa;">确认预订</div>
									 <div class="quxiao" style="background: red;"><a href="<%=request.getContextPath() %>/OrderServlet?method=orderQuXiaoByOid&oid=${order.oid }">取消预订</a></div>
								</c:if>
									<c:if test="${order.ostate eq '待处理' }">
									 <div class="queren" style="background: blue;"><a href="">确认预订</a></div>
									 <div class="quxiao" style="background: red;"><a href="">取消预订</a></div>
								</c:if> 
							</td>
						</tr>
					</c:if>
					<c:forEach items="${list }" var="o">
						<tr>
							<td>${o.oid }</td>
							<td>${o.cname }</td>
							<td>${o.money }</td>
							<td>${o.consumer }</td>
							<td>${o.telephone }</td>
							<td>${o.comedate }</td>
							<td>${o.departuredate }</td>
							<td>${o.ostate }</td>
							<td>${o.date }</td>
							<td>
								<c:if test="${o.ostate eq '已取消' or o.ostate eq '已完成' }">
									 <div class="queren" style="background: #aaa; color:#fff;">确认预订</div>
									 <div class="quxiao" style="background: #aaa; color:#fff;">取消预订</div>
								 </c:if>
									<c:if test="${o.ostate eq '已预订' }">
									 <div class="queren" style="background: #aaa; color:#fff;">确认预订</div>
									 <div class="quxiao" style="background: red;"><a href="<%=request.getContextPath() %>/OrderServlet?method=orderQuXiaoByOid&oid=${o.oid }&hid=${o.hid}">取消预订</a></div>
								</c:if>
									<c:if test="${o.ostate eq '待处理' }">
									 <div class="queren" style="background: blue;"><a href="<%=request.getContextPath() %>/OrderServlet?method=orderQueDingByOid&oid=${o.oid }&cname=${o.cname }">确认预订</a></div>
									 <div class="quxiao" style="background: #aaa;">取消预订</div>
								</c:if> 
							</td>
						</tr>
					</c:forEach>
				</table>
				<c:if test="${empty order }">
					<%@ include file="pageModel.jsp" %>
				</c:if>
			</div>
			</div>
		</div>
	</div>
</body>
</html>