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
	private final String GET_USER_REGIMEN_QUERY = "Select * from regimen where userid = ?";
	
	public  RegimenDao() {
		connection = DBConnection.getConnection();
	}
	
	/*temp hold
	public Regimen getUserRegimen(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_USER_REGIMEN_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		//rs.next();
		//return populateRegimen(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
		
	}
	*/
	
	/*
	 * 
	 * this is a bungle
	 */
	public List<Regimen> getUserRegimen(int id) throws SQLException{
		
		PreparedStatement ps = connection.prepareStatement(GET_USER_REGIMEN_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List <Regimen> regimen = new ArrayList<Regimen>();
		
		while (rs.next()) {
			regimen.add(populateRegimen(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4)));
		}
		
		return regimen;
		}
	
	
	//may need to consult medicine dao to get actual name of med, instead of using it's id number
	//once the rest of the program is fleshed out.
	private Regimen populateRegimen(int id, int medicineId, int userId, String dosage) {
		return new Regimen(id, medicineId, userId, dosage);
	}
	
	
}
