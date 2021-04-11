<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/4/8
  Time: 上午 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>订单详情</title>
    <%@include file="/pages/common/head.jsp"%>

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
    <span class="wel_word">订单详情</span>
    <%--静态等录成功后的模块--%>
    <%@ include file="/pages/common/login_sucess_menu.jsp"%>
</div>

<div id="main">

    <table>
        <tr>
            <td>用户id</td>
            <td>商品名称</td>
            <td>购买数量</td>
            <td>单价</td>
            <td>总价</td>
            <td>订单号</td>
        </tr>


        <c:forEach items="${requestScope.orderItems}" var="orderItem">

            <tr>
                <td>${userId}</td>
                <td>${orderItem.name}</td>
                <td>${orderItem.count}</td>
                <td>${orderItem.price}</td>
                <td>${orderItem.totalPrice}</td>
                <td>${orderId}</td>
            </tr>

        </c:forEach>


    </table>


</div>

<%--	静态包含页脚--%>
<%@include file="/pages/common/footer.jsp"%>
</body>
</html>
