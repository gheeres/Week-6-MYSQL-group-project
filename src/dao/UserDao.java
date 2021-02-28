package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.User;

public class UserDao {

	private Connection connection;
	
	private final String GET_USERS_QUERY = "Select * From user";
	private final String GET_A_USERS_QUERY = "Select * from user WHERE id = ?";
	private final String CREATE_NEW_ID_QUERY = "Insert into USER (id, name) values (? , ?)";
	private final String UPDATE_USER_QUERY = "Update User set id = ? , name = ?" ;
	private final String DELETE_USER_QUERY = "Delete from User where id = ? ";  // now sure if this is right format to write it
	
	
	public UserDao() {
		connection = DBConnection.getConnection();
	}
		public List<User> getUser () throws SQLException {
			ResultSet rs  = connection.prepareStatement(GET_USERS_QUERY).executeQuery();
			List<User> users = new ArrayList<User> () ;
			while (rs.next()) {
				users.add(populateUser(rs.getInt(1), rs.getString(2)));
				
		}
			return  users;
		
		}
		public User getUserID (int id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(GET_A_USERS_QUERY);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery() ; 
			rs.next ();
			return populateUser(rs.getInt(1), rs.getString(2));
		}
		
	private User populateUser(int id , String name ) {
		return new User(id, name);
		
	}
}
	
