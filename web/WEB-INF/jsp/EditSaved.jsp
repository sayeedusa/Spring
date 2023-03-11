<%-- 
    Document   : EditSaved
    Created on : Feb 25, 2023, 5:40:18 PM
    Author     : Ruhit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Saved</h1>
        <h3>Database Modified</h3>
        Name: ${member.firstName}
        Fee:  ${member.fee}
        <br><br>
        <a href="viewmember"> View Member</a>
    </body>
</html>
