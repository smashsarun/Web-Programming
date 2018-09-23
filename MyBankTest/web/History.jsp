<%-- 
    Document   : History
    Created on : Sep 23, 2018, 4:22:04 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>History Page</title>
    </head>
    <body>
        <h1>History Page</h1>
        <h2>${sessionScope.loggedin.name}</h2>
        
        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>TimeStamp</th>
                    <th>Method</th>
                    <th>Amount</th>
                    <th>Balance</th>
                </tr>
            </thead>
            <c:forEach items="${history}" var="hs" varStatus="hsc">
                <tr>
                    <td>${hsc.count}</td>
                    <td>${hs.time}</td>
                    <td>${hs.method}</td>
                    <td>${hs.amount}</td>
                    <td>${hs.balance}</td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a href="MyAccount">back</a>
    </body>
</html>
