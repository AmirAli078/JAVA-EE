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
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        RequestDispatcher dispatcher = request.getRequestDispatcher("ManuBar");
        dispatcher.include(request, response);
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        
        out.print("    <title>CRUD Website</title>");
        out.print("</head>");
        out.print("<body style='font-family: Arial, sans-serif; background-color: #f7f7f7; text-align: center;'>");

        // Header
        out.print("    <header style='background-color: #333; color: #fff; padding: 20px;'>");
        out.print("        <h1>Welcome to CRUD Website</h1>");
        out.print("    </header>");

        // Image
     // Assuming you have a PrintWriter object named out
        out.print("    <img src='banner.jpg' alt='Website Image' style='max-width: 50%; height: auto; margin: 20px; border: 2px solid #333; border-radius: 10px; box-shadow: 0 0 10px #999;'>");

        // Main Content
        out.print("    <main style='background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px #999;'>");
        out.print("        <h2>What would you like to do?</h2>");
        out.print("        <ul style='list-style: none; padding: 0;'>");
        out.print("            <li style='margin: 10px;'><a href='Student' style='text-decoration: none; background-color: #4CAF50; color: #fff; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;'>Student CRUD</a></li><br>");
        out.print("            <li style='margin: 10px;'><a href='Department' style='text-decoration: none; background-color: #0074D9; color: #fff; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;'>Department CRUD</a></li><br>");
        out.print("            <li style='margin: 10px;'><a href='Course' style='text-decoration: none; background-color: #FF851B; color: #fff; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;'>Course CRUD</a></li><br>");
        out.print("            <li style='margin: 10px;'><a href='Login' style='text-decoration: none; background-color: #FF4136; color: #fff; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;'>LogOut</a></li>");
        out.print("        </ul>");
        out.print("    </main>");

        // Footer
        out.print("    <footer style='background-color: #333; color: #fff; padding: 10px;'>");
        out.print("        &copy; 2023 CRUD Website");
        out.print("    </footer>");
        out.print("</body>");
        out.print("</html>");

        
	}

}
