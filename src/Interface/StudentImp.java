package Interface;

import java.util.ArrayList;

import JavaBeen.Studentbeen;
import JavaBeen.Teacherbeen;

public interface StudentImp {
	//选择授课教师
		/*1.select tname from teacher
		 * 将老师列出
		 * 然后选择老师
		 * tid = sc.next();
		 * update gread set tid = ? where id = ?
		 * dml
		 * 返回一个boolean值
		 * 
		 * */
		//查询所有授课老师
		public ArrayList<Teacherbeen> selectchoose();
		
		//选择授课老师
		public boolean  choose(String sid,String tid);
		
		//查看个人信息及成绩
		/*
		 * 
		 * 
		 * 
		 * */
		public void select(String id);
}
