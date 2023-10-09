package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pr =response.getWriter();
		pr.write("<h1 style='text-align: center;'>WEB Application Demo</h1>");
		pr.write("<html>");
		pr.write("<head>");
		pr.write("<title>Login</title>");
		pr.write("</head>");
		pr.write("<body style='text-align: center; background-color: #f2f2f2;'>");
		pr.write("<h2>Login Form</h2>");
		pr.write("<form action='loginServlet' method='post'>");
		pr.write("<label for='username'>Username:</label>");
		pr.write("<input type='text' id='username' name='username' required style='padding: 5px;'><br><br>");
		pr.write("<label for='Gmail'>Gmail:</label>");
		pr.write("<input type='text' id='account' name='gmail' required style='padding: 5px;'><br><br>");
		pr.write("<label for='password'>Password:</label>");
		pr.write("<input type='password' id='password' name='password' required style='padding: 5px;'><br><br>");
		pr.write("<input type='submit' value='Login' style='background-color: #4CAF50; color: white; padding: 10px 20px; border: none; cursor: pointer;'>");
		pr.write("</form>");
		pr.write("</body>");
		pr.write("</html>");
		
    }

    protected void doPost1(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle form submission and login logic here
    }	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
