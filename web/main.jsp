<%-- 
    Document   : homepage
    Created on : 2 Aug, 2021, 10:27:56 AM
    Author     : RIYA CHUGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="homepage.css">
        <title></title>
        <style>
        .logo
        {
          font-weight: bolder;
            color:#3498db;
  
        }
        </style>
    </head>
    <body>
  <div class="container">
  <div class="navbar">
    <div class="logo">
      <a href="#">StudyPoint</a>
    </div>
    <nav>
      <ul id="MenuItems">
          <a href="../src/java/AdminLogin.java"></a>
        <li><a href="homepage.jsp">Home</a></li>
        <li><a href="homepage.jsp">Products</a></li>
        <li><a href="about.jsp">About</a></li>
        <li><a href="contact.jsp">Contact</a></li>
        <li><a href="history.jsp">Your Cart</a></li>
        <li><a href="logout.jsp">Logout</a></li>
      </ul>
    </nav>
    <img src="https://i.ibb.co/6XbqwjD/menu.png" alt="" class="menu-icon" onclick="menutoggle()" />
  </div>
</div>

  <div class="row">
    <div class="col-4">
      <img src="c.png" alt="" />
      <h4>C LANGUAGE</h4>
      <p>₹399.00</p>
  <div><a onclick="showme()" href="">View Details</a></div>

      <a href="buy.jsp">Buy Now</a>
    </div>

    <div class="col-4">
      <img src="c++.jpg" alt="" />
      <h4>C++ LANGUAGE</h4>
      <p>₹399.00</p>
  <div><a onclick="showme1()" href="">View Details</a></div>

      <a href="buy.jsp">Buy Now</a>
    </div>

    <div class="col-4">
      <img src="javascript.jpg" alt="" />
      <h4>JAVASCRIPT</h4>
      <p>₹450.00</p>
       <div><a onclick="showme2()" href="">View Details</a></div>

      <a href="buy.jsp">Buy Now</a>
    </div>

    <div class="col-4">
      <img src="java.png" alt="" />
      <h4>JAVA</h4>
      <p>₹499.00</p>
  <div><a onclick="showme3()" href="">View Details</a></div>
      <a href="buy.jsp">Buy Now</a>

    </div>
  </div>

  <div class="row">
    <div class="col-4">
      <img src="python.jpg" alt="" />
      <h4>PYTHON</h4>
      <p>₹499.00</p>
  <div><a onclick="showme4()" href="">View Details</a></div>

      <a href="buy.jsp">Buy Now</a>
    
    </div>
    <div class="col-4">
      <img src="ml.png" alt="" />
      <h4>MACHINE LEARNING</h4>
      <p>₹599.00</p> 
  <div><a onclick="showme5()" href="">View Details</a></div>

      <a href="buy.jsp">Buy Now</a>
    
    </div>

    <div class="col-4">
      <img src="data.jpg" alt="" />
      <h4>DATA STRUCTURE AND ALGORITHM</h4>
      <p>₹400.00</p>
        <div><a onclick="showme6()" href="">View Details</a></div>

      <a href="buy.jsp">Buy Now</a>
    
    </div>

    <div class="col-4">
      <img src="html.jpg" alt="" />
      <h4>HTML & CSS</h4>
       <p>₹399.00</p>
  <div><a onclick="showme7()" href="">View Details</a></div>

      <a href="buy.jsp">Buy Now</a>
    </div>
  </div>

  <div class="row">
    <div class="col-4">
      <img src="mean.jpg" alt="" />
      <h4>MEAN STACK</h4>
      <p>₹699.00</p>
      
  <div><a onclick="showme8()" href="">View Details</a></div>
      <a href="buy.jsp">Buy Now</a>
    
    </div>
</div>

<!-- Footer -->
<div class="footer">
  <div class="container">
    <div class="row">
      <div class="footer-col-1">
        <h3>Download Our App</h3>
        <p>Download App for Android and iso mobile phone.</p>
        <div class="app-logo">
          <img src="https://i.ibb.co/KbPTYYQ/play-store.png" alt="" />
          <img src="https://i.ibb.co/hVM4X2p/app-store.png" alt="" />
        </div>
      </div>

      <div class="footer-col-2">
        <p>
                    Our Purpose Is To make education easy for everyone

        </p>
      </div>

      <div class="footer-col-3">
        <h3>Useful Links</h3>
        <ul>
          <li>Coupons</li>
          <li>Blog Post</li>
          <li>Return Policy</li>
          <li>Join Affiliate</li>
        </ul>
      </div>

      <div class="footer-col-4">
        <h3>Follow us</h3>
        <ul>
          <li>Facebook</li>
          <li>Twitter</li>
          <li>Instagram</li>
          <li>YouTube</li>
        </ul>
      </div>
    </div>
    <hr />
    <p class="copyright">Copyright &copy; 2021 - Study Point</p>
  </div>
</div>

<!-- js for toggle menu -->
<script>
  var MenuItems
          = document.getElementById('MenuItems');
  MenuItems.style.maxHeight = '0px';

  function menutoggle() {
    if (MenuItems.style.maxHeight == '0px') {
      MenuItems.style.maxHeight = '200px';
    } else {
      MenuItems.style.maxHeight = '0px';
    }
  }
function showme(){
  alert('C is a useful language for almost all computer programmers. Whether you need a beginner’s introduction to the language, \n\
or instruction on finer points of C’s capabilities, like socket programming, studypoint has a course for you.');
}

function showme1(){
  alert('Take online courses in C++ (C plus plus) \n\
programming to improve your skills. Find beginner to advanced C++ programming courses from Microsoft and other top institutions on studypoint!');
}


function showme2(){
  alert('studypoint instructors specialize in teaching the whole scope of JavaScript—beginner to advanced. Whether you’re \n\
interested in back-end development, or app and website building, studypoint has a JavaScript course for you.');
}
function showme3(){
  alert('In this course you’ll be exposed to fundamental programming concepts, including object-oriented programming (OOP) using Java. \n\
You’ll build 7 Java projects—like a basic calculator—to help you practice along the way.');
}
function showme4(){
  alert('Keen to learn Python from world-class industry experts? Enroll now to learn from the best. Become a globally recognized certified Python Developer. Enroll now to get exclusive deals. Instructor-led Classes. Expert Educators. Flexible Batch Timings. 24/7 Lifetime Support. \n\
No Cost EMI Option. Courses: DataScience Cert Training, Python Django Training, Big Data Hadoop Training.');
}
function showme5(){
 alert('This course provides a broad introduction to machine learning, datamining, and statistical pattern recognition. Topics include: (i) Supervised learning (parametric/non-parametric algorithms, support vector machines, kernels, neural networks). (ii) Unsupervised learning (clustering, dimensionality reduction, recommender systems, deep learning). (iii) Best practices in machine learning (bias/variance theory; innovation process in machine learning and AI). The course will also draw from numerous case studies and applications');
 }
function showme6(){
  alert('Course Description: This course is an 11-week workshop that will take you through all the common Data Structures like Arrays, Trees, Graphs, LinkedList, and many such concepts in a highly interactive manner. Every week you will be interacting with the top industry expert where you will learn how they implement DSA in real-life scenarios.');
}
function showme7(){
  alert('HTML is the foundation of all web pages. It defines the structure of a page, while CSS defines its style. HTML and CSS are the beginning of everything you need to know to make your first web page! Learn both and start creating amazing websites.');
}
function showme8(){
  alert('Learning how to design both the front and back end of web applications opens up twice as many job opportunities for developers. If you already know JavaScript, learning the MEAN Stack is easy. Udemy offers top-rated courses on every aspect of MEAN usage, from Angular, to Node.js, to Express, and MongoDB.');
}

</script>
    </body>
</html>
