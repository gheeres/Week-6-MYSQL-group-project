package dao;

import java.sql.Connection;

import entity.User;

public class UserDao {

	private Connection connection;

	public UserDao() {
		connection = DBConnection.getConnection();
	}
	
	public User get(int id) {
		return(null);
	}

	public User[] getAll() {
		return(new User[0]);
	}
}
