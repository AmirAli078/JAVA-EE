<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: order all</title>
<%@include file="allCss.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<h3 class="text-center"> Hello,Admin </h3>

<table class="table table-striped">
  <thead class="bg-primary text-white" >
    <tr>
      <th scope="col">Order Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Address</th>
      <th scope="col">Phone No</th>
      <th scope="col">Book Name</th>
      <th scope="col">Auther</th>
      <th scope="col">Price</th>
      <th scope="col">Payment</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
         <td>Mark</td>
      <td>Otto</td>
      <td>Saqib</td>
            <td>300$</td>
      <td>COD</td>
      
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
         <td>Mark</td>
      <td>Otto</td>
      <td>peeral</td>
      <td>300$</td>
      <td>COD</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
         <td>Mark</td>
      <td>Otto</td>
      <td>Inam</td>
            <td>300$</td>
      <td>COD</td>
      
    </tr>
  </tbody>
</table>
<div style="margin-top: 300px">
<%@include file="footer.jsp"%>
</div>
</body>
</html>