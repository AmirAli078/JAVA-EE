package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pr =response.getWriter();
		pr.write("<h1>Successfully Login</h1>");
		 String name=	request.getParameter("username");
	       String password=	request.getParameter("password");
	       String gmail=request.getParameter("gmail");
	       
	      // pr.write("User Name: "+name);
	       //pr.write("<br></br>");
	       //pr.write("password: "+password);
	     //  pr.write("<body style='background-image: url(\"https://unsplash.com/photos/jLwVAUtLOAQ\");");
	       
	       pr.write("<!DOCTYPE html>");
	       pr.write("<html>");
	       pr.write("<head>");
	       pr.write("<title>User Login Table</title>");
	       pr.write("</head>");
	       pr.write("<body style='text-align: center; background-color: #f2f2f2;'>");
	       pr.write("<h2>User Login Table</h2>");
	       pr.write("<table border='1' style='margin: 0 auto; width: 80%; border-collapse: collapse;'>");
	       pr.write("<tr>");
	       pr.write("<th style='background-color: #4CAF50; color: white; padding: 10px;'>Username</th>");
	       pr.write("<th style='background-color: #4CAF50; color: white; padding: 10px;'>Gmail</th>");
	       pr.write("<th style='background-color: #4CAF50; color: white; padding: 10px;'>Password</th>");
	       pr.write("</tr>");
	       pr.write("<tr>");
	       pr.write("<td style='padding: 10px;'>" + name + "</td>");
	       pr.write("<td style='padding: 10px;'>" + gmail + "</td>");
	       pr.write("<td style='padding: 10px;'>" + password + "</td>");
	       pr.write("</table>");
	       pr.write("</body>");
	       pr.write("</html>");
	    }
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
