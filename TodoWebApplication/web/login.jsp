<%-- 
    Document   : login
    Created on : Sep 19, 2018, 9:16:38 PM
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
        <h1>Login</h1>
        <form method="post" action="TodoLogin">
            Username: <input type="text" name="username"><br>
            Password: <input type="password" name="password"><br>
            
            <input type="submit" value="submit">
            
        </form>
        <div>${msg}</div><br>
    </body>
</html>
