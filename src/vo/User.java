package vo;

public class User {
	private int uid;
	private String username;
	private String password;
	private String telephone;
	private String email;
	private String hotelname;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	@Override
	public String toString() {
		return "user [uid=" + uid + ", username=" + username + ", password=" + password + ", telephone=" + telephone
				+ ", email=" + email + ", hotelname=" + hotelname + "]";
	}
	public User(int uid, String username, String password, String telephone, String email, String hotelname) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.hotelname = hotelname;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
}
