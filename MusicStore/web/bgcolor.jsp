<%-- 
    Document   : bgcolor
    Created on : Sep 17, 2018, 11:42:04 AM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Choose Background color</title>
    </head>
    <body>
        <h1>Choose Background color</h1>
        <form method="post" name="bgcolor">
            <input type="radio" value="normal" name="bgcolor" 
                   ${cookie.bgcolor.value == "normal"?"checked":""}>normal
            <input type="radio" value="orange" name="bgcolor"
                   ${cookie.bgcolor.value == "orange"?"checked":""}>orange
            <input type="radio" value="grey" name="bgcolor"
                   ${cookie.bgcolor.value == "dark"?"checked":""}>dark
            <input type="submit" value="submit">
        </form>
    </body>
</html>
