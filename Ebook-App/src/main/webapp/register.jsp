<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBook Register</title>
<%@include file="all_component/allCss.jsp"%>


</head>
<body>
<%@include file="all_component/navbar.jsp"%>


<div class="container p-5">
<div class="row">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-body" style="background-color:  #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); ">
<h4 class="text-center" style="font-weight: bold; color: blue;">Registeration Form</h4>


<c:if test="${not empty successmessage}">
    <p class="text-center text-success">${successmessage}</p>
    <c:remove var="successmessage" scope="session"/>
</c:if>



<c:if test="${not empty failedmessage }">
<p class="text-center text-danger"> ${failedmessage }</P>
<c:remove var="failedmessage" scope="session"/>
</c:if>



<form action="register" method="post" style="max-width: 400px; margin: 0 auto; padding: 20px; background-color: #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">

  <div style="margin-bottom: 15px;">
    <label for="name" style="font-weight: bold; color: #333;">Full Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" required="required" name="fname" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
  <div style="margin-bottom: 15px;">
    <label for="exampleInputEmail1" style="font-weight: bold; color: #333;">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="email" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
  <div style="margin-bottom: 15px;">
    <label for="exampleInputPassword1" style="font-weight: bold; color: #333;">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1"  required="required" name="password" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
  <div style="margin-bottom: 15px;">
    <label for="pnumber" style="font-weight: bold; color: #333;">Phone Number</label>
    <input type="number" class="form-control" id="pnumber" aria-describedby="pnumber" name="phno" required="required" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
  <div class="form-check" style="margin-bottom: 15px;">
    <small id="emailHelp" class="form-text text-muted">I agree to the terms and conditions</small>
    <input type="checkbox" class="form-check-input"  name="check" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1" style="color: #333;">Check me out</label>
  </div>
  
  <button type="submit" class="btn btn-primary" style="background-color: #007bff; border: none; border-radius: 4px; padding: 10px; color: #fff; cursor: pointer; width: 100%;">Submit</button>
</form>


</div>

</div>

</div>

</div>
</div>
<%@include file="all_component/footer.jsp"%>
</body>
</html>