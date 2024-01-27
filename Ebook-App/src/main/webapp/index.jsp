<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.Connection" %>
<%@ page import="com.DBConnection.DbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBook System</title>
<%@include file="all_component/allCss.jsp"%>
<style type="text/css">
.back-img{
background: url("all_component/Img/back.jpg");
height: 45vh;
width: 100%;
background-repeat: no-repeat;
background-size: cover;
}
.back-img h3 {
             padding: 20px;
            text-align: center;
            font-family: 'Arial', sans-serif;
            color: #283593;
            font-size: 50px;
        }
  
.col-md-3:hover{
  background-color: #d5ded7;  
}     
</style>
</head>
<body  style="font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 20px;">
<%@include file="all_component/navbar.jsp"%>

<% Connection connection=DbConnection.getConnection();
out.println(connection);
%>

<div class="container-fluid back-img">
<h3><i class="fas fa-book"></i> E Book Management System</h3>
</div>

 <!-- RECENT BOOKS start -->
<div class="container-fluid">
    <h3 class="text-center">Recent Books</h3>
    <div class="row">

        <!-- Book 1 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/css1.jpg" width="200" height="300">
                <h3 style="color: #333;">Unlocking Web Development Magic</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Journey through HTML, CSS, and JavaScript</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Armstrong</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 2 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/dsa1.jpg" width="200" height="300">
                <h3 style="color: #333;">Unlocking Data Science & Algorithms</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to Data Structures and Algorithms</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Robet Sedgewick</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 3 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/java1.jpg" width="200" height="300">
                <h3 style="color: #333;">Mastering Java Programming</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to Java Development</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Java Maven</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 4 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/sql1.jpg" width="200" height="300">
              <h3 style="color: #333;">Mastering SQL Database</h3>
        <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to SQL Database Management</p>
        <strong style="font-weight: bold; color: #4285f4; margin-top: -10px; display: block;">By Cathy Tanimura</strong>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

    </div>
</div>
  <a href="#" class="btn btn-danger btn-sm mt-1" style="display: block; margin: 15px auto;">ALL Recent Books</a>
<!-- RECENT BOOKS Ends -->


<!-- Old BOOKS Starts -->
<div class="container-fluid">
    <h3 class="text-center"> New Books</h3>
    <div class="row">

        <!-- Book 1 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/css1.jpg" width="200" height="300">
                <h3 style="color: #333;">Unlocking Web Development Magic</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Journey through HTML, CSS, and JavaScript</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Armstrong</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 2 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/dsa1.jpg" width="200" height="300">
                <h3 style="color: #333;">Unlocking Data Science & Algorithms</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to Data Structures and Algorithms</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Robet Sedgewick</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 3 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/java1.jpg" width="200" height="300">
                <h3 style="color: #333;">Mastering Java Programming</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to Java Development</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Java Maven</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 4 -->
        <div class="col-md-3">
        <div class="crd-ho">
            <div class="card-body">
                <img alt="" src="all_component/books/sql1.jpg" width="200" height="300">
              <h3 style="color: #333;">Mastering SQL Database</h3>
        <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to SQL Database Management</p>
        <strong style="font-weight: bold; color: #4285f4; margin-top: -10px; display: block;">By Cathy Tanimura</strong>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

    </div>
</div>
  <a href="#" class="btn btn-danger btn-sm mt-1" style="display: block; margin: 15px auto;">ALL New Books</a>
  </div>
<!-- Old BOOKS Ends -->

<!-- RECENT BOOKS start -->
<div class="container-fluid">
    <h3 class="text-center">Old Books</h3>
    <div class="row">

        <!-- Book 1 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/css1.jpg" width="200" height="300">
                <h3 style="color: #333;">Unlocking Web Development Magic</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Journey through HTML, CSS, and JavaScript</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Armstrong</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 2 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/dsa1.jpg" width="200" height="300">
                <h3 style="color: #333;">Unlocking Data Science & Algorithms</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to Data Structures and Algorithms</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Robet Sedgewick</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 3 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/java1.jpg" width="200" height="300">
                <h3 style="color: #333;">Mastering Java Programming</h3>
                <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to Java Development</p>
                <p style="font-weight: bold; color: #4285f4; margin-top: -10px;">By Java Maven</p>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

        <!-- Book 4 -->
        <div class="col-md-3">
            <div class="card-body">
                <img alt="" src="all_component/books/sql1.jpg" width="200" height="300">
              <h3 style="color: #333;">Mastering SQL Database</h3>
        <p style="font-style: italic; color: #666; padding: 5px 10px;">A Comprehensive Guide to SQL Database Management</p>
        <strong style="font-weight: bold; color: #4285f4; margin-top: -10px; display: block;">By Cathy Tanimura</strong>
                <div class="row">
                    <a href="#" class="btn btn-danger btn-sm"><i class="fa fa-cart-plus" aria-hidden="true"></i> Add Cart</a>
                    <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                    <a href="#" class="btn btn-danger btn-sm ml-1"><i class="fa fa-usd" aria-hidden="true"></i> 80</a>
                </div>
            </div>
        </div>

    </div>
</div>
  <a href="#" class="btn btn-danger btn-sm mt-1" style="display: block; margin: 15px auto;">ALL Old Books</a>

<%@include file="all_component/footer.jsp"%>

</body>
</html>