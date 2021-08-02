

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DBConnector.DBConnector"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="css/font-awesome.css" rel="stylesheet" type="text/css">
        <!-- owl carousel css-->
        <link rel="stylesheet" href="owl-carousel/assets/owl.carousel.min.css" type="text/css">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- custom CSS -->
        <link rel="stylesheet" href="css/responsive.css">

        <link rel="stylesheet" href="css/list.css">
        <link rel="stylesheet" href="css/newcss.css">
        <style>
            .modal-body{
                margin: 0 auto;
            }
table{
    width: 40%;
     border-collapse: separate;
  border-spacing: 0.25em 1em;
  border: white;
  align-item:center;

    
}
.head
{
    font-weight: bold;
}
tr,td{
   padding: 0.25em 0.5em;
  text-align: left;
  color: black;
}
td:nth-child(3) {
  text-align: center;
}
td,input{
  border: none;
 
}
tr {
  color: #fff;
}

input{
    width: 290px;
    outline: none;
}</style>
    </head>
    <body>


        <div class="modal-body">
            <div class="table-responsive-sm table-responsive-md table-responsive-lg table-responsive-xl">
                <table class="table table-striped" border="1">
                    <thead style="background: #16c9f6; color: white; font-size: 20px;">
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Course</th>
                            <th scope="col">Date</th>

                        </tr>
                    </thead>
                    <tbody>


                        <%
                            String str = (String)session.getAttribute("email");
                            ResultSet rs = null;
                            Statement st = null;
                            try {
                                st = DBConnector.getStatement();
                                String query = "select name,email,course,date from admin where email = '" + str + " ' ";
                                rs = st.executeQuery(query);
                                System.out.println(query);
                                if (rs.next()) {
                                    do {
                                        String name = rs.getString("name");
                                        String email = rs.getString("email");
                                        String course = rs.getString("course");
                                        String d = rs.getString("date");
                        %>
                        <tr>
                            <td><%=name%></td>
                            <td><%=email%></td>
                            <td><%=course%></td>
                            <td><%=d%></td>
                        </tr>

                        <%
                                    } while (rs.next());
                                } else {
                                    out.println("No records found");
                                }
                            } catch (SQLException e) {
                                System.out.println(e);
                            }

                        %>


                    </tbody>
                </table>
            </div>

        </div>

    </div>
</div>
</div>



</body>
</html>

