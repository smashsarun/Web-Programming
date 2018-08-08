<%-- 
    Document   : SimpleCalculatorView
    Created on : Aug 6, 2018, 4:10:17 PM
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
        <h1>Result::</h1><hr>
        <table>
            <tr>
                <td>x</td>
                <td>=</td>
                <td>${calculator.x}</td>
            </tr>
            <tr>
                <td>y</td>
                <td>=</td>
                <td>${calculator.y}</td>
            </tr>
            <tr>
                <td>operator</td>
                <td>=</td>
                <td>${calculator.operator}</td>
            </tr>
            <tr>
                <td>result</td>
                <td>=</td>
                <td>${calculator.result}</td>
            </tr>
        </table>
        <br>
        <a href="CalculatorForm.html">Back</a>
        <a href="index.html">Home</a>
    </body>
</html>
