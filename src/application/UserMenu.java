package application;

import dao.UserDao;
import entity.User;

public class UserMenu {
  public static void showUsers() {
	  UserDao dao = new UserDao();

	  User[] users = dao.getAll();
	  for(User user: users) {
		  // Output users.
	  }
  }

  public static void updateUser() {
  }

  public static void createUser() {
  }

  public static void deleteUser() {
  }
}
