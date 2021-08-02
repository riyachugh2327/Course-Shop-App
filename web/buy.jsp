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
        <%
                        String email = (String)session.getAttribute("email");

            %>
            
            <div class="holder">
        <div class="parent">
            <h3>Your Cart</h3>
            <form action="BuyNow" method="Post">
                <div>
                    <input type="text" placeholder="Name *" name="name"  required>
                    <span class="border"></span>
                </div>
                <div>
                    <input type="email" value="<%=email%>" name="email" readonly>
                    <span class="border"></span>
                </div>
                <div>
                    <input type="text" placeholder="Course *" name="course" required>
                    <span class="border"></span>
                </div>
                
                 
                    <input type="text" placeholder="date *" name="date" hidden>
                
               
                      <input type="submit" value="Buy Now" class="private-inp">
            </form>
             </div>
    </div>
    </body>
</html>
