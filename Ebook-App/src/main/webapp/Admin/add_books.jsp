<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: Add Books</title>
<%@include file="allCss.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="container p-5">
<div class="row">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-body" style="background-color:  #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); ">
<h4 class="text-center" style="font-weight: bold; color: blue;">Add Book</h4>

<c:if test="${not empty successmsq }">
<p class="text-center text-success"> ${ successmsq}</P>
<c:remove var="successmsq" scope="session"/>
</c:if>

<c:if test="${not empty failmsg }">
<p class="text-center text-danger"> ${ failmsg}</P>
<c:remove var="failmsg" scope="session"/>
</c:if>



<form action="${pageContext.request.contextPath}/add_books" method="post" enctype="multipart/form-data" style="max-width: 400px; margin: 0 auto; padding: 20px; background-color: #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">

  <div style="margin-bottom: 15px;">
    <label for="name" style="font-weight: bold; color: #333;">Book Name</label>
    <input type="text" class="form-control" id="bname" aria-describedby="bname" required="required" name="bname" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
    <div style="margin-bottom: 15px;">
    <label for="name" style="font-weight: bold; color: #333;">Auther Name</label>
    <input type="text" class="form-control" id="auther" aria-describedby="auther" required="required" name="auther" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
      <div style="margin-bottom: 15px;">
    <label for="name" style="font-weight: bold; color: #333;">Price</label>
    <input type="number" class="form-control" id="price" aria-describedby="price" required="required" name="price" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
    <div style="margin-bottom: 15px;">
    <label for="exampleInputEmail1" style="font-weight: bold; color: #333;">Book Categories</label>
    <select id="inputstate" name="category" class="form-control" >
   <option selected>--select--</option>
   <option value="Active">Active</option>
   <option value="Inactive">Inactive</option> 
    </select>
  </div>
  
  <div style="margin-bottom: 15px;">
    <label for="exampleInputEmail1" style="font-weight: bold; color: #333;">Book Status</label>
    <select id="inputstate" name="status" class="form-control" >
   <option selected>--select--</option>
   <option value="New">New Book</option> 
    </select>
  </div>
  
  <div class="form-group" style="margin-bottom: 15px;">
    <label for="exampleFormControlFile1" style="font-weight: bold; color: #333;">Upload Photo</label>
    <input type="file" class="form-control" id="bimg" aria-describedby="price" required="required" name="bimg" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
      </div>
  
 
  
  <button type="submit" class="btn btn-primary" style="background-color: #007bff; border: none; border-radius: 4px; padding: 10px; color: #fff; cursor: pointer; width: 100%;">ADD</button>
</form>


</div>

</div>

</div>

</div>
</div>

<div>
<%@include file="footer.jsp"%>
</div>

</body>
</html>