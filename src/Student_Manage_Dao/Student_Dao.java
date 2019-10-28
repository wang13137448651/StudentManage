package Student_Manage_Dao;

import java.util.ArrayList;

import JavaBeen.Gradebeen;
import JavaBeen.Studentbeen;
import JavaBeen.Teacherbeen;

public class Student_Dao  implements Student_Imp_Dao{

	@Override//查询所有授课老师
	public ArrayList<Teacherbeen> selectchoose() {
		String sql = "select tid,tname from teacher";
		ArrayList<Teacherbeen> dbDQLWithSQL = AiUtil.dbDQLWithSQL(sql, Teacherbeen.class);
		return dbDQLWithSQL;
	}
	
	@Override //选择授课老师
	public boolean choose(String sid,String tid) {
		String sql1 = "update grade set tid =? where aid =?"; //先更新从表
		String sql = "update student set tid =? where sid =? ";//在更新主表
		boolean dbDMLWithSQL2 = AiUtil.dbDMLWithSQL(sql1, tid,sid);
		boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, tid,sid);
		return dbDMLWithSQL&&dbDMLWithSQL2;
	}
	@Override
	public void select(String id) {
		String sql = "select * from student where sid =?";//
		ArrayList<Studentbeen> dbDQLWithSQL2 = AiUtil.dbDQLWithSQL(sql, Studentbeen.class, id);
		String sql1 = "select score from grade where aid =?";
		ArrayList<Gradebeen> dbDQLWithSQL = AiUtil.dbDQLWithSQL(sql1, Gradebeen.class, id);
		for (Studentbeen studentbeen : dbDQLWithSQL2) {
			System.out.println("您的个人信息："+studentbeen);
		}
		System.out.println("您的成绩为："+dbDQLWithSQL.get(0).getScore());
	}

	

}
