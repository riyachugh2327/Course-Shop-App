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
            <h3>Sign Up</h3>
            <form action="AdminSignup" method="Post">
                <div>
                    <input type="text" placeholder="Name *" name="name"  required>
                    <span class="border"></span>
                </div>
                <div>
                    <input type="email" placeholder="Email *" name="email" required>
                    <span class="border"></span>
                </div>
                <div>
                    <input type="password" placeholder="Password *" name="password" required>
                    <span class="border"></span>
                </div>
                <div>
                    <input type="password" placeholder="Confirm Password *" name="confirmpassword"  required>
                    <span class="border"></span>
                </div>
                <input type="submit" value="Sign Up" class="private-inp">
                <p>
                    Have Account?
                    <a href="login.jsp">Login</a>
                </p>
            </form>
             </div>
    </div>
    </body>
</html>
