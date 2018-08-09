<%-- 
    Document   : showClass
    Created on : Aug 9, 2018, 4:13:46 PM
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
        <h1>Your Cart (${cart.totalQuantity})</h1>
                <table>
            <thead>
                <th>#</th>
                <th>Product</th>
                <th>Unit Price</th>
                <th>Quantity</th>
                <th>Total Price</th>
            </thead>
            <c:forEach items="${cart.lineItems}" var="cl" varStatus="vs">
                <tr>
                    <td>${vs.count}</td>
                    <td>${cl.product.productName}</td>
                    <td>${cl.product.msrp}</td>                    
                    <td>${cl.quantity}</td>      
                    <td>${cl.salePrice}</td>             
                </tr>                
            </c:forEach>
                
        </table>
        <h3>Total Price: ${cart.totalPrice}</h3>
    </body>
</html>
