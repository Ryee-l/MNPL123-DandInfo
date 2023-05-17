package DB.src.main.java;

public class User {
	
	private String studentID;
	private String password;
	private String phoneNumber;
	
	
	
	
	
	public User(String ID, String password, String number) {
		super();
		this.studentID = ID;
		this.password = password;
		this.phoneNumber = number;
	}
	
	
	public String getStudentID() {
		return studentID;
	}
	public void setUsername(String ID) {
		this.studentID = ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return phoneNumber;
	}
	public void setEmail(String number) {
		this.phoneNumber = number;
	}
	
	

}
