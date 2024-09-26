<%@ page import = "java.sql.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="ErrorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INSERTION</title>
</head>
<body>


 <%!
     Connection con;
     PreparedStatement ps;
     
     public void jspInit()
     {
    	
 		
    	 try{
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganeshfestival","root","1234");
    		 ps = con.prepareStatement("insert into mandal_info values(?,?,?,?,?)");
    		 
    		 
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
     }
     
     public void jspDestroy()
     {
    	 try{
    		 con.close();
    		 ps.close();
    	 }
    	 catch(Exception e){
    		 e.printStackTrace();
    	 }
     }

 %>
 
 <%
     String name = request.getParameter("mandal_name");
     String place = request.getParameter("mandal_loca");
     int pincode = Integer.parseInt(request.getParameter("pin_code"));
     String theme = request.getParameter("mandal_theme");
     String prasad = request.getParameter("prasad");
     
     ps.setString(1, name);
     ps.setString(2, place);
     ps.setInt(3, pincode);
     ps.setString(4, theme);
     ps.setString(5, prasad);
     
     ps.executeUpdate();
    

 %>
 
 <div style = "color:green"><%= "Record Inserted!" %></div><br>
 
 <%@ include file="MandalInfo.html" %>
 

</body>
</html>