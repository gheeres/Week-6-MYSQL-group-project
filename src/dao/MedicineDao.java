package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicineDao {

	private Connection connection;
	private final String GET_MEDICINE_BY_MED_ID_QUERY = "Select name from medicine where id = ?";
	public MedicineDao() {
		connection = DBConnection.getConnection();
	}

	
	//this is used in regimen class
	public String getMedicineByMedId(int medId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_MEDICINE_BY_MED_ID_QUERY);
		ps.setInt(1, medId);
		ResultSet rs = ps.executeQuery();
		String medicine;
		
		
		return medicine;
	}

}
