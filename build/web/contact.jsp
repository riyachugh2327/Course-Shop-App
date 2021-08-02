<%-- 
    Document   : about
    Created on : Aug 2, 2021, 6:11:35 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="contact.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
  <div class="contact">
    <div class="left">
      <div class="heading">Contact Us</div>
      <div class="para">Feel free to contact us</div>
                  <form action="main.jsp">

      <div class="form">
        <div class="field">
          <input type="text" name="name" id="name" required>
          <label for="name" class="label">Your Name</label>
        </div>
        <div class="field">
          <input type="email" name="email" id="email" required>
          <label for="email" class="label">Your Email</label>
        </div>
        <div class="field">
          <input type="text" name="phone" id="phone" required>
          <label for="phone" class="label">Your Mobile Number</label>
        </div>
        <div class="field">
          <textarea name="msg" id="msg" cols="30" rows="5" required></textarea>
          <label for="msg" class="label t_msg">Your Message</label>
        </div>
        <!--<button class="btn">Submit <div></div> </button>-->
        <input type="submit" class="btn">
      </div>
</form>
    </div>
    <div class="right">
      <div class="right_heading">Contact Information</div>
      <div class="tabs">
        <div class="tab1 tab">
          <div class="email"><i class="fas fa-at"></i>riyachugh58@gmail.com</div>
        </div>
        <div class="tab2 tab">
          <div class="phone"><i class="fas fa-phone"></i>9000478900</div>
        </div>
        <div class="tab3 tab">
          <div class="location"><i class="fas fa-home"></i>Indore, India</div>
        </div>
      </div>
      <div class="social">
        <i class="fab fa-facebook"></i>
        <i class="fab fa-instagram"></i>
        <i class="fab fa-youtube"></i>
      </div>
    </div>

  </div>
</div>
    </body>
</html>
