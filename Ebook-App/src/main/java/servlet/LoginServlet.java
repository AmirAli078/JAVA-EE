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


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			userDaoImpli dao=new userDaoImpli(DbConnection.getConnection());
			
			HttpSession session =req.getSession();
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			//System.out.println(email+" "+password);
			
			if("admin@gmail.com".equals(email) && "admin".equals(password)) {
				User us=new User();
				session.setAttribute("serobj", us);
				resp.sendRedirect("Admin/Home.jsp");
			}else {
				User us=dao.login(email, password);
				if(us!=null) {
					session.setAttribute("userobj", us);
					resp.sendRedirect("Home.jsp");
				}else {
					session.setAttribute("failedMsg", "email Or password is incorrect");
					resp.sendRedirect("login.jsp");
				}
				
				resp.sendRedirect("Home.jsp");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
