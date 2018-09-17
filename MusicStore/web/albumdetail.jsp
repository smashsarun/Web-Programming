<%-- 
    Document   : albumdetail
    Created on : Sep 17, 2018, 11:28:08 AM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail of ${detail.albumname}</title>
    </head>
    <body style="background-color: ${cookie.bgcolor.value}">
        <h1>Detail of ${detail.albumname}</h1>
        <h2>Album id: ${detail.albumid}</h2>
        <h2>Album name: ${detail.albumname}</h2>
        <h2>Album genre: ${detail.genre}</h2>
        <h2>Album price: ${detail.price}</h2>
    </body>
</html>
