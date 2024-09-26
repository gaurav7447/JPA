<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Palendrome Number</h2>
<p>
<%

int num1=Integer.parseInt(request.getParameter("number"));
int r,sum=0,temp;

temp=num1;

while(num1>0){
	r=num1%10;  
	   sum=(sum*10)+r;    
	   num1=num1/10;
	
	
}
if(temp==sum)    
	  out.println("palindrome number ");    
	  else    
	  out.println("not palindrome");    
%>
</p>


</body>
</html>