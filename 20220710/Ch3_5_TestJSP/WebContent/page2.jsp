<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page info="This is my Mssage!" %>
<%@include file="menu.html" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String info = this.getServletInfo();
out.println(info);
%>
</body>
</html>