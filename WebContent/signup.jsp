<%@page import="model.User"%>
<%@page import="model.UserDao"%>
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
String name=request.getParameter("name");
String email=request.getParameter("email");
String pass=request.getParameter("pass");

try{
	
UserDao db=new UserDao();
if(db.checkEmail(email))
{
	out.print("Email Already Registor");
}
else{

User u=new User(name,email,pass);

int a= db.insert(u);

if(a>0)
{
	out.print("data inserted");
}
else
{
	out.print("data not inserted");
}

}

} 
catch (Exception e) {
	e.printStackTrace();
}

%>

</body>
</html>

<!-- 
ToDo

1. No duplicate email register
2. CSS padding or margin reduce
 -->