package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Regimen;


public class RegimenDao {

	private Connection connection;
	//private final String GET_USER_REGIMEN_QUERY = "Select * from regimen where userid = ?";
	private final String GET_USER_REGIMEN_QUERY = "select regimen.*, medicine.name from regimen inner join medicine on medicine.id = regimen.medicineId where userid = ?";
	private final String CREATE_NEW_REGIMEN_QUERY = "Insert into regimen (medicineId, userId, dosage) values (?, ?, ?)";
	private final String UPDATE_REGIMEN_BY_ID_QUERY = "Update regimen Set medicineId = ?, userId = ?, dosage = ? where id = ?";
	private final String DELETE_REGIMEN_BY_ID_QUERY = "Delete from regimen where id = ?";
	
	public  RegimenDao() {
		connection = DBConnection.getConnection();
	}
	

	public List<Regimen> getUserRegimen(int id) throws SQLException{
		
		PreparedStatement ps = connection.prepareStatement(GET_USER_REGIMEN_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List <Regimen> regimen = new ArrayList<Regimen>();
		
		while (rs.next()) {
			regimen.add(populateRegimen(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
		}
		
		return regimen;
		}
	
	public void createNewRegimen( int medId, int userId, String dosage ) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_REGIMEN_QUERY);
		ps.setInt(1,  medId);
		ps.setInt(2, userId);
		ps.setString(3, dosage);
		ps.executeUpdate();
	}
	
	public void updatedRegimenById(int medId, int userId, String dosage, int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_REGIMEN_BY_ID_QUERY);
		ps.setInt(1, medId);
		ps.setInt(2, userId);
		ps.setString(3, dosage);
		ps.setInt(4, id);
		ps.executeUpdate();
	}
	
	public void deleteRegimenById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_REGIMEN_BY_ID_QUERY);
		ps.setInt(1, id);
		ps.executeUpdate();
		
	}
	
	
	//may need to consult medicine dao to get actual name of med, instead of using it's id number
	//once the rest of the program is fleshed out.
	private Regimen populateRegimen(int id, int medicineId, int userId, String dosage, String medName) {
		return new Regimen(id, medicineId, userId, dosage, medName);
	}
	
	
}
