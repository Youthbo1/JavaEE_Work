package Action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.Action;

import util.HibernateUtil;
import user.User;

public class RegisterAction implements Action{
	private int id;
	private String username;
	private String pwd;
	private String name;
	
	
	public String execute() throws Exception {	
		try {
			User user = new User(username, pwd, name);
			Session session = HibernateUtil.getSession();  
		    Transaction ts = session.beginTransaction();  
		        try {  
		            session.save(user);  
		            ts.commit();  
		        } finally {  
		            if(session != null)  
		                session.close();  
		        }  
		        
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			HibernateUtil.getSession().close();
			return ERROR;
		}

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
