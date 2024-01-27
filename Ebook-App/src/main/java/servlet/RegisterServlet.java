package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBConnection.DbConnection;

import Dao.userDaoImpli;
import entity.User;
 
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 try {
		 String name =req.getParameter("fname");
		 String email =req.getParameter("email");
		 String password =req.getParameter("password");
		 String phno =req.getParameter("phno");
		 String check =req.getParameter("check");
		 
		// System.out.println(name+" "+email+" "+password+" "+phno+" "+check);
		 User us=new User();
		 us.setName(name);
		 us.setEmail(email);
		 us.setPass(password);
		 us.setNum(0);
		 
		 HttpSession session=req.getSession();
		 userDaoImpli dao=new userDaoImpli(DbConnection.getConnection());
		 
		 boolean f=dao.userrigister(us);
		 if(f) {
			// System.out.println("Data inserted successfully ");
			 session.setAttribute("successmessage", "Account Registered Successfully!");
			 resp.sendRedirect("register.jsp");
		 }
		 else {
			 session.setAttribute("failedmessage", "Something went wrong on server!");
			 resp.sendRedirect("register.jsp");
			// System.out.println("Some thing went Wrong!");
		 }
	 } catch (Exception e) {
		 e.printStackTrace();
	 }
	}
	

}
