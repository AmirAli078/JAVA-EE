package Dao;

import entity.User;

public interface userDao{
	
  public boolean userrigister(User us);
  
  public User login(String email, String password);
}
