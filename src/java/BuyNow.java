/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DBConnector.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/BuyNow"})
public class BuyNow extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
        {
                res.sendRedirect("buy.jsp");
        }

        @Override
        public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
        {
                String name = req.getParameter("name");
                String email = req.getParameter("email");
                String course = req.getParameter("course");
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();
                HttpSession session=req.getSession(true);  
                session.setAttribute("email", email);
                Statement st = null;
                ResultSet rs = null;

                try 
                {

            st = DBConnector.getStatement();
             String insertQuery = new String("insert into admin (name,email,course,date) values('" + name +  "','" + email + "','" + course  + "','" + now + "')");
                        int i = st.executeUpdate(insertQuery);
                           if (i > 0 )
                         {
                                   System.out.println(i + " record inserted");
                                resp.sendRedirect("pay.jsp");
                          }
                                
                }
                catch (SQLException e) 
                {
                        System.out.println(e);
                }

        }
}