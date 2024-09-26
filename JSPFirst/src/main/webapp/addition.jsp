<%@ page import="java.util.*" import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
<h2>This is addition page</h2>
<p>
<%
ArrayList<Integer> number=new ArrayList<Integer>();
int num1=Integer.parseInt(request.getParameter("number1"));
int num2=Integer.parseInt(request.getParameter("number2"));
number.add(num1);
number.add(num2);

int sum=num1+num2;


%>
The sum of <%= num1 %> and <%= num2%> is equal to  <%=sum %>
Total number for addition are <%= number %>

</p>

</body>
</html>