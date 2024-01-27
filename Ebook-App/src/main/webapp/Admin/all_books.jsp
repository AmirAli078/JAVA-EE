<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    
    
    <%@ page import="Dao.BookDaoImpli" %>
<%@ page import="com.DBConnection.DbConnection" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.BookDtls" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: all</title>
<%@include file="allCss.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<h3 class="text-center"> Hello,Admin </h3>



<c:if test="${not empty successmsq }">
<p class="text-center text-success"> ${ successmsq}</P>
<c:remove var="successmsq" scope="session"/>
</c:if>

<c:if test="${not empty failmsg }">
<p class="text-center text-danger"> ${ failmsg}</P>
<c:remove var="failmsg" scope="session"/>
</c:if>

<table class="table table-striped">
  <thead class="bg-primary text-white" >
    <tr>
    <th scope="col">Id</th>
      <th scope="col">Image</th>
      <th scope="col">Book Name</th>
      <th scope="col">Auther</th>
      <th scope="col">price</th>
      <th scope="col">Categories</th>
      <th scope="col">Status</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
<%
  BookDaoImpli dao = new BookDaoImpli(DbConnection.getConnection());
  List<BookDtls> list = dao.getAllBooks();
  for (BookDtls b : list) {
%>
  <tr>
    <th><%= b.getBookId() %></th>
    <td>
      <img alt="img" src="../all_component/books/<%= b.getPhotoName() %>" style="width:50px; height:50px">
    </td>
    <td><%=b.getBookName() %></td>
    <td><%= b.getAuther() %></td>
    <td><%= b.getPrice() %></td>
    <td><%= b.getBookCategory() %></td>
    <td><%= b.getStatus() %></td>
    <td>
     <a href="edit_book.jsp?id=<%= b.getBookId() %>" class="btn btn-sm btn-primary">Edit</a>
      <a href="../com.admin.servlet/delete?id=<%= b.getBookId() %>" class="btn btn-sm btn-danger">Delete</a>
    </td>
  </tr>
<%
  }
%>

    
  </tbody>
</table>
<div style="margin-top: 280px">
<%@include file="footer.jsp"%>
</div>
</body>
</html>