<%-- 
    Document   : TicketManager
    Created on : Sep 18, 2018, 9:13:54 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="Header.jsp?titleName=ManageTicket"></jsp:include>
            <title>Ticket Manager</title>
        </head>
        <body>
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
                <tr>
                    <td>${movie.movieid}</td>
                    <td>${movie.moviename}</td>
                    <td>${movie.category}</td>
                    <td>${movie.description}</td>
                    <td>${movie.branch}</td>
                    <td>${movie.showtime}</td>
                    <td>${movie.date}</td>
                    <td>${movie.theater}</td>
                </tr>
        </table>
    </body>
</html>
