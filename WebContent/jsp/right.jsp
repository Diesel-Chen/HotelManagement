<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<form action="<%=request.getContextPath() %>/HouseServlet?method=findHousesByHid"  class="ssform1" method="post">
		<div class="fanghao">
			房号：<input type="text" name="hid">
		</div>
		<div class="sousuo">
			<input type="submit" value="搜索">
		</div>
	</form>
	<form action="<%=request.getContextPath() %>/HouseServlet?method=findHousesByHfloor"  class="ssform2" method="post">
		<div class="louceng">
		楼层：<select name="hfloor">
				<option>--请选择--</option>
				<option value="1">一楼</option>
				<option value="2">二楼</option>
				<option value="3">三楼</option>
				<option value="4">四楼</option>
				<option value="5">五楼</option>
				<option value="6">六楼</option>
			</select>
		</div>
		<div class="sousuo2">
			<input type="submit" value="搜索">
		</div>
	</form>
	<form action="<%=request.getContextPath() %>/HouseServlet?method=findHousesByHstate"  class="ssform3" method="post">
		<div class="zhuangtai">
		状态：<select name="hstate">
				<option>--请选择--</option>
				<option value="空房">空房</option>
				<option value="脏房">脏房</option>
				<option value="预订">预订</option>
				<option value="住人">住人</option>
				<option value="长包">长包</option>
				<option value="钟点">钟点</option>
			</select>
		</div>
		<div class="sousuo3">
			<input type="submit" value="搜索">
		</div>
	</form>
	<div class="fxzt">
		<li><div class="fangzt"><span>全部房态</span></div><div class="fangsl">${result01 } 间</div></li>
		<li><div class="fangzt fangzt1"><span>空房</span></div><div class="fangsl">${result02 } 间</div></li>
		<li><div class="fangzt fangzt2"><span>脏房</span></div><div class="fangsl">${result03 } 间</div></li>
		<li><div class="fangzt fangzt3"><span>预订</span></div><div class="fangsl">${result04 } 间</div></li>
		<li><div class="fangzt fangzt4"><span>住人</span></div><div class="fangsl">${result05 } 间</div></li>
		<li><div class="fangzt fangzt5"><span>长包</span></div><div class="fangsl">${result06 } 间</div></li>
		<li><div class="fangzt fangzt6"><span>钟点</span></div><div class="fangsl">${result07 } 间</div></li>
	</div>