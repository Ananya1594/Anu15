<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img;
  .carousel-inner > .item > a > img {
   width=70%;
   margin=auto;
   }
  </style>
</head>
<body>
<%@ include file="header.jsp" %>
<br><br>


<center>
<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
 <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
    <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>
    </div>
    </div>
    
    
    <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="resources/jersey.jpg" alt="jersey" width="250" height="300">
    </div>

    <div class="item">
      <img src="resources/bat.jpg" alt="bat" width="250" height="300">
     </div>

    <div class="item">
      <img src="resources/ball.jpg" alt="ball" width="250" height="300">
      </div>
      
      <div class="item">
      <img src="resources/shoes.jpg" alt="shoes" width="250" height="300">
      </div>
      
      <div class="item">
      <img src="resources/goggles.jpg" alt="goggles" width="250" height="300">
      </div>
    </div>
    </center>
    
    <div>  
<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
  </div>
  <br><br>
  
  
  <%@ include file="footer.jsp" %>
</body>
</html>