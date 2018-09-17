<%-- 
    Document   : bookslist
    Created on : Sep 16, 2018, 10:06:38 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book List</title>
    </head>
    <body>


        <table>
            <thead>
            <th>Book ID </th>
            <th>Book Name </th>
            <th>Book Category </th>
            <th>Book Price </th>
            <th>More</th>
        </thead>
        <c:forEach items="${bookslist}" var="bl" >
            <tr>
                <td>${bl.bookid}</td>                    
                <td>${bl.bookname}</td>                    
                <td>${bl.category}</td>                    
                <td>${bl.price}</td>
                <td><a href="booksdetail?bookid=${bl.bookid}">More</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
