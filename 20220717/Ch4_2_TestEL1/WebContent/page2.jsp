<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Page2 EL</title>
</head>
<body>
	<!-- EL 搜尋變數順序 page request session context -->
	<p>Item</p>
	<p>name:${item1.name}</p>
	<p>price:${item1.price}</p>
	<p>User</p>
	<p>name:${user1.name}</p>
	<p>age:${user1.age}</p>
	
	<c:forEach var="myUser" items="${userList}">
		<p>name:${myUser.name }</p>
		<p>age:${myUser.age }</p>
	</c:forEach>
	
	<p>${userMap.user1.name}</p>
	 <p>${userMap["user2"].name}</p>
</body>
</html>