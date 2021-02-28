package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import dao.DBConnection;
import entity.Medicine;

public class MedicineDao {
	
	private static Connection connection;
	private final String SHOW_MEDICINE_QUERY = "SELECT * FROM medicine";
	private final String CREATE_NEW_MEDICINE_QUERY = "INSERT INTO teams(name) VALUES (?)";
	private final String UPDATE_MEDICINE_QUERY = "UPDATE Medicine SET medicineName = ?";
	private final String DELETE_MEDICINE_QUERY = "DELETE FROM Medicine WHERE ID = ?";
	
	public MedicineDao() {
		connection =DBConnection.getConnection();
	}
	public ArrayList<Medicine> getMedicine() throws SQLException {
		ResultSet rs = connection.prepareStatement(SHOW_MEDICINE_QUERY).executeQuery();
		ArrayList<Medicine> medicine = new ArrayList<Medicine>();
		
		while (rs.next()) {
			medicine.add(populateMedicine(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		return medicine;
		}
		public Medicine populateMedicine(int id, String name, String usage) {
		return new Medicine(id, name, usage);
		
		}

		public void createNewMedicine(String medicineName) throws SQLException {
			PreparedStatement ps = connection.prepareStatement("CREATE_NEW_MEDICINE_QUERY");
			ps.setString(1, medicineName);
			ps.executeUpdate();
		}
		public static void updateMedicine(int medicineId) throws SQLException {
			PreparedStatement ps = connection.prepareStatement("UPDATE_NEW_MEDICINE_QUERY");
			ps.setInt(1, medicineId);
			ps.executeUpdate();
		}
		public static void showMedicine(String showMedicine) throws SQLException {
			PreparedStatement ps = connection.prepareStatement("SHOW_NEW_MEDICINE_QUERY");
			ps.setString(1, showMedicine);
			ps.executeUpdate();

		}
		public static void deleteMedicine(int id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement("DELETE_NEW_MEDICINE_QUERY");
			ps.setInt(1, id);
			ps.executeUpdate();
}
		public String getCREATE_NEW_MEDICINE_QUERY() {
			return CREATE_NEW_MEDICINE_QUERY;
		}
}
