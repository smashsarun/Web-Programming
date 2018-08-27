<%-- 
    Document   : MultiplyTable
    Created on : Aug 10, 2018, 2:08:03 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td colsapan="5"><h2 style="color: orange">Table of ${param.n}</h2></td>
            </tr>
            <c:forEach begin="2" end="12" var="x">
                <tr>
                    <td style="text-align: right">${param.n}</td>
                    <td>x</td>
                    <td style="text-align: right">${x}</td>
                    <td>=</td>
                    <td style="text-align: right">${param.n*x}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
