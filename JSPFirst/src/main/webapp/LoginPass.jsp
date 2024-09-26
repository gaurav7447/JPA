<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
<%
String user = request.getParameter("uname");
String pass = request.getParameter("pass");

if(user != null && pass != null) {
    if(user.equals("admin") && pass.equals("admin123")) {
    	out.println("Welcome");
        
      
    } else {
    	out.println("Sorry");
       
    }}
 else {
	 out.println("Welcome");
    
}
%>





</body>
</html>