package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Department
 */
@WebServlet("/Department")
public class Department extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ManuBar");
	        dispatcher.include(request, response);
	     //   response.sendRedirect("ManuBar");


	        
	        out.println("<!DOCTYPE html>");
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Department Form</title>");
	        out.println("</head>");
	        out.println("<body style='font-family: Arial, sans-serif; text-align: center; background-color: #f7f7f7;'>");
	        out.println("<h1 style='color: #333;'>Department Form</h1>");
	        out.println("<form action='Add_department' method='post' style='background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 10px #999;'>");
	        out.println("<label for='departmentName' style='font-weight: bold; font-size: 18px;'>Department Name:</label>");
	        out.println("<input type='text' id='departmentName' name='departmentName' required style='width: 100%; padding: 10px; margin-bottom: 10px; border: 1px solid #ccc; border-radius: 5px;'>");

	        out.println("<label for='departmentID' style='font-weight: bold; font-size: 18px;'>Department ID:</label>");
	        out.println("<input type='text' id='departmentID' name='departmentID' required style='width: 100%; padding: 10px; margin-bottom: 10px; border: 1px solid #ccc; border-radius: 5px;'>");

	        out.println("<input type='submit' value='Submit' style='background-color: #4CAF50; color: #fff; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;'>");
	        out.println("</form>");
	        out.println("<a href=\"View_All_Departments\" style='display: block; margin-top: 20px; text-decoration: none; color: #4CAF50; font-weight: bold; font-size: 16px;'>View All</a>");
	        out.println("</body>");
	        out.println("</html>");
	}
}
