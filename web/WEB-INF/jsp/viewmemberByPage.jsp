
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
    <tr><th>Id</th><th>FirstName</th><th>LastName</th><th>Address</th><th>City</th><th>Gender</th><th>Race</th><th>Fee</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="member" items="${msg}">   
   <tr>  
   <td>${member.id}</td>  
   <td>${member.firstName}</td>  
   <td>${member.lastName}</td>  
   <td>${member.address}</td>
      <td>${member.city}</td>
         <td>${member.gender}</td>
          <td>${member.race}</td>
           <td>${member.fee}</td>
          <td><a href="editmember/${member.id}">Edit</a></td>

   <td><a href="deletemember/${member.id}">Delete</a></td> 
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="/SpringCRUD/viewmemberByPage/1">Page 1</a>
    <a href="/SpringCRUD/viewmemberByPage/2">Page 2</a>
     <a href="/SpringCRUD/viewmemberByPage/3">Page 3</a>
     <br><br>
   <a href="/SpringCRUD/index.jsp">Main Menu</a> 