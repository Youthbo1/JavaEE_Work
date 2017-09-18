package user;

import java.sql.Timestamp;

public class Essay {
	private int essayid;
	private int essayuserid;
	private String content;
	private Timestamp publishtime;
	
	public Essay(){
		
	}
	public Essay(int essayuserid,String content,Timestamp publishtime){
		this.essayuserid=essayuserid;
		this.content=content;
		this.publishtime=publishtime;
	
		
	}
	public int getEssayid() {
		return essayid;
	}
	public void setEssayid(int essayid) {
		this.essayid = essayid;
	}
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
	
	
}
