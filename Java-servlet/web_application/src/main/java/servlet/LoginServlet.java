package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DbConnection.DbConnection;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement ps;
    ResultSet rs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name =request.getParameter("full_name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
			con=DbConnection.getConnection();
			ps=con.prepareStatement("SELECT * FROM signup WHERE FullName=? AND eamil=? AND password=?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
		rs=	ps.executeQuery();
		  if(rs.next()) {
			  response.sendRedirect("HomeServlet");
		  }
		  else {
			  out.println("<font color='red'>User name or password is wrong</font>");

		  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
