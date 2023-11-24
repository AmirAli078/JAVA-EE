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
 * Servlet implementation class Add_department
 */
@WebServlet("/Add_department")
public class Add_department extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement ps;
       int row;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("ManuBar");
        dispatcher.include(request, response);
		
		int id=Integer.parseInt(request.getParameter("departmentID"));
		String name=request.getParameter("departmentName");
		try {
			con=DbConnection.getConnection();
			ps=con.prepareStatement("INSERT INTO department ( d_id,d_name) VALUES (?,?)");
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
