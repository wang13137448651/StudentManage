package JavaBeen;

import java.io.Serializable;

//student java been
public class Studentbeen implements Serializable{
	private String sid; //学生登录账号
	private String sname;//学生姓名
	private String sword;// 密码
	private int isTrue;// 是否被点名  默认 0--未点到 ，1--已点到
	private String tid; //学生对应老师id
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSword() {
		return sword;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public int getIsTrue() {
		return isTrue;
	}
	public void setIsTrue(int isTrue) {
		this.isTrue = isTrue;
	}
	@Override
	public String toString() {
		return "Studentbeen [sid=" + sid + ", sname=" + sname + ", sword=" + sword + ", isTrue=" + isTrue + ", tid="
				+ tid + "]";
	}
	

}
