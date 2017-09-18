package user;

public class User {
	private int id;
	private String username;
	private String pwd;
	private String name;
	public User(){
	
	}
	public User(String username,String pwd,String name){
		this.username=username;
		this.pwd=pwd;
		this.name=name;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
