<%@page import="tw.com.beans.Item"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<ol>
	<%
	String appValue = (String)application.getAttribute("appValue");
	ArrayList<Item>	list = (ArrayList)session.
	getAttribute("itemList");
		for(Item it : list){
	%>
		<li><%=it.getId() %>:<%=it.getName()%></li>		
	
	<%} %>
	</ol>
	reqAttr:<%=request.getAttribute("reqAttr") %>
	appValue:<%=appValue %>
</body>
</html>