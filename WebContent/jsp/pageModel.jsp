<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		
		<c:if test="${ empty state }">
			<center>
				<div style="margin-top:25px;">
					${pageInfo.currentPage }/${pageInfo.totalPage}
						&nbsp;&nbsp;&nbsp;&nbsp;
						每个页面显示${pageInfo.pageSize }条数据
						&nbsp;&nbsp;&nbsp;&nbsp;
						一共有${pageInfo.totalRecord }条数据
						<c:if test="${pageInfo.currentPage != 1 }">
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=1">首页</a>
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${pageInfo.currentPage-1}">上一页</a>
						</c:if>
						<c:forEach  begin="1" end="${pageInfo.totalPage }" var="i">
							<c:if test="${pageInfo.currentPage == i}">
								${i }
							</c:if>
							<c:if test="${pageInfo.currentPage != i}">
								<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${i }">${i }</a>
							</c:if>
						</c:forEach>
						<c:if test="${pageInfo.currentPage != pageInfo.totalPage }">
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${pageInfo.currentPage+1}">下一页</a>
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${pageInfo.totalPage}">尾页</a>
						</c:if>
				</div>
			</center>
		</c:if>
		<c:if test="${not empty state }">
			<center>
				<div style="margin-top:25px;">
					${pageInfo.currentPage }/${pageInfo.totalPage}
						&nbsp;&nbsp;&nbsp;&nbsp;
						每个页面显示${pageInfo.pageSize }条数据
						&nbsp;&nbsp;&nbsp;&nbsp;
						一共有${pageInfo.totalRecord }条数据
						<c:if test="${pageInfo.currentPage != 1 }">
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=1&state=${state}">首页</a>
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${pageInfo.currentPage-1}&state=${state}">上一页</a>
						</c:if>
						<c:forEach  begin="1" end="${pageInfo.totalPage }" var="i">
							<c:if test="${pageInfo.currentPage == i}">
								${i }
							</c:if>
							<c:if test="${pageInfo.currentPage != i}">
								<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${i }&state=${state}">${i }</a>
							</c:if>
						</c:forEach>
						<c:if test="${pageInfo.currentPage != pageInfo.totalPage }">
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${pageInfo.currentPage+1}&state=${state}">下一页</a>
							<a href="${pageContext.request.contextPath }/${pageInfo.url }&currentPage=${pageInfo.totalPage}&state=${state}">尾页</a>
						</c:if>
				</div>
			</center>
		</c:if>