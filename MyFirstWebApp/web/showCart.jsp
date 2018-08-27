<%-- 
    Document   : showClass
    Created on : Aug 9, 2018, 4:13:46 PM
    Author     : INT303
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="include/Header.jsp?title=Your Shopping Cart ::"/>
        <table class="table">
            <thead>
            <th>#</th>
            <th>Product</th>
            <th>Unit Price</th>
            <th>Quantity</th>
            <th>Total Price</th>
        </thead>
        <!--        เหมือน set ว่า items แทนด้วย cart.lineItems -->
        <c:set var="items" value="${sessionScope.cart.lineItems}" />
        <c:set var="bgColorX" value="lightgrey"/>
        <c:set var="bgColorY" value="white"/>
        <c:forEach items="${items}" var="cl" varStatus="vs">
            <tr style="background-color: ${vs.count%2==1?bgColorX:bgColorY}">
                <td>${vs.count}</td>
                <td>${cl.product.productName}</td>
                <td>${cl.product.msrp}</td>                    
                <td>${cl.quantity}</td>      
                <td>
            <fmt:formatNumber value="${cl.totalPrice}" pattern="#,###.00" />
        </td>            
    </tr>                
</c:forEach>
<tr>
    <td colspan="3"></td>
    <td>Total Quantity ${cart.totalQuantity}</td>  
    <td>Total Price: <fmt:formatNumber value="${cart.totalPrice}" pattern="#,###.00"/> </td>
</tr>

</table>

</body>
</html>
