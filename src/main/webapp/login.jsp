<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="lATIN1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<s:form action="loginAction" class="loginForm">
			<s:textfield key="global.userName" name="userName" class="formTextField" />
			<s:password key="global.userPassword" name="password" class="formTextField" />
			<s:submit value="Login" class="actionBtn" />
		</s:form>
		<s:url action="changeLocaleAction" var="urlEn">
			<s:param name="request_locale">en</s:param>
		</s:url>
		<a href="${urlEn}">English</a>
		<s:url action="changeLocaleAction" var="url_pt_BR">
			<s:param name="request_locale">br</s:param>
		</s:url>
		<a href="${url_pt_BR}">Português Brasil</a>
	</div>

</body>
</html>