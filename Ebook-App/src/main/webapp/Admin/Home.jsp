<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: Home</title>
<%@include file="allCss.jsp"%>

<style type="text/css">

a{
text-decoration: none;
color: black;
}

a:hover {
text-decoration: none;
color: black;
}

</style>
</head>
<body>
<%@include file="navbar.jsp"%>
	<div class="container p-5">
<div class="row p-5">
<div class="col-md-3 ">
<a href="add_books.jsp">
   <div class="card">
  <div class="card-body text-center">

<i class="fa-solid fa-plus fa-3x text-primary"></i><br>
<h4>Add Books</h4>
-------------
   </div>
   </div>
</a>
</div>

<div class="col-md-3 ">
<a href="all_books.jsp">
<div class="card">
<div class="card-body text-center">
<i class="fa-solid fa-book-open fa-3x text-danger"></i><br>
<h4>All Books</h4>
-------------

</div>
</div>
</a>
</div>


<div class="col-md-3 ">
<a href="order_books.jsp">
<div class="card">
<div class="card-body text-center">
<i class="fa-solid fa-box-open fa-3x text-warning"></i><br>
<h4>Order Books</h4>
-------------
</div>
</div>
</a>
</div>


<div class="col-md-3 ">
<a href="#">
<div class="card">
<div class="card-body text-center">
<i class="fa-solid fa-right-from-bracket fa-3x text-primary"></i><br>
<h4>Logout</h4>
-------------
</div>
</div>
</a>
</div>
</div>
</div>

<div style="margin-top: 130px">
<%@include file="footer.jsp"%>
</div>
</body>
</html>