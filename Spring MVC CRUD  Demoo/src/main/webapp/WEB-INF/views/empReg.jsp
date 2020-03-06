<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>  
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register here</title>
</head>
<body bgcolor="Yellow">
	<marquee scrollamount = "10" bgcolor = "cyan"  behavior="alternate" direction = "right"> New Employee Register Below </marquee>

					<div align="center">
	
	<table>
	<div class="error">
	<form:errors path="*"> </form:errors>
	</div>
				<form:form action="saveEmployee"  modelAttribute="employee">
	
          <form:hidden path="eid"/>
		<tr>  
		<td> Name:</td>
		 <td> <form:input path="ename" />  </td> 
		<td><form:errors path ="ename" class = "error"/></td>
		
		</tr>  
       		 <br><br>     
       
       <tr>  <td> Email:</td> <td>  <form:input path="email" />  </td> 
       <td><form:errors path= "email" class = "error"/></td>  </tr> 
        <br><br>  
       <tr>  <td>  Salary: </td> <td> <form:input path="esal" />    </td> 
       <td><form:errors path = "esal" class = "error"/></td> 
       </tr>       
        <br><br>  
     
       <tr>  <td  colspan="2" align="center"><input type="submit" value="Save">   </td> </tr>  
       
        </table>  
		<a href="success">Home</a>
    </form:form>
</body>
</html>