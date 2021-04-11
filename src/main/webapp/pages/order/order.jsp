<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>我的订单</title>
	<%@include file="/pages/common/head.jsp"%>

<%--	<base href="http://localhost:8080/MyBook/">--%>
	<style type="text/css">
		h1 {
			text-align: center;
			margin-top: 200px;
		}
	</style>
</head>
<body>
	
	<div id="header">
		<%--动态包含logo--%>
		<%@include file="/pages/common/logo.jsp"%>
		<span class="wel_word">我的订单</span>
		<%--静态等录成功后的模块--%>
		<%@ include file="/pages/common/login_sucess_menu.jsp"%>
	</div>
	
	<div id="main">
<%--		<a href="/orderServlet?action=showAllOrderItems">查看详情</a>--%>
		
		<table>
			<tr>
				<td>订单号</td>
				<td>日期</td>
				<td>金额</td>
				<td>状态</td>
				<td>详情</td>
			</tr>		


			<c:forEach items="${requestScope.orders}" var="order">
				<tr>
					<td>${order.orderId}</td>
					<td>${order.createTime}</td>
					<td>${order.price}</td>
					<td>
						<c:if test="${order.status == 0}">
							未发货
						</c:if>
						<c:if test="${order.status == 1}">
							运输中
						</c:if>
						<c:if test="${order.status == 2}">
							已签收
						</c:if>
					</td>
					<td><a href="orderServlet?action=showAllOrderItems&orderId=${order.orderId}">查看详情</a></td>
				</tr>
<%--				<a href="/orderServlet?action=showAllOrderItems">查看详情</a>--%>
			</c:forEach>


		</table>
		
	
	</div>

	<%--	静态包含页脚--%>
	<%@include file="/pages/common/footer.jsp"%>
</body>
</html>