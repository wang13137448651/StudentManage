package JavaBeen;

import java.io.Serializable;

//teacher  javabeen
public class Teacherbeen implements Serializable {
	
	private String tid; //老师账号
	private String tname;//老师姓名
	private String tword;//老师密码
	
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTword() {
		return tword;
	}
	public void setTword(String tword) {
		this.tword = tword;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tword=" + tword + "]";
	}
	
}
