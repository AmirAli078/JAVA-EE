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
 * Servlet implementation class Add_student
 */
@WebServlet("/Add_student")
public class Add_student extends HttpServlet {
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
		
		String name=request.getParameter("name");
		String rollno=request.getParameter("rollno");
		int age=Integer.parseInt(request.getParameter("age"));
		int dept=Integer.parseInt(request.getParameter("dept"));
		String email=request.getParameter("email");
		
		try {
			con=DbConnection.getConnection();
			ps=con.prepareStatement("INSERT INTO students (st_name,st_age,st_email,d_id,roll_no) VALUES (?,?,?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, email);
			ps.setInt(4, dept);
			ps.setString(5, rollno);
		 row =ps.executeUpdate();
			
			out.println("<font color='green'>Record Added Successfully</font>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<font color='red'>Record is not Added </font>");
		}
	
	}

}
