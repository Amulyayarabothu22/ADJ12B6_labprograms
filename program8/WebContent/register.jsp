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
	String mobileno;
	String dept;
	String email;
	Statement ob;
	int rows;
%>
<%
con=null;
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adj","root","");
	System.out.println("Database Connected Successfully");
	ob = con.createStatement();
	regno  = request.getParameter("regno");
	password  = request.getParameter("password");
	mobileno  = request.getParameter("mobileno");
	dept  = request.getParameter("dept");
	email  = request.getParameter("email");
	String query="insert into regdata values(?,?,?,?,?)";
	PreparedStatement psmt=con.prepareStatement(query);
	psmt.setString(1,regno);
	psmt.setString(2,password);
	psmt.setString(3,mobileno);
	psmt.setString(4,dept);
	psmt.setString(5,email);
	rows=psmt.executeUpdate();
	if(rows >0) {%>
		<h1>data inserted successfully</h1>
		<%
	}
	else {%>
		<h1>Data is not inserted</h1>
		<%
	}
%>
</body>
</html>