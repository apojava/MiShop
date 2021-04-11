
<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/3/23
  Time: 下午 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
    <span>欢迎<span class="um_span">${sessionScope.user.username}</span>光临小米商城</span>
    <a href="pages/cart/cart.jsp">购物车</a>|
    <a href="orderServlet?action=showAllOrder">我的订单</a>|
    <a href="userServlet?action=logout">注销</a>|
    <c:if test="${sessionScope.type == 0 }">
        <a href="pages/manager/manager.jsp">后台管理</a>
    </c:if>
    <a href="index.jsp">返回</a>
</div>