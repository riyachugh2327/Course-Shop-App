package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"homepage.css\">\n");
      out.write("        <title></title>\n");
      out.write("        <style>\n");
      out.write("        h1{\n");
      out.write("  font-size:17px;\n");
      out.write("}\n");
      out.write("#my_pop_up_box{\n");
      out.write("  position:absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  width:450px;\n");
      out.write("  transform:translate(-50%,-50%);\n");
      out.write("  display:none;\n");
      out.write("}\n");
      out.write("#my_pop_up_box button{\n");
      out.write("  float:right;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("  <div class=\"navbar\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("      <a href=\"#\">StudyPoint</a>\n");
      out.write("    </div>\n");
      out.write("    <nav>\n");
      out.write("      <ul id=\"MenuItems\">\n");
      out.write("          <a href=\"../src/java/AdminLogin.java\"></a>\n");
      out.write("        <li><a href=\"homepage.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"homepage.jsp\">Products</a></li>\n");
      out.write("        <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("        <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">Create Account</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("    <img src=\"https://i.ibb.co/6XbqwjD/menu.png\" alt=\"\" class=\"menu-icon\" onclick=\"menutoggle()\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"c.png\" alt=\"\" />\n");
      out.write("      <h4>C LANGUAGE</h4>\n");
      out.write("      <p>₹399.00</p>\n");
      out.write("  <div><a onclick=\"showme()\" href=\"\">View Details</a></div>\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"c++.jpg\" alt=\"\" />\n");
      out.write("      <h4>C++ LANGUAGE</h4>\n");
      out.write("      <p>₹399.00</p>\n");
      out.write("  <div><a onclick=\"showme1()\" href=\"\">View Details</a></div>\n");
      out.write("\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"javascript.jpg\" alt=\"\" />\n");
      out.write("      <h4>JAVASCRIPT</h4>\n");
      out.write("      <p>₹399.00</p>\n");
      out.write("       <div><a onclick=\"showme2()\" href=\"\">View Details</a></div>\n");
      out.write("\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"java.png\" alt=\"\" />\n");
      out.write("      <h4>JAVA</h4>\n");
      out.write("      <p>₹399.00</p>\n");
      out.write("  <div><a onclick=\"showme3()\" href=\"\">View Details</a></div>\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"python.jpg\" alt=\"\" />\n");
      out.write("      <h4>PYTHON</h4>\n");
      out.write("      <p>₹399.00</p>\n");
      out.write("  <div><a onclick=\"showme4()\" href=\"\">View Details</a></div>\n");
      out.write("\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"ml.png\" alt=\"\" />\n");
      out.write("      <h4>MACHINE LEARNING</h4>\n");
      out.write("      <p>₹399.00</p> \n");
      out.write("  <div><a onclick=\"showme5()\" href=\"\">View Details</a></div>\n");
      out.write("\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"data.jpg\" alt=\"\" />\n");
      out.write("      <h4>DATA STRUCTURE AND ALGORITHM</h4>\n");
      out.write("      <p>₹e399.00</p>\n");
      out.write("        <div><a onclick=\"showme6()\" href=\"\">View Details</a></div>\n");
      out.write("\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"html.jpg\" alt=\"\" />\n");
      out.write("      <h4>HTML & CSS</h4>\n");
      out.write("       <p>₹399.00</p>\n");
      out.write("  <div><a onclick=\"showme7()\" href=\"\">View Details</a></div>\n");
      out.write("\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-4\">\n");
      out.write("      <img src=\"mean.jpg\" alt=\"\" />\n");
      out.write("      <h4>MEAN STACK</h4>\n");
      out.write("      <p>₹399.00</p>\n");
      out.write("      \n");
      out.write("  <div><a onclick=\"showme8()\" href=\"\">View Details</a></div>\n");
      out.write("      <a href=\"buy.jsp\">Buy Now</a>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<div class=\"footer\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"footer-col-1\">\n");
      out.write("        <h3>Download Our App</h3>\n");
      out.write("        <p>Download App for Android and iso mobile phone.</p>\n");
      out.write("        <div class=\"app-logo\">\n");
      out.write("          <img src=\"https://i.ibb.co/KbPTYYQ/play-store.png\" alt=\"\" />\n");
      out.write("          <img src=\"https://i.ibb.co/hVM4X2p/app-store.png\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"footer-col-2\">\n");
      out.write("        <p>\n");
      out.write("          Our Purpose Is To Sustainably Make the Pleasure and Benefits of\n");
      out.write("          Sports Accessible to the Many.\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"footer-col-3\">\n");
      out.write("        <h3>Useful Links</h3>\n");
      out.write("        <ul>\n");
      out.write("          <li>Coupons</li>\n");
      out.write("          <li>Blog Post</li>\n");
      out.write("          <li>Return Policy</li>\n");
      out.write("          <li>Join Affiliate</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"footer-col-4\">\n");
      out.write("        <h3>Follow us</h3>\n");
      out.write("        <ul>\n");
      out.write("          <li>Facebook</li>\n");
      out.write("          <li>Twitter</li>\n");
      out.write("          <li>Instagram</li>\n");
      out.write("          <li>YouTube</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <hr />\n");
      out.write("    <p class=\"copyright\">Copyright &copy; 2021 - Study Point</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- js for toggle menu -->\n");
      out.write("<script>\n");
      out.write("  var MenuItems\n");
      out.write("          = document.getElementById('MenuItems');\n");
      out.write("  MenuItems.style.maxHeight = '0px';\n");
      out.write("\n");
      out.write("  function menutoggle() {\n");
      out.write("    if (MenuItems.style.maxHeight == '0px') {\n");
      out.write("      MenuItems.style.maxHeight = '200px';\n");
      out.write("    } else {\n");
      out.write("      MenuItems.style.maxHeight = '0px';\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("function showme(){\n");
      out.write("  alert('C is a useful language for almost all computer programmers. Whether you need a beginner’s introduction to the language, \\n\\\n");
      out.write("or instruction on finer points of C’s capabilities, like socket programming, studypoint has a course for you.');\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showme1(){\n");
      out.write("  alert('Take online courses in C++ (C plus plus) \\n\\\n");
      out.write("programming to improve your skills. Find beginner to advanced C++ programming courses from Microsoft and other top institutions on studypoint!');\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function showme2(){\n");
      out.write("  alert('studypoint instructors specialize in teaching the whole scope of JavaScript—beginner to advanced. Whether you’re \\n\\\n");
      out.write("interested in back-end development, or app and website building, studypoint has a JavaScript course for you.');\n");
      out.write("}\n");
      out.write("function showme3(){\n");
      out.write("  alert('In this course you’ll be exposed to fundamental programming concepts, including object-oriented programming (OOP) using Java. \\n\\\n");
      out.write("You’ll build 7 Java projects—like a basic calculator—to help you practice along the way.');\n");
      out.write("}\n");
      out.write("function showme4(){\n");
      out.write("  alert('Keen to learn Python from world-class industry experts? Enroll now to learn from the best. Become a globally recognized certified Python Developer. Enroll now to get exclusive deals. Instructor-led Classes. Expert Educators. Flexible Batch Timings. 24/7 Lifetime Support. \\n\\\n");
      out.write("No Cost EMI Option. Courses: DataScience Cert Training, Python Django Training, Big Data Hadoop Training.');\n");
      out.write("}\n");
      out.write("//function showme5(){\n");
      out.write("//  alert('This course provides a broad introduction to machine learning, datamining, and statistical pattern recognition. Topics include: (i) Supervised learning (parametric/non-parametric algorithms, support vector machines, kernels, neural networks). (ii) Unsupervised learning (clustering, dimensionality reduction, recommender systems, deep learning). (iii) Best practices in machine learning (bias/variance theory; innovation process in machine learning and AI). The course will also draw from numerous case studies and applications, so that you'll also learn how to apply learning algorithms to building smart robots (perception, control), text understanding (web search, anti-spam), computer vision, medical informatics, audio, database mining, and other areas.\n");
      out.write("//          ');\n");
      out.write("}\n");
      out.write("function showme6(){\n");
      out.write("  alert('Course Description: This course is an 11-week workshop that will take you through all the common Data Structures like Arrays, Trees, Graphs, LinkedList, and many such concepts in a highly interactive manner. Every week you will be interacting with the top industry expert where you will learn how they implement DSA in real-life scenarios.');\n");
      out.write("}\n");
      out.write("function showme7(){\n");
      out.write("  alert('HTML is the foundation of all web pages. It defines the structure of a page, while CSS defines its style. HTML and CSS are the beginning of everything you need to know to make your first web page! Learn both and start creating amazing websites.');\n");
      out.write("}\n");
      out.write("function showme8(){\n");
      out.write("  alert('Learning how to design both the front and back end of web applications opens up twice as many job opportunities for developers. If you already know JavaScript, learning the MEAN Stack is easy. Udemy offers top-rated courses on every aspect of MEAN usage, from Angular, to Node.js, to Express, and MongoDB.');\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}