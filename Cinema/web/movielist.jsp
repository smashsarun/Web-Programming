<%-- 
    Document   : movielist
    Created on : Sep 17, 2018, 4:20:45 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="Header.jsp?titleName=MovieList"></jsp:include>
    </head>
    <body>
        <h1>List of Movie</h1>
        <table class="table table-striped">
            <thead>
                <tr>
            <th>Movie ID</th>
            <th>Movie Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Branch</th>
            <th>Show Time</th>
            <th>Date</th>
            <th>Theater</th>          
                </tr>
        </thead>
        <c:forEach items="${movielist}" var="mv">
            <tr>
            <td>${mv.movieid}</td>
            <td>${mv.moviename}</td>
            <td>${mv.category}</td>
            <td>${mv.description}</td>
            <td>${mv.branch}</td>
            <td>${mv.showtime}</td>
            <td>${mv.date}</td>
            <td>${mv.theater}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
