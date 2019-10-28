package Student_Manage_Dao;

import java.util.ArrayList;
import JavaBeen.Gradebeen;
import JavaBeen.Studentbeen;

public class Teacher_Dao implements TeacherImp_Dao {

	@Override
	public ArrayList<Gradebeen> selectall(String tid) {
		String sql = "select aid,score from grade  where tid = ?";
		return AiUtil.dbDQLWithSQL(sql, Gradebeen.class, tid);
	}

	@Override
	public boolean update(double score, String aid) {
		String sql = "update grade set score = ? where aid = ? ";
		return AiUtil.dbDMLWithSQL(sql, score, aid);
	}
	
	// 查询状态为0的学生姓名
	@Override
	public ArrayList<Studentbeen> select_sname(String tid) {
		String sql = "Select sname from student where tid = ? and isTrue = 0 ";
		return AiUtil.dbDQLWithSQL(sql, Studentbeen.class, tid);
	}

	@Override
	public boolean updateistrue_to0(String tid) {
		String sql = "Update student set isTrue= 0 where tid = ?"; // 循环一遍之后，刷新全部状态为0
		return AiUtil.dbDMLWithSQL(sql, tid);
	}

	@Override
	public boolean updateistrue_to1(String sname) {
		String sql = "update student set isTrue = 1 where sname =? "; // 把这个同学的状态改为1
		return AiUtil.dbDMLWithSQL(sql, sname);
	}
	
	
}
