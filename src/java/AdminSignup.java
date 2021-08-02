
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DBConnector.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RIYA CHUGH
 */
@WebServlet(urlPatterns = {"/AdminSignup"})
public class AdminSignup extends HttpServlet {

/**
 *
 * @author mihir
 */
        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
        {
                res.sendRedirect("signup.jsp");
        }

        @Override
        public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
        {
                String name = req.getParameter("name");
                String email = req.getParameter("email");
                String password = req.getParameter("password");
                String confirmpassword = req.getParameter("confirmpassword");
                Statement st = null;
                ResultSet rs = null;

                try 
                {

                        st = DBConnector.getStatement();
                        String stremail ="SELECT count(*) FROM admin where email='" + email +"'";
                        System.out.println(stremail);
                        rs=st.executeQuery(stremail);
                        rs.next();
                        String Countemail = rs.getString(1);
                       
                                if (Countemail.equals("0")) 
                                {
                                                if (confirmpassword.equals(password))
                                                {

                                                        String insertQuery = new String("insert into admin (name,email,password) values('" + name +  "','" + email + "','" + password + "')");
                                                        int i = st.executeUpdate(insertQuery);

                                                        if (i > 0)
                                                        {
                                                                System.out.println(i + " record inserted");
                                                                resp.sendRedirect("login.jsp");
                                                        }
                                                } 
                                                else
                                                {
                                                        PrintWriter out = resp.getWriter();

                                                        out.println("<html>");
                                                        out.println("<head>");
                                                        out.println("<title>new servlet</title>");
                                                        out.println("</head>");
                                                        out.println("<body >");
                                                        out.println("<script>");
                                                        out.println("alert('confirm Password not matched!!');");
                                                        out.println("location='signup.jsp';");
                                                        out.println("</script>");
                                                        out.println("</body>");
                                                        out.println("</head>");
                                                        out.println("</html>");
                                                }
                                }
                               else 
                                {
                                        PrintWriter out = resp.getWriter();

                                        out.println("<html>");
                                        out.println("<head>");
                                        out.println("<title>new servlet</title>");
                                        out.println("</head>");
                                        out.println("<body >");
                                        out.println("<script>");
                                        out.println("alert('email already registered');");
                                        out.println("location='signup.jsp';");
                                        out.println("</script>");
                                        out.println("</body>");
                                        out.println("</head>");
                                        out.println("</html>");

                                }
                        
                }
                catch (SQLException e) 
                {
                        System.out.println(e);
                }

        }
}