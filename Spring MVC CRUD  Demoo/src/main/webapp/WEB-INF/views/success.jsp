<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Employee Data</title>
</head>
<body bgcolor="cyan">

	<marquee scrollamount = "10" bgcolor = "pink"  behavior="alternate" direction = "right"> Employee Registered Successfully  </marquee>
		<div align="center">
	
		<h1>Employee List</h1>
		
		<table border="1">

			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Salary</th>
			<th>Action</th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.eid}</td>
					<td>${employee.ename}</td>
					<td>${employee.email}</td>
					<td>${employee.esal}</td>
					<td><a href="editEmployee?eid=${employee.eid}">Update</a>
						 <a	href="deleteEmployee?eid=${employee.eid}">Delete</a></td>
						 

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>
	</div>
</body>
</html>