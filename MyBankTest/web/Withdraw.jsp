<%-- 
    Document   : Withdraw
    Created on : Sep 23, 2018, 3:17:20 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdraw Page</title>
    </head>
    <body>
        <h1>Withdraw Page</h1>
        <h2>${sessionScope.loggedin.name}</h2>
        <h2>balance ${sessionScope.loggedin.balance}</h2>
        <form method="post" name="Withdraw">
            <input type="number" name="withdraw" required><br>
            <input type="submit" value="submit">
        </form>
        <br>
        <a href="MyAccount">back</a>
    </body>
</html>
