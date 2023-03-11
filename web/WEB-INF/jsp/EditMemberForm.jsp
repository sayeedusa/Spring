<%-- 
    Document   : EditMemberForm
    Created on : Feb 25, 2023, 8:25:57 AM
    Author     : Ruhit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
  
        <h1>Edit Member</h1>  
       <form:form method="POST" action="/SpringCRUD/editsave">    
        <table >    
        <tr>  
        <td></td>    
        </td><form:hidden  path="id" /></td>
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="firstName"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="Fee" /></td>  
         </tr>   

         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form> 
</html>