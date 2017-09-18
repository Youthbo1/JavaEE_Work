<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Published essays</title>
</head>
<body>
	<div
		style="position: absolute; background-color: #FCFCFC; width: 600px; height: 500px; left: 50%; top: 50%; margin-left: -300px; margin-top: -300px; text-align: center">
		<h1>Publish Essays</h1>
		<s:form action="Publish" theme="simple">
			<table align="center" width="80%">
				
				<tr>
					<td>Essays Content：</td>
					<td><s:textarea name="content" cols="40" rows="20" resize="none" /></td>
				</tr>
			</table>
			<br/>
					<s:submit value="Publish" />
		</s:form>
	</div>
</body>
</html>