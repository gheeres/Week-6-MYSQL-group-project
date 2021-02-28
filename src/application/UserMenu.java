package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.UserDao;
import entity.User;

public class UserMenu {
	
	private static Scanner scanner = new  Scanner(System.in);
	
	public void showUsers () throws SQLException {
		List <User> users = UserDao.getUser();
		for (User user :users ) {
			System.out.println(user.getUserId() + ": "+ user.getUserName());
		}
	}
	  
	  UserDao dao = new UserDao(); 
		 
  

  public static void updateUser() {
  }

  public static void createUser() {
	  
  }

  public static void deleteUser() {
  }
  
  
}

