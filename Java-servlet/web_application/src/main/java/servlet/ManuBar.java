package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManuBar
 */
@WebServlet("/ManuBar")
public class ManuBar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("    <title>Student Management System</title>");
		out.print("    <style>");
		//out.print("        /* Style for the navigation bar */");
		out.print("        .navbar {");
		out.print("            background-color: #333;");
		out.print("            overflow: hidden;");
		out.print("        }");
		out.print("");
		//out.print("        /* Style for the navigation bar links */");
		out.print("        .navbar a {");
		out.print("            float: left;");
		out.print("            display: block;");
		out.print("            color: #fff;");
		out.print("            text-align: center;");
		out.print("            padding: 25px 30px;");
		out.print("            text-decoration: none;");
		out.print("        }");
		out.print("");
		//out.print("        /* Style for the navigation bar links on hover */");
		out.print("        .navbar a:hover {");
		out.print("            background-color: #ddd;");
		out.print("            color: #333;");
		out.print("        }");
		out.print("    </style>");
		out.print("</head>");
		out.print("<body>");
		//out.print("    <!-- Navigation bar with tabs -->");
		out.print("    <div class=\"navbar\">");
		out.print("        <a href=\"HomeServlet\">Student Management System</a>");
		out.print("        <a href=\"Student\">Student</a>");
		out.print("        <a href=\"Department\">Department</a>");
		out.print("        <a href=\"Course\">Course</a>");
		out.print("        <a href=\"Login\">Logout</a>");
		out.print("    </div>");
		out.print("");
		//out.print("    <!-- Your content goes here -->");
		out.print("</body>");
		out.print("</html>");

	}

}
