<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("email")!=null)
{	
%>

welcome prfile  <a href="logout.jsp">Logout</a>

<%}
else
{
	out.print("<script>alert('Please Login first') </script>");
	request.getRequestDispatcher("login.jsp").include(request, response);
}
%>
</body>
</html>