    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<marquee scrollamount = "10" bgcolor = "#99ff99"  behavior="alternate" direction = "right"> Employees List  </marquee>
	
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Age</th><th>Salary</th><th>Designation</th><th>Gender</th><th>Location</th><th>Update</th><th>Delete</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
        <td>${emp.age}</td>
    <td>${emp.salary}</td>
    <td>${emp.designation}</td>
        <td>${emp.gender}</td>
        <td>${emp.location}</td>
    
    
    <td><a href="editemp/${emp.id}">Update</a></td>
    <td><a href="deleteemp/${emp.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="empform">Add New Employee</a>