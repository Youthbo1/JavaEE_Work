<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:iterator value="#session.essay" var="b">

	<s:property value="content"/></br></br></br>
	<s:property value="publishtime"/></br>
	<hr /><hr />
</s:iterator>
<a href="publish.jsp">发微博</a>
</br>
当前用户名：<s:property value="#session.username"/>
</body>
</html>