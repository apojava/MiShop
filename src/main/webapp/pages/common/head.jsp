<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/3/23
  Time: 下午 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
        pageContext.setAttribute("basepath",basePath);
%>

    <base href="<%=basePath%>">
    <link type="text/css" rel="stylesheet" href="static/css/style.css" >
    <script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>