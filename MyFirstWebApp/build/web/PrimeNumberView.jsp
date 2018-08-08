<%-- 
    Document   : PrimeNumberView
    Created on : Aug 8, 2018, 9:49:12 AM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prime Number Application::</h1><hr>
        <form action="PrimeNumber" method="post">
            Please insert number:
            <input type="number" name="number" required min="2"/>
            <input type="submit" value="OK"/>
        </form>
        <hr>
        ${pn.primeNumber}
        
        <h4>${pn.number} is ${pn.primeNumber?"":"not"} Prime Number</h4>
    </body>
</html>
