package dao;

import java.sql.Connection;

public class RegimenDao {

	private Connection connection;

	public RegimenDao() {
		connection = DBConnection.getConnection();
	}

}
