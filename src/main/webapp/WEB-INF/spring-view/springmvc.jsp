
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>第一个SpringMVC实例</title>
</head>
<%
	String str = (String) request.getAttribute("helloWorld");
%>
<body>
	<H1><%=str%></H1>
</body>
</html>