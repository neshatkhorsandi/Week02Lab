<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 17, 2019, 12:52:40 PM
    Author     : 784789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <div>
            <form action="arithmetic" method="post">
                First: <input type="text" name="firstField"><br>
                Second: <input type="text" name="secondField"><br>
                <input type="submit" value="+" name="button">
                <input type="submit" value="-" name="button">
                <input type="submit" value="*" name="button">
                <input type="submit" value="%" name="button">
                
                <br><a href="age">Age Calculator</a>
            </form>
        </div>
        ${finalResult}
        ${display}
    </body>
</html>
