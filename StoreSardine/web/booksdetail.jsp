<%-- 
    Document   : booksdetail
    Created on : Sep 16, 2018, 10:34:47 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail</title>
    </head>
    <body>
        <h1>Books detail</h1>
        <h3>Books ID : ${bookdetail.bookid}</h3>
        <h3>Books Name : ${bookdetail.bookname}</h3>
        <h3>Books Category : ${bookdetail.category}</h3>
        <h3>Books Price : ${bookdetail.price}</h3>
        <h3>Books Description : ${bookdetail.description}</h3>
    </body>
</html>
