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
 * Servlet implementation class View_All_Courses
 */
@WebServlet("/View_All_Courses")
public class View_All_Courses extends HttpServlet {
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
		
		try {
			con=DbConnection.getConnection();
            java.sql.Statement st=con.createStatement();
            String sql="Select * FROM course";
            rs=st.executeQuery(sql);
            out.println("<table cellspacing='0' width='350px' border='1' style='border-collapse: collapse; width: 100%; margin: 20px auto; border: 2px solid #333;'>");
            out.println("<tr style='background-color: #333; color: #fff; text-align: center;'>");
            out.println("<th style='padding: 10px;'>Course Name</th>");
            out.println("<th style='padding: 10px;'>Course ID</th>");
            out.println("<th style='padding: 10px;'>Edit</th>");
            out.println("<th style='padding: 10px;'>Delete</th>");
            out.println("</tr>");
            
            
            while (rs.next()) {
                out.println("<tr style='text-align: center;'>");
                out.println("<th style='padding: 10px;'>" + rs.getString("c_name") + "</th>");
                out.println("<th style='padding: 10px;'>" + rs.getString("c_id") + "</th>");


                out.println("<th style='padding: 10px;'><a href='EditCourset?c_id=" + rs.getString("c_id") + "' style='text-decoration: none; color: #0074D9;'>Edit</a></th>");
                out.println("<th style='padding: 10px;'><a href='DeleteCourse?c_id=" + rs.getString("c_name") + "' style='text-decoration: none; color: #FF4136;'>Delete</a></th>");

                out.println("</tr>");
            }

            out.println("</table>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//out.println("<font color='red'>Record is not Added </font>");
		}

	}

}
