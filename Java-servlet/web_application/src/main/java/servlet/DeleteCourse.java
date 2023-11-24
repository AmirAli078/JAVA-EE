package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DbConnection.DbConnection;

/**
 * Servlet implementation class DeleteCourse
 */
@WebServlet("/DeleteCourse")
public class DeleteCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement ps;
    ResultSet rs;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("ManuBar");
        dispatcher.include(request, response);
	    String name =request.getParameter("c_name");
	    
	    try {
			con=DbConnection.getConnection();
	
			ps = con.prepareStatement("delete from course where c_name=?");
			ps.setString(1, name);
		     ps.executeUpdate();
		 	out.println("<font color='green'>Record is Deleteded Successfully</font>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<font color='red'>Record is not deleteded </font>");
		}
	}

}
