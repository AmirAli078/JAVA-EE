package com.admin.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DBConnection.DbConnection;

import Dao.BookDaoImpli;
import entity.BookDtls;


@MultipartConfig
@WebServlet("/add_books")
public class BooksAddServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String bookName=req.getParameter("bname");
			String auther=req.getParameter("auther");
			String price=req.getParameter("price");
			String categories=req.getParameter("category");
			String status=req.getParameter("status");
			Part part=req.getPart("bimg");
			String fileName=part.getSubmittedFileName();
			//System.out.println(bookName+" "+auther+" "+price+" "+categories+" "+status+" "+fileName);
			//BookDtls b=new BookDtls(bookName, auther, price, categories, status, fileName, "admin");
			//System.out.print(b);
			
			        BookDtls b = new BookDtls(bookName, auther, price, categories, status, fileName, "admin");
			        BookDaoImpli dao=new BookDaoImpli(DbConnection.getConnection());
			      boolean f=  dao.addBook(b);
			      HttpSession session =req.getSession();
			      if(f) {
					     String path=  getServletContext().getRealPath("")+"all_component\\books";
					        System.out.println(path);
					        File file=new File(path);
					        part.write(path + File.separator+ fileName);
			    	  session.setAttribute("successmsq", "Book is added Successfully!");
			    	 RequestDispatcher dp =  req.getRequestDispatcher("Admin/add_books.jsp");
			    	  dp.forward(req, resp);
			    //	  resp.sendRedirect("add_books.jsp");
			      }else {
			    	  session.setAttribute("failmsg", "Some thing went Wrong on Server");
//			    	  resp.sendRedirect("add_books.jsp");
			    	  RequestDispatcher dp =  req.getRequestDispatcher("Admin/add_books.jsp");
			    	  dp.forward(req, resp);
			     }

			        
			        
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
