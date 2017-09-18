package Action;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import user.Essay;
import user.User;
import util.HibernateUtil;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class Login implements Action{
	private int id;
	private String username;
	private String pwd;
	private String name;
	
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
	
	public String execute() {
		Session session =HibernateUtil.getSession();			
		Query query = session.createQuery("from User where username = :username and pwd = :pwd");
		query.setParameter("username", username);
		query.setParameter("pwd", pwd);
		List<User> list = (List<User>)query.list();
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("id", list.get(0).getId());
		ctx.getSession().put("username", list.get(0).getName());
		System.out.println(list.get(0).getId());
		System.out.println(list.get(0).getName());
		
        if (loginCheck(username, pwd)) {
        	Query query2 = session.createQuery("from Essay");
        	List<Essay> list2 = (List<Essay>)query2.list();
        	ctx.getSession().put("essay", list2);
        	System.out.println(list2.get(0).getContent());
        	
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
        
	public  boolean loginCheck(String username, String pwd) {
    		
    		Session session = HibernateUtil.getSession();
    		Transaction ts = session.beginTransaction();
    		try {  		
    			Query query = session.createQuery("from User where username = :username and pwd= :pwd");
    			query.setParameter("username", username);
    			query.setParameter("pwd", pwd);
    			List list = query.list();
                ts.commit(); 
                if (list.size()==1) {
    				return true;
    			} else {
    				return false;
    			}
            }catch (Exception e) {
    			// TODO: handle exception
            	e.printStackTrace();
            	return false;
    		} finally {  
                if(session != null)  
                    session.close(); 
                if (ts!=null) {
    				ts=null;
    			}
            }
    	}
}

