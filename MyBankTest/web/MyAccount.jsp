<%-- 
    Document   : MyAccount
    Created on : Sep 23, 2018, 2:24:02 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Account</title>
    </head>
    <body>
        <h1>MyAccount Page</h1>        
        ${msg}
        <h2>${sessionScope.loggedin.name}</h2>
        <h2>balance ${balance}</h2>
        
        <h2><a href="Deposit">Deposit</a></h2>
        <h2><a href="Withdraw">Withdraw</a></h2>
        <h2><a href="History">History</a></h2>
        <br>
        <h2><a href="Logout">logout</a></h2>
    </body>
</html>
