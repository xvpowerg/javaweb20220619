<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>

<%
	String value = "Ken";
	pageContext.setAttribute("value", value);

%>
</head>
<body>
	<div>
		<%=pageContext.getAttribute("value") %>
	</div>
</body>
</html>