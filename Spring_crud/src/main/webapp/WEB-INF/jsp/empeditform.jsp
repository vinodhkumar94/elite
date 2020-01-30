<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<marquee scrollamount = "10" bgcolor = "#99ff99"  behavior="alternate" direction = "right"> Update Form  </marquee>
		
       <form:form method="POST" action="/Spring_crud/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
          <tr>  
          <td>Age : </td> 
          <td><form:input path="age"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="designation" /></td>
         </tr> 
          <tr>  
          <td>Gender : </td> 
          <td><form:input path="gender"  /></td>
         </tr>  
           <tr>  
          <td>Location : </td> 
          <td><form:input path="location"  /></td>
         </tr>  
         <tr>  
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Update" /></td>  
         </tr>  
        </table>  
       </form:form>  
