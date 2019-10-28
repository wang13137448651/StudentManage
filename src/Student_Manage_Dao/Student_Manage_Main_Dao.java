package Student_Manage_Dao;

import java.util.ArrayList;

import JavaBeen.Adminbeen;
import JavaBeen.Studentbeen;
import JavaBeen.Teacherbeen;

public class Student_Manage_Main_Dao implements Student_Manage_Main_Imp_Dao {

	@Override
	public ArrayList<Studentbeen> s_istrue(String id) {
		String sql = "select sid from student where sid =?";
		return AiUtil.dbDQLWithSQL(sql, Studentbeen.class, id);
	}

	@Override
	public ArrayList<Teacherbeen> t_istrue(String id) {
		String sql = "select tid from teacher where tid =?";
		return AiUtil.dbDQLWithSQL(sql, Teacherbeen.class, id);
	}

	@Override
	public ArrayList<Adminbeen> a_istrue(String id) {
		String sql = "select aid from admin where aid =?";
		return AiUtil.dbDQLWithSQL(sql, Adminbeen.class, id);
	}


	@Override
	public Studentbeen student_login(String id, String password) {
		String sql = "select * from student where sid =? and sword = ?";
		ArrayList<Studentbeen> dbDQLWithSQL = AiUtil.dbDQLWithSQL(sql, Studentbeen.class, id,password);
		if(dbDQLWithSQL.isEmpty()){
			return null;
		}else{
			return dbDQLWithSQL.get(0);
		}
	}

	@Override //tea验证账号
	public Teacherbeen teacher_login(String id,String password) {
		String sql = "select * from teacher where tid =? and tword=?";
		ArrayList<Teacherbeen> dbDQLWithSQL = AiUtil.dbDQLWithSQL(sql, Teacherbeen.class, id,password);
		if(dbDQLWithSQL.isEmpty()){
			return null;
		}else{
			return dbDQLWithSQL.get(0);
		}
	}


	@Override //admin id
	public Adminbeen admin_login(String id,String password) {
		String sql = "select * from admin where aid =? and aword = ?";
		ArrayList<Adminbeen> dbDQLWithSQL = AiUtil.dbDQLWithSQL(sql, Adminbeen.class, id,password);
		if(dbDQLWithSQL.isEmpty()){
			return null;
		}else{
			return dbDQLWithSQL.get(0);
		}
	}

	
	




}
