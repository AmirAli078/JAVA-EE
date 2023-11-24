package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DbConnection.DbConnection;

/**
 * Servlet implementation class Add_course
 */
@WebServlet("/Add_course")
public class Add_course extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement ps;
       int row;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   //	doGet(request, response);
   		
   		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("ManuBar");
        dispatcher.include(request, response);
		
		int id=Integer.parseInt(request.getParameter("courseID"));
		String name=request.getParameter("courseName");
		try {
			con=DbConnection.getConnection();
			ps=con.prepareStatement("INSERT INTO course ( c_id,c_name) VALUES (?,?)");
			ps.setString(2, name);
			ps.setInt(1, id);
   	    	 row =ps.executeUpdate();
			
			out.println("<font color='green'>Record Added Successfully</font>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<font color='red'>Record is not Added </font>");
		}
	}

}
