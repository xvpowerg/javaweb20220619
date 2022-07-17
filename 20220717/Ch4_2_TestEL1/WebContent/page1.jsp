<%@page import="tw.com.bean.Item" %>
<%@page import="tw.com.bean.User" %>
<%@page import= "java.util.List" %>
<%@page import= "java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Page1</title>
</head>
<body>
	<%
		Item item =(Item)request.getAttribute("item1");
		User user = (User) session.getAttribute("user1");
		List<User> userList =(List<User>) session.getAttribute("userList");
		Map<String,User> userMap =(Map<String,User>) session.getAttribute("userMap");
	%>
	<p>name:<%=item.getName()%></p>
	<p>price:<%=item.getPrice()%></p>
	<h2>User</h2>
	<p>name:<%= user.getName()%></p>
	<p>age:<%= user.getAge()%></p>
    <h2>userList</h2>
    <%for(User u :  userList){%>
    <p>name:<%=u.getName() %></p> 		
	<p>age:<%=u.getAge() %></p>
	<%} %>
		
	<%=userMap.get("user1").getName()%>	
	
</body>
</html>