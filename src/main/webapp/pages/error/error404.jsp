<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/4/5
  Time: 下午 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>404错误页面</title>
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
    <span class="wel_word">找不到页面。。。</span>

</div>

<div id="main">

    <h1>该页面找不到或者已经被删除...</h1>


</div>

<%--	静态包含页脚--%>
<%@include file="/pages/common/footer.jsp"%>
</body>
</html>
