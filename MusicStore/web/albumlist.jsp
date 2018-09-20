<%-- 
    Document   : albumlist
    Created on : Sep 17, 2018, 11:03:18 AM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Album List</title>
    </head>
    <body style="background-color: ${cookie.bgcolor.value}">
        <h1>Album list</h1>

        <table>
            <thead>
            <th>Album Id</th>
            <th>Album Name</th>
            <th>Genre</th>
            <th>Price</th>
            <th>Detail</th>
            <th>Add</th>
        </thead>        
        <c:forEach items="${album}" var="al">
            <tr>
                <td>${al.albumid}</td>
                <td>${al.albumname}</td>
                <td>${al.genre}</td>
                <td>${al.price}</td>
                <td><a href="albumdetail?albumid=${al.albumid}">Detail</a></td>
            <form method="post" action="addtocart">
                <td><a href="addtocart?albumid=${al.albumid}"><input type="button" value="Add to cart"></a></td>
            </form>
        </tr>
    </c:forEach>
</table>
</body>
</html>
