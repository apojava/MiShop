<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>小米商城会员登录页面</title>
	<%@include file="/pages/common/head.jsp"%>
</head>
<body>
		<div id="login_header">

<%--			<a href=""><img class="logo_img" alt="" src="static/img/logo.gif" ></a>--%>

             <%--动态包含logo--%>
			<%@include file="/pages/common/logo.jsp"%>
		</div>
		
			<div class="login_banner">
			
				<div id="l_content">
					<span class="login_word">欢迎登录</span>
				</div>
				
				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>小米会员</h1>
								<a href="/MyBook/pages/user/regist.jsp">立即注册</a>
							</div>
							<div class="msg_cont">
								<b></b>
								<span class="errorMsg">
<%--									<%=request.getAttribute("msg")==null?"请输入用户名和密码":request.getAttribute("msg")%>--%>
									${ empty requestScope.msg ?"":requestScope.msg }
								</span>
							</div>
							<div class="form">
								<form action="userServlet" method="post">
									<input type="hidden" name="action" value="login"/>
									<label>用户名称：</label>
									<input class="itxt" type="text" placeholder="请输入用户名"
										   autocomplete="off" tabindex="1" name="username"
<%--											value="<%=request.getAttribute("username")==null?"":request.getAttribute("username")%>"/>--%>
											value="${requestScope.username}"/>

									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码"
										   autocomplete="off" tabindex="1" name="password" />
									<br />
									<br />
									<input type="submit" value="登录" id="sub_btn" />
								</form>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		<%--	静态包含页脚--%>
		<%@include file="/pages/common/footer.jsp"%>
</body>
</html>