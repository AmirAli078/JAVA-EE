package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.User;

public class userDaoImpli implements userDao {

	
	   private Connection  connection;
	public userDaoImpli(Connection connection) {
		super();
		this.connection = connection;
	}
	public boolean userrigister(User us) {
	
		try {
			
			String sql="insert into users(name,email,phno,password) values (?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setInt(3, (int) us.getNum());
			ps.setString(4, us.getPass());
			

			
			
		int i=	ps.executeUpdate();
			if(i==1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	public User login(String email, String password) {
		User us=null;
		try {
			String sql="select * from users where email=? and password=?";
			PreparedStatement ps=connection.prepareStatement(sql);
		   ps.setString(1, email);
		   ps.setString(2, password);
			 
		   ResultSet rs=ps.executeQuery();
		   
		   while(rs.next()) {
			   us=new User();
			   us.setName(rs.getString(2));
			   us.setEmail(rs.getString(3));
			   us.setPass(rs.getString(4));
			   us.setNum(rs.getLong(5));
		   }
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return us;
	
	}

}
