package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Medicine;
import entity.Regimen;

public class RegimenDao {

	private Connection connection;
	private MedicineDao medicineDao;
	private final String GET_REGIMEN_QUERY = "Select * from regimine where userId = ?";

	public RegimenDao() {
		connection = DBConnection.getConnection();
	}
	
	public List<Medicine> getUserRegimine() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_REGIMEN_QUERY).executeQuery();
		List<Medicine> medicines = new ArrayList<Medicine>();
		
		while (rs.next()) {
			//medicines.add(populateRegimen(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4)));
		}
		
		return medicines;
	}
/*
 * 
 * This is garbage, I am still working on it.
	private Regimen populateRegimen(int id, int medId, int userId, String dosage) {
		
		return new Regimen(id, medicineDao.getMedicineByMedId(), dosage);
		
	}
*/
}
