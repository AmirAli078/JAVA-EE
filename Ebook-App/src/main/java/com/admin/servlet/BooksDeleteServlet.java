package com.admin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBConnection.DbConnection;

import Dao.BookDaoImpli;

@WebServlet("/delete")
public abstract class BooksDeleteServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			int id= Integer.parseInt(req.getParameter("id"));
			BookDaoImpli dao=new BookDaoImpli(DbConnection.getConnection());
			boolean f=dao.deletBooks(id);
			
			 HttpSession session = req.getSession();

	            if (f) {
	                session.setAttribute("successmsg", "Book is Deleted Successfully!");
	               // resp.sendRedirect("../all_books.jsp");
	          	  RequestDispatcher dp =  req.getRequestDispatcher("Admin/all_books.jsp");
		    	  dp.forward(req, resp);
	            } else {
	                session.setAttribute("failmsg", "Something went wrong on the server");
	          	  RequestDispatcher dp =  req.getRequestDispatcher("Admin/all_books.jsp");
		    	  dp.forward(req, resp);
	               // resp.sendRedirect("../all_books.jsp");
	            }

			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
