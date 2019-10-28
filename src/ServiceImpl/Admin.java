package ServiceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import Interface.AdminImp;
import Student_Manage_Dao.Admin_Dao;
import Student_Manage_Dao.AiUtil;

//管理员admin实现类
public class Admin implements AdminImp {
	// 创建一个Dao层sql的实现类
	Admin_Dao ad = new Admin_Dao();

	// @Override
	// public boolean Student_isTrue(String id) {
	// ArrayList<Studentbeen> student_isTrue = ad.Student_isTrue(id);
	// if(student_isTrue.isEmpty()){
	// return false;
	// }else{
	// return true;
	// }
	// }
	// @Override
	// public boolean Teacher_isTrue(String id) {
	// ArrayList<Teacherbeen> teacher_isTrue = ad.Teacher_isTrue(id);
	// if(teacher_isTrue.isEmpty()){
	// return false;
	// }else{
	// return true;
	// }
	// }
	// @Override
	// public boolean Admin_isTrue(String id) {
	// ArrayList<Adminbeen> admin_isTrue = ad.Admin_isTrue(id);
	// if(admin_isTrue.isEmpty()){
	// return false;
	// }else{
	// return true;
	// }
	// }
	//

	@Override // student
	public boolean setup_student(String sid, String sname, String sword, int isTrue, String tid) {
		String sql = "insert into student values(?,?,?,?,?) ";
		boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, sid, sname, sword, isTrue, tid);
		return dbDMLWithSQL;
	}

	@Override // grade
	public boolean setup_student_score(String aid, double score, String tid) {
		String sql = "insert into grade values(?,?,?)";
		boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, aid, score, tid);
		return dbDMLWithSQL;
	}

	@Override
	public boolean setup_teacher(String tid, String tname, String tword) {
		String sql = "insert into teacher values(?,?,?)";
		boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, tid, tname, tword);
		return dbDMLWithSQL;
	}

	@Override
	public boolean setup_admin(String aid, String aword, String time) {
		String sql = "insert into admin values(?,?,?)";
		boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, aid, aword, time);
		return dbDMLWithSQL;
	}

	// 返回一个创建时间
	@Override
	public String setup_admin_time() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日 hh:mm:ss");
		String format = sdf.format(new Date());
		return format;
	}

	//// 删除账户类型选择删除账号类型0--学生，1--老师，2--管理员
	@Override
	public boolean del_student(String sid) {
		boolean del_student = ad.del_student(sid);
		return del_student;
	}

	@Override
	public boolean del_teacher(String tid) {
		boolean del_teacher = ad.del_teacher(tid);
		return del_teacher;
	}

	// @Override
	// public boolean del_admin(String aid) {
	// boolean del_admin = ad.del_admin(aid);
	// return del_admin;
	// }

}
