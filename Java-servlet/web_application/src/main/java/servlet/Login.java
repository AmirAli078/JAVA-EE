package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		  out.print("<!DOCTYPE html>");
          out.print("<html>");
          out.print("<head>");
          out.print("<title>Login Form</title>");
          out.print("</head>");
          out.print("<body style='font-family: Arial, sans-serif; text-align: center; background-color: #f7f7f7;'>");
          out.print("<h1 style='color: #333;'>Login First</h1>");
          out.print("<form action='LoginServlet' method='post' style='background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 10px #999; width: 300px; margin: 0 auto;'>");
          out.print("<label for='full_name' style='font-weight: bold; font-size: 18px;'>Full Name:</label>");
          out.print("<input type='text' id='full_name' name='full_name' required style='width: 100%; padding: 10px; margin-bottom: 10px; border: 1px solid #ccc; border-radius: 5px;'>");
          out.print("<label for='email' style='font-weight: bold; font-size: 18px;'>Email:</label>");
          out.print("<input type='email' id='email' name='email' required style='width: 100%; padding: 10px; margin-bottom: 10px; border: 1px solid #ccc; border-radius: 5px;'>");
          out.print("<label for='password' style='font-weight: bold; font-size: 18px;'>Password:</label>");
          out.print("<input type='password' id='password' name='password' required style='width: 100%; padding: 10px; margin-bottom: 10px; border: 1px solid #ccc; border-radius: 5px;'>");
          out.print("<input type='submit' value='Login' style='background-color: #4CAF50; color: #fff; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;'>");
          out.print("</form>");
         // out.print("<a href='View_All' style='display: block; margin-top: 20px; text-decoration: none; color: #4CAF50; font-weight: bold; font-size: 16px;'>View All</a>");
          out.print("</body>");
          out.print("</html>");
	}



}
