package Student_Manage_Dao;

import java.util.ArrayList;

import JavaBeen.Gradebeen;
import JavaBeen.Studentbeen;

public interface TeacherImp_Dao {

	
	//查询自己学生成绩（当前登录教师指定学生信息与成绩信息）
	//select aid,score from gread where tid = ?
	public  ArrayList<Gradebeen> selectall(String id);
	
	//修改自己学生成绩（传入修改学生的id与成绩）
	boolean update(double score, String id);
	
	//随机点名功能（随机取出任意一名每被选择的学生之后将其字段修改为被选）
	
		public ArrayList<Studentbeen> select_sname(String tid);
		
		public boolean updateistrue_to0(String tid);
		
		public boolean updateistrue_to1(String sname);
		
		// 查询状态为0的学生姓名 String sql = "Select sname from student where tid = ? and isTrue = 0 ";
		
		// 把点过名的同学的状态改为1 	String sql1 = "update student set isTrue = 1 where sname =? ";
		
		// 循环一遍之后，刷新全部状态为0  String sql2 = "Update student set isTrue= 0 where tid = ?"; 
		
	
}
