package JavaBeen;

import java.io.Serializable;

//学生分数 javabeen 类
public class Gradebeen implements Serializable {
	private String aid;//学生编号
	private double score ; //学生分数
	private String tid;//老师id
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Grade [aid=" + aid + ", score=" + score + ", tid=" + tid + "]";
	}
	
	
}
