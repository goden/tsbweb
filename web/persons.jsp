<%-- 
    Document   : persons
    Created on : 2020/8/24, 上午 03:07:43
    Author     : goden
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Customers</h1>
        <table border='1'>
            <c:forEach var="person" items="${persons}">
                <tr>
                    <td>${person.id}</td>
                    <td>${person.firstname}</td>
                    <td>${person.lastname}</td>
                    <td>${person.city}</td>
                    <td>${person.street}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
