<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>小米会员注册页面</title>
	<%@include file="/pages/common/head.jsp"%>
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
</style>
</head>
<body>
		<div id="header">
			<%--动态包含logo--%>
			<%@include file="/pages/common/logo.jsp"%>
			<span class="wel_word"></span>
			<%--静态等录成功后的模块--%>
			<%@ include file="/pages/common/login_sucess_menu.jsp"%>
		</div>
		
		<div id="main">
		
			<h1>注册成功! <a href="index.jsp">转到主页</a></h1>
	
		</div>

		<%--	静态包含页脚--%>
		<%@include file="/pages/common/footer.jsp"%>
</body>
</html>