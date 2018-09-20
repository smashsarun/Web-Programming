<%-- 
    Document   : login
    Created on : Sep 18, 2018, 3:18:50 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="login">
            Username <input type="text" name="username" required>
            Password <input type="password" name="password" required>
            <input type="submit" value="submit"><br>
            ${msg}
        </form>
    </body>
</html>
