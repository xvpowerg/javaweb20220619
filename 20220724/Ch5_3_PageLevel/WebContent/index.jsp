<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<%
String title = "我的首頁";
String info = "測設Page Level";
pageContext.setAttribute("title", title);
pageContext.setAttribute("info", info);

%>
<head>
<meta charset="utf-8">
<title>${title}</title>
</head>
<body>
<div>${info}</div>
</body>
</html>