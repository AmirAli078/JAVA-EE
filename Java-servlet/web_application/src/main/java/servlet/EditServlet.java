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
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement ps;
    ResultSet rs;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("ManuBar");
        dispatcher.include(request, response);
	//    String name =request.getParameter("st_name");
		
		try {
			con=DbConnection.getConnection();
			String name=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age"));
			String email=request.getParameter("email");
			int dept=Integer.parseInt(request.getParameter("dept"));
			String rollno=request.getParameter("rollno");
			ps = con.prepareStatement("UPDATE students SET  st_age=?, st_email=?, d_id=?, roll_no=? WHERE st_name=?");
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, email);
			ps.setInt(4, dept);
			ps.setString(5, rollno);
		     ps.executeUpdate();
		 	out.println("<font color='green'>Record Updated Successfully</font>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<font color='red'>Record is not Updated </font>");
		}
	}

}
