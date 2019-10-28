package Interface;

import java.util.ArrayList;

import JavaBeen.Gradebeen;
import JavaBeen.Studentbeen;

public interface TeacherImp {

	
	//查询自己学生成绩（当前登录教师指定学生信息与成绩信息）
	//select aid,score from gread where tid = ?
	public  ArrayList<Gradebeen> selectall(String id);
	
	//修改自己学生成绩（传入修改学生的id与成绩）
	
	boolean update(String sid,double score);

	
	//随机点名功能（随机取出任意一名每被选择的学生之后将其字段修改为被选）
	
		public Studentbeen ran(String id);

		
	
	
}
