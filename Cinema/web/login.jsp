<%-- 
    Document   : login
    Created on : Sep 17, 2018, 5:32:20 PM
    Author     : SARUNSUMETPANICH
--%>

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
        <h1>Login</h1>
        <form action="login" method="post">
            User Id <input type="text" name="userid">
            Password: <input type="password" name="password">
            <input type="submit" value="submit">
        </form>
        <br>
        <div style="color: red">${msg}</div>
    </body>
</html>
