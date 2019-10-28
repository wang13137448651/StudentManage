package ServiceImpl;

import java.util.ArrayList;
import java.util.Random;
import Interface.TeacherImp;
import JavaBeen.Gradebeen;
import JavaBeen.Studentbeen;
import Student_Manage_Dao.AiUtil;
import Student_Manage_Dao.Teacher_Dao;

public class Teacher implements TeacherImp{
	
	Teacher_Dao td = new Teacher_Dao();
	
	@Override
	public ArrayList<Gradebeen> selectall(String tid) {
		ArrayList<Gradebeen> selectall = td.selectall(tid);
		return selectall;
	}

	@Override
	public boolean update(String aid,double score) {
		boolean update = td.update(score, aid);
		return update;
	}

	@Override//随机点名功能（随机取出任意一名每被选择的学生之后将其字段修改为被选）
	public Studentbeen ran(String tid) {
		ArrayList<Studentbeen> list = new ArrayList<>();// 保存这个老师名下的学生
		ArrayList<Studentbeen> select_sname = td.select_sname(tid);
		for (Studentbeen studentbeen : select_sname) {
			list.add(studentbeen);
		}
		Random r = new Random();
		int l = r.nextInt(list.size());// 随机数类，长度当做下标
		Studentbeen studentbeen = list.get(l); // 获取一个随机数当做集合下标，返回一个下标对应的名字
		// 然后把选过的学生名字状态istrue 改为1
		String sname = studentbeen.getSname(); // 获取这个同学的姓名
		td.updateistrue_to1(sname);//即刻把点过名字的人状态变为1
		if (list.size() == 1) {
			td.updateistrue_to0(tid); //轮一圈刷新
			System.out.println("下次运行后" + "刷新");
		}
		return studentbeen; // 返回随机下标对应的姓名
	}

}
