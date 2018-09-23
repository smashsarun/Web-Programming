<%-- 
    Document   : Login
    Created on : Sep 23, 2018, 2:17:57 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1><br>
        ${msg}<br>
        <form method="post" name="Login">
            Account id: <input type="number" name="accid" required><br>
            Pin: <input type="password" name="pin" required><br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
