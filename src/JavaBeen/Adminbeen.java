package JavaBeen;

import java.io.Serializable;

//管理员 javabeen  类
public class Adminbeen implements Serializable {
	private String aid; //管理员登录账号
	private String aword;//密码
	private String  time ;// 时间
	
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getAword() {
		return aword;
	}
	public void setAword(String aword) {
		this.aword = aword;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aword=" + aword + ", time=" + time + "]";
	}
	

}
