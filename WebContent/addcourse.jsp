<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String coursetitle =request.getParameter("coursetitle");
String instructor =request.getParameter("instructor");
String category =request.getParameter("category");
String totalenroll =request.getParameter("totalenroll");
String fees =request.getParameter("fees");
String imgurl =request.getParameter("imgurl");




%>
<%=coursetitle %>
<%=instructor %>
<%=category %>
<%=totalenroll %>
<%=fees %>
<%=imgurl %>



<form action="upload.jsp" method="post" enctype="multipart/form-data">
<input type="file" name="imgurl" ><br/>
<input type="submit" >
</form>




</body>
</html>