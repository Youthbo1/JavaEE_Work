<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<div
		style="position: absolute; background-color: none; width: 500+px; height: 200px; left: 50%; top: 50%; margin-left: -200px; margin-top: -100px; text-align: center">
		<h1>注册</h1><br/><br/>
		<s:form action="register" theme="simple">
			用户名：<s:textfield name="username" label="用户名" /><br/><br/>
			密码：<s:password name="pwd" label="密码" /><br/><br/>
			昵称：<s:textfield name="name" label="昵称" /><br/><br/>	
			<s:submit value="注册" />
			<br/>
		</s:form>
	</div>
</body>
</html>