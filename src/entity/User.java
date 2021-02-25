package entity;

public class User {

	private int userId;
	private String userName;

	public User(int userId, String userName) {
		this.setUserId(userId);
		this.setUserName(userName);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
