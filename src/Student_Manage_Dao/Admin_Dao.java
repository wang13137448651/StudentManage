package Student_Manage_Dao;

//dao层sql实现类
public class Admin_Dao implements AdminImp_Dao {

	// //判断所创建的账号是否存在
	// @Override //student
	// public ArrayList<Studentbeen> Student_isTrue(String id) {
	// String sql = "select sid from student where sid =? ";
	// return AiUtil.dbDQLWithSQL(sql, Studentbeen.class, id);
	// }
	// @Override //teacher
	// public ArrayList<Teacherbeen> Teacher_isTrue(String id) {
	// String sql = "select tid from teacher where tid =? ";
	// return AiUtil.dbDQLWithSQL(sql, Teacherbeen.class, id);
	// }
	// @Override//admin
	// public ArrayList<Adminbeen> Admin_isTrue(String id) {
	// String sql = "select aid from admin where aid =? ";
	// return AiUtil.dbDQLWithSQL(sql, Adminbeen.class, id);
	// }
	//

	// 学生第一张表
	@Override
	public boolean setup_student(String sid, String sname, String sword, int isTrue, String tid) {
		String sql = "insert into student values(?,?,?,?,?) ";
		return AiUtil.dbDMLWithSQL(sql, sid, sname, sword, isTrue, tid);
	}

	@Override // 学生第二张分数表
	public boolean setup_student_score(String aid, double score, String tid) {
		String sql = "insert into grade values(?,?,?) ";
		return AiUtil.dbDMLWithSQL(sql, aid, score, tid);
	}

	@Override
	public boolean setup_teacher(String tid, String tname, String tword) {
		String sql = "insert into teacher values(?,?,?)";
		return AiUtil.dbDMLWithSQL(sql, tid, tname, tword);
	}

	@Override
	public boolean setup_admin(String aid, String aword, String time) {
		String sql = "insert into admin values(?,?,?)";
		return AiUtil.dbDMLWithSQL(sql, aid, aword, time);
	}

	// //删除角色 选择删除账号类型0--学生，1--老师，2--管理员
	@Override
	public boolean del_student(String sid) {
		String sql1 = "DELETE from grade WHERE aid = ?";
		String sql = "DELETE from student WHERE sid = ?";
		boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, sid);
		boolean dbDMLWithSQL2 = AiUtil.dbDMLWithSQL(sql1, sid);
		return dbDMLWithSQL&&dbDMLWithSQL2;
	}

	@Override
	public boolean del_teacher(String tid) {
		String sql = "DELETE from teacher WHERE tid = ?";
		boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, tid);
		return dbDMLWithSQL;
	}

	// @Override
	// public boolean del_admin(String aid) {
	// String sql = "DELETE from admin WHERE aid = ?";
	// boolean dbDMLWithSQL = AiUtil.dbDMLWithSQL(sql, aid);
	// return dbDMLWithSQL;
	// }

}
