package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DBConnection;
import entity.Medicine;

public class medicineDao {
	
	private Connection connection;
	private final String GET_MEDICINE_QUERY = "SELECT * FROM medicine";
	
	public medicineDao() {
		connection =DBConnection.getConnection();
	}
	public ArrayList<Medicine> getMedicine() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_MEDICINE_QUERY).executeQuery();
		ArrayList<Medicine> medicine = new ArrayList<Medicine>();
		
		while (rs.next()) {
			medicine.add(populateMedicine(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		return medicine;
		}
		public Medicine populateMedicine(int id, String name, String usage) {
		return new Medicine(id, name, usage);
		
	}
}
