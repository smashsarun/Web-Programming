<%-- 
    Document   : ChooseFont
    Created on : Sep 15, 2018, 5:11:51 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Choose Font</title>
    </head>
    <body>
        <h1>Choose Font</h1>
        <form method="post" action="ChooseType">
            <input type="radio" name="font" value="normal"
                   ${cookie.choosefont.value != "kanit" ? "checked" : ""}> normal
            <input type="radio" name="font" value="knit"
                   ${cookie.choosefont.value == "kanit" ? "checked" : ""}> kanit
        </form>
    </body>
</html>
