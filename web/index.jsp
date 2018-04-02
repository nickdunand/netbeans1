<%-- 
    Document   : index
    Created on : 28-Mar-2018, 18:32:21
    Author     : Nicholas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="Name Input Form" action="response.jsp">
            Enter your name:
            <input type="text" name="name" value="text" />
            <input type="submit" value="OK" />
        </form>
        
        <h4> Click here to go to <a href="MySecondServlet">MySecond Servlet Page</a></h4>
        
        <form action="MySecondServlet" method="POST">
       First Name: <input type="text" name="firstName" value="bob" size="20"><br />
       Surname: <input type="text" name="surname" value="builder" size="20">
       <br /><br />
       <input type="submit" value="Submit">
   </form>
        
    </body>
</html>
