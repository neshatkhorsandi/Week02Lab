<%-- 
    Document   : agecalculator
    Created on : Sep 12, 2019, 4:14:59 PM
    Author     : 784789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form action="age" method="post">
                Enter your age: <input type="text" name="ageField"><br>
                <input type="submit" value="Age next birthday">
                <br><a href="arithmetic">Arithmetic Calculator</a>
            </form>
        </div>
        
        ${ageValue}   
    </body>
</html>
