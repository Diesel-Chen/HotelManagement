<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div class="bleft">
	<div class="blogo"><img src="<%=request.getContextPath() %>/img/1.jpg"></div>
	<div class="bnav">
		<div class="bfenlei"><div class="btubiao"><img src="<%=request.getContextPath() %>/img/7.png"></div><a href="<%=request.getContextPath() %>/index.jsp"><span>房型</span></a></div>
		<div class="bfenlei"><div class="btubiao"><img src="<%=request.getContextPath() %>/img/6.png"></div><a href="<%=request.getContextPath() %>/OrderServlet?method=findAllOrdersByPage&currentPage=1"><span>订单</span></a></div>
		<div class="bfenlei"><div class="btubiao"><img src="<%=request.getContextPath() %>/img/8.png"></div><a href="<%=request.getContextPath() %>/AdminIndexServlet"><span>设置</span></a></div>
	</div>
</div>