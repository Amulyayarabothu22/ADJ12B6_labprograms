<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*,javax.sql.*"%>
<%!
	Connection con;
	String regno;
	String password;
	ResultSet rows;
%>
<%
con=null;
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adj","root","");
	System.out.println("Database Connected Successfully");
	
	regno  = request.getParameter("regno");
	password  = request.getParameter("password");
	String query="select * from regdata where regno = ? and password = ?";
	PreparedStatement psmt=con.prepareStatement(query);
	psmt.setString(1,regno);
	psmt.setString(2,password);
	rows=psmt.executeQuery();
	if(rows.next()) {%>
		<h1>welcome <%= regno %></h1>
		<%
	}
	else {%>
		<h1>Incorrect Registration no or Password</h1>
		<%
	}
%>
</body>
</html>