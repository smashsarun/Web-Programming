<%-- 
    Document   : Task
    Created on : Sep 19, 2018, 10:02:32 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Task</title>
    </head>
    <body>
        <h1>User: <a href="logout">${loggedin.username}</a></h1><br>
        
        <div>
            <form method="post" action="task">
                New Task: <input type="text" name="newtask">
                <input type="submit" value="add">
            </form>
            <br>
            
            <table>
                <thead>
                    <tr>
                        <th>Date</th>
                        <th>Task</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <c:forEach items="${task}" var="t">
                <tr>
                    <td>${t.createdate}</td>
                    <td>${t.task}</td>
                    <td>${t.status}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
