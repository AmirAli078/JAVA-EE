<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    <%@ page import="java.io.File" %>
    <%@ page import="Dao.BookDaoImpli" %>
<%@ page import="com.DBConnection.DbConnection" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.BookDtls" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: Add Books</title>
<%@include file="allCss.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>


<%= new File("./exec_produce_dropdown_list").getPath() %>
<%
  String contextPath = request.getContextPath();
  // Use the contextPath as needed
%>




<div class="container p-5">
<div class="row">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-body" style="background-color:  #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); ">
<h4 class="text-center" style="font-weight: bold; color: blue;">Edit Book</h4>



<%
int id=Integer.parseInt(request.getParameter("id"));
BookDaoImpli dao=new BookDaoImpli(DbConnection.getConnection());
     BookDtls b=dao.getBookById(id);

%>



<form action="${pageContext.request.contextPath}/editbooks" method="post" enctype="multipart/form-data" style="max-width: 400px; margin: 0 auto; padding: 20px; background-color: #f9f9f9; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
    <input type="hidden" id="id" name="id" value="<%=b.getBookId()%>">
  <div style="margin-bottom: 15px;">
    <label for="name" style="font-weight: bold; color: #333;">Book Name</label>
    <input type="text" class="form-control" id="bname" aria-describedby="bname" value="<%=b.getBookName() %>" required="required" name="bname" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
    <div style="margin-bottom: 15px;">
    <label for="name" style="font-weight: bold; color: #333;">Auther Name</label>
    <input type="text" class="form-control" id="auther" value="<%=b.getAuther() %>"  aria-describedby="auther" required="required" name="auther" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
      <div style="margin-bottom: 15px;">
    <label for="name" style="font-weight: bold; color: #333;">Price</label>
    <input type="number" class="form-control"  value="<%= b.getPrice() %>" id="price" aria-describedby="price" required="required" name="price" style="border: 1px solid #ddd; border-radius: 4px; padding: 8px; width: 100%;">
  </div>
  
    <div style="margin-bottom: 15px;">
    <label for="exampleInputEmail1" style="font-weight: bold; color: #333;">Book Categories</label>
    <select id="inputstate" name="category" class="form-control" >
     
     <% if("Active".equals(b.getStatus())){%>
    	 <option value="Inactive">Inactive</option>
    	 <option value="Active">Active</option>
    	 <%  
     }else {
    	 %>
    	 <option value="Active">Active</option>
    	 <option value="Inactive">Inactive</option>
    	 <% 
     }
     %>

    </select>
  </div>
  
 
  
  <button type="submit" class="btn btn-primary" style="background-color: #007bff; border: none; border-radius: 4px; padding: 10px; color: #fff; cursor: pointer; width: 100%;">Edit</button>
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