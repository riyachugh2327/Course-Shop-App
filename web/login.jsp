<%-- 
    Document   : login
    Created on : 1 Aug, 2021, 7:03:45 PM
    Author     : RIYA CHUGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="login.css">
        <title>JSP Page</title>
    </head>
    <body>
            <div class="holder">
        <div class="parent">
            <h3>Login</h3>
            <form action="AdminLogin" method="Post">
                <div>
                    <input type="email" placeholder="Email *" name="email" required>
                    <span class="border"></span>
                </div>
                <div>
                    <input type="password" placeholder="Password *" name="password" required>
                    <span class="border"></span>
                </div>
                <input type="submit" value="LOGIN" class="private-inp">
                <p>
                   Don't Have Account?
                    <a href="signup.jsp">Sign Up Here</a>
                </p>
            </form>
            
        </div>
    </div>
    </body>
</html>
