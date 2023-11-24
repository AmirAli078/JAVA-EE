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
 * Servlet implementation class EditCourset
 */
@WebServlet("/EditCourset")
public class EditCourset extends HttpServlet {
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
	    String id =request.getParameter("c_id");
		
		try {
			con=DbConnection.getConnection();
           
            	ps=con.prepareStatement("select c_id, c_name  FROM course WHERE c_id=?");
            	ps.setString(1, id);
            	rs=ps.executeQuery();
            	
            	while(rs.next()) {
            		out.print("<form action='EditCourseServlet' method='post' style='margin: 20px; text-align: center;'>");

            		out.print("<table border='1' style='border-collapse: collapse; width: 50%; margin: 0 auto;'>");
            		out.println("<tr><th style='padding: 10px;'>DEPT ID:</th><td><input type='text' id='age' name='age' value='" + rs.getString("c_id") + "' style='width: 100%; padding: 5px; border: 1px solid #ccc; border-radius: 5px;'></td></tr>");
            		out.println("<tr><th style='padding: 10px;'>Name:</th><td><input type='text' id='name' name='name' value='" + rs.getString("c_name") + "' style='width: 100%; padding: 5px; border: 1px solid #ccc; border-radius: 5px;'></td></tr>");
            		out.println("<tr><td colspan='2' style='text-align: center;'><input type='submit' value='Edit' style='background-color: #0074D9; color: #fff; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;'></td></tr>");
            		out.print("</table>");
            		out.print("</form>");

            	}
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//out.println("<font color='red'>Record is not Added </font>");
		}
		
	}
}
