<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user,pass;
user=request.getParameter("username");
pass=request.getParameter("userpass");
if(user.equals("sindhu") && pass.equals("sindhu@123"))
	request.getRequestDispatcher("jsp2.jsp").forward(request,response);
else
	out.println("error");
	
%>
</body>
</html>