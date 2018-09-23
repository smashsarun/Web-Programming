<%-- 
    Document   : Deposit
    Created on : Sep 23, 2018, 2:52:00 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
        <h1>Deposit Page</h1>
        <h2>${sessionScope.loggedin.name}</h2>
        <h2>balance ${sessionScope.loggedin.balance}</h2>
        <form method="post" name="Deposit">
            <input type="number" name="deposit" required><br>
            <input type="submit" value="submit">
        </form>
        <br>
        <a href="MyAccount">back</a>
    </body>
</html>
