package dao;

import java.sql.Connection;

public class UserDao {

	private Connection connection;

	public UserDao() {
		connection = DBConnection.getConnection();
	}

}
