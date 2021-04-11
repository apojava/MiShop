<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/4/8
  Time: 下午 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>发货成功界面</title>
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
    <span class="wel_word">发货成功</span>
    <%--静态等录成功后的模块--%>
    <%@ include file="/pages/common/login_sucess_menu.jsp"%>
</div>

<div id="main">

    <h1>${sessionScope.orderIdIsSender}订单号已发货</h1>
    <h1><a href="manager/OrderManagerServlet?action=orderControl">返回</a></h1>



</div>

<%--	静态包含页脚--%>
<%@include file="/pages/common/footer.jsp"%>
</body>
</html>