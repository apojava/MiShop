<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑商品</title>
	<%@include file="/pages/common/head.jsp"%>
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
	
	input {
		text-align: center;
	}
</style>
</head>
<body>
		<div id="header">
			<%--动态包含logo--%>
			<%@include file="/pages/common/logo.jsp"%>
			<span class="wel_word">编辑商品</span>
			<%@include file="/pages/common/manager_menu.jsp"%>
		</div>
		
		<div id="main">
			<form action="manager/phoneServlet" method="post">
				<input type="hidden" name="pageNo" value="${param.pageNo}">
				<input type="hidden" name="action" value="${ empty param.id ? "add" : "update" }" />
				<input type="hidden" name="id" value="${ requestScope.phone.id }" />
				<table>
					<tr>
						<td>名称</td>
						<td>价格</td>
						<td>作者</td>
						<td>销量</td>
						<td>库存</td>
						<td colspan="2">操作</td>
					</tr>		
<%--					<tr>--%>
<%--						<td><input name="name" type="text" value="小米10pro"/></td>--%>
<%--						<td><input name="price" type="text" value="4599"/></td>--%>
<%--						<td><input name="desiger" type="text" value="雷军"/></td>--%>
<%--						<td><input name="sales" type="text" value="200"/></td>--%>
<%--						<td><input name="stock" type="text" value="300"/></td>--%>
<%--						<td><input type="submit" value="提交"/></td>--%>
<%--					</tr>--%>
					<tr>
						<td><input name="name" type="text" value="${requestScope.phone.name}"/></td>
						<td><input name="price" type="text" value="${requestScope.phone.price}"/></td>
						<td><input name="desiger" type="text" value="${requestScope.phone.desiger}"/></td>
						<td><input name="sales" type="text" value="${requestScope.phone.sales}"/></td>
						<td><input name="stock" type="text" value="${requestScope.phone.stock}"/></td>
						<td><input type="submit" value="提交"/></td>
					</tr>
				</table>
			</form>
			
	
		</div>

		<%--	静态包含页脚--%>
		<%@include file="/pages/common/footer.jsp"%>
</body>
</html>