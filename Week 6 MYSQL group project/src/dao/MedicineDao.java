package dao;

import java.sql.Connection;

public class MedicineDao {

	private Connection connection;

	public MedicineDao() {
		connection = DBConnection.getConnection();
	}

}
