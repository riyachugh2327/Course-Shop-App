
import DBConnector.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author RIYA CHUGH
 */
@WebServlet(urlPatterns = {"/AdminLogin"})
public class AdminLogin extends HttpServlet {
     @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        res.sendRedirect("login.jsp");    
    }
    
    
     @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
            String email=req.getParameter("email");
            String password=req.getParameter("password");
            String tablepassword=null;
           HttpSession session=req.getSession(true);       
     
            Statement st=null;
            ResultSet rs=null;
    
    try
    {
        st=DBConnector.getStatement();
        String query="SELECT password from admin where email='"+email+"'";
        
        rs=st.executeQuery(query);
       
        if(rs.next())
        {
            tablepassword=rs.getString(1);
        }
        
    if(email!=null && password!=null && !email.trim().equals("") && password.equals(tablepassword))
    {
                   session.setAttribute("email", email);

           resp.sendRedirect("main.jsp");
        
    }
    else
    {
        System.out.println("Login Failed");
        PrintWriter out = resp.getWriter();
        
               out.println("<html>");
               out.println("<head>");
               out.println("<title>new servlet</title>");
               out.println("</head>");
               out.println("<body >");
               out.println("<script>");
               out.println("alert('username or  Password maybe incorrect..!!');");
               out.println("location='login.jsp';");
               out.println("</script>");
               out.println("</body>");
               out.println("</head>");
               out.println("</html>");  
           
    }
    }
    catch(SQLException e)
    {
        System.out.println(e);
    }
    
    }    
}