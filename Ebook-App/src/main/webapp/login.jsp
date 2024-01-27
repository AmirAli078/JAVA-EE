<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBook: Login</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body>
<%@include file="all_component/navbar.jsp"%>

<div class="container p-5">
<div class="row">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-body" style="background-color:  #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); ">
<h4 class="text-center" style="font-weight: bold; color: green;">Login</h4>

<c:if test="${not empty failedMsg}">
    <h5 class="text-center text-danger">${failedMsg}</h5>
    <c:remove var="failedMsg" scope="session"/>
</c:if>



<form action="login" method="post" style="max-width: 400px; margin: 0 auto; padding: 20px; background-color: #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">

  <div style="margin-bottom: 15px;">
    <label for="exampleInputEmail1" style="font-weight: bold; color: #333;">Email address</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter Your Email" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
  <div style="margin-bottom: 15px;">
    <label for="exampleInputPassword1" style="font-weight: bold; color: #333;">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Enter Your Password" required="required" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
  <div class="text-center">
  <button type="submit" class="btn btn-primary" style="background-color: #007bff; border: none; border-radius: 4px; padding: 10px; color: #fff; cursor: pointer; width: 100%;">Login</button>
  <a href="register.jsp"> Create Account </a>
  </div>
</form>


</div>

</div>

</div>

</div>
</div>
<%@include file="all_component/footer.jsp"%>

</body>
</html>