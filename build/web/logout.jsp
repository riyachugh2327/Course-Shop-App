<%-- 
    Document   : logout
    Created on : Feb 5, 2021, 6:06:56 PM
    Author     : mihir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
         <%
            String str = (String)session.getAttribute("email");
            session.removeAttribute(str);
            session.getMaxInactiveInterval();
            session.invalidate();
            response.sendRedirect("homepage.jsp");
        %>
    </body>
</html>
