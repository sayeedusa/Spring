<%-- 
    Document   : registration
    Created on : Feb 21, 2023, 8:07:57 PM
    Author     : Ruhit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Member Registration Form</h1>
        <form:form action="save" method="POST">  
        <tr>
            <td>Member ID </td>
            <td><form:input path="id"  /></td>   
        </tr><br>
        <tr>
            <td>First name: </td>
            <td><form:input path="firstName" /></td>   
        </tr><br>
        <tr> 
            <td>Last name:</td> <td><form:input path="lastName"  value="john"/></td>
        </tr>
    </tr><br>
        <tr> 
            <td>Address:</td> <td><form:input path="address"  value="farmingville"/></td>
        </tr><br>
       

        City <select name="City">
  <option value="New York">New York</option>
  <option value="Boston">Boston</option>
  <option value="California">California</option>
  <option value="Florida">Florida</option>
</select>

        <br><br>
        Gender :<input name="Gender" type="radio" value="Female">Female</input>
        <input name="gender" type="radio" value="male">Male</input>
        <br><br>  
       Race <input name="Race" type="radio" value="Asian">Asian</input> comment 
        <input name="Race" type="radio" value="Latino">Latino</input>
        <input name="Race" type="radio" value="IndianAmerican">IndianAmerican</input>
        <br><br>
        
        <br><br>
        JOining Date:<input name="date" type="date"/>
          <br><br>
       
        Member Fee:<input name="fee" type="number"/>

 <br><br>
        
        <input type="submit" value="save" />       
        <a href="index.jsp"> Main Menu</a>
    </form:form>  
   
    </body>
</html>
