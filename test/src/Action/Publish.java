package Action;

import java.sql.Timestamp;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import user.Essay;
import util.HibernateUtil;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class Publish implements Action{
	private int essayuserid;
	private String content;
	private Timestamp publishtime;

	public int getEssayuserid() {
		return essayuserid;
	}
	public void setEssayuserid(int essayuserid) {
		this.essayuserid = essayuserid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getPublishtime() {
		return publishtime;
	}
	public void setPublishtime(Timestamp publishtime) {
		this.publishtime = publishtime;
	}
	
	public String execute() throws Exception {
		
		Session session =HibernateUtil.getSession();
		ActionContext ctx = ActionContext.getContext();
		Map sessionuser = ctx.getSession();
		Integer userid = (Integer)sessionuser.get("id");
		System.out.println(userid);
		Essay newEssay = new Essay(userid,content,null);
		Transaction tx = session.beginTransaction();
		session.save(newEssay);
		tx.commit();
		return SUCCESS;
	}
}
