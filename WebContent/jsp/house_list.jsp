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
			<div class="bbody">
				<%@ include file="nav.jsp" %>
				<div class="bbleft">
					<div class="fdata">
						<c:if test="${house.hstate eq '空房' }">
							<div class="syfj" style="background-image: linear-gradient(to right, rgb(114,181,254),#fff);">
								<span class="s1">${house.hid }</span><span class="s2">${house.cname }</span>
							</div>
						</c:if>
						<c:if test="${house.hstate eq '脏房' }">
							<div class="syfj" style="background-image: linear-gradient(to right, #aaa,#fff);">
								<span class="s1">${house.hid }</span><span class="s2">${house.cname }</span>
							</div>
						</c:if>
						<c:if test="${house.hstate eq '预订' }">
							<div class="syfj" style="background-image: linear-gradient(to right, yellow,#fff);">
								<span class="s1">${house.hid }</span><span class="s2">${house.cname }</span>
							</div>
						</c:if>
						<c:if test="${house.hstate eq '住人' }">
							<div class="syfj" style="background-image:linear-gradient(to right, #ff5151,#fff);">
								<span class="s1">${house.hid }</span><span class="s2">${house.cname }</span>
							</div>
						</c:if>
						<c:if test="${house.hstate eq '长包' }">
							<div class="syfj" style="background-image:linear-gradient(to right, rgb(140,141,23),#fff);">
								<span class="s1">${house.hid }</span><span class="s2">${house.cname }</span>
							</div>
						</c:if>
						<c:if test="${house.hstate eq '钟点' }">
							<div class="syfj" style="background-image:linear-gradient(to right, rgb(249,151,45),#fff);">
								<span class="s1">${house.hid }</span><span class="s2">${house.cname }</span>
							</div>
						</c:if>
					<c:forEach items="${list }" var="h">
						<c:if test="${h.hstate eq '空房' }">
							<div class="syfj" style="background-image: linear-gradient(to right, rgb(114,181,254),#fff);">
								<span class="s1">${h.hid }</span><span class="s2">${h.cname }</span>
							</div>
						</c:if>
						<c:if test="${h.hstate eq '脏房' }">
							<div class="syfj" style="background-image: linear-gradient(to right, #aaa,#fff);">
								<span class="s1">${h.hid }</span><span class="s2">${h.cname }</span>
							</div>
						</c:if>
						<c:if test="${h.hstate eq '预订' }">
							<div class="syfj" style="background-image: linear-gradient(to right, yellow,#fff);">
								<span class="s1">${h.hid }</span><span class="s2">${h.cname }</span>
							</div>
						</c:if>
						<c:if test="${h.hstate eq '住人' }">
							<div class="syfj" style="background-image:linear-gradient(to right, #ff5151,#fff);">
								<span class="s1">${h.hid }</span><span class="s2">${h.cname }</span>
							</div>
						</c:if>
						<c:if test="${h.hstate eq '长包' }">
							<div class="syfj" style="background-image:linear-gradient(to right, rgb(140,141,23),#fff);">
								<span class="s1">${h.hid }</span><span class="s2">${h.cname }</span>
							</div>
						</c:if>
						<c:if test="${h.hstate eq '钟点' }">
							<div class="syfj" style="background-image:linear-gradient(to right, rgb(249,151,45),#fff);">
								<span class="s1">${h.hid }</span><span class="s2">${h.cname }</span>
							</div>
						</c:if>
					</c:forEach>
					</div>
				</div>
				<div class="bbright">
					<%@ include file="right.jsp" %>
				</div>
			</div>
		</div>
	</div>
</body>
</html>