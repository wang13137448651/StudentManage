package Interface;

//管理员admin接口类
public interface AdminImp {
	// //判断所创建的学生账号是否存在
	// public boolean Student_isTrue(String id);
	// //判断所创建的老师账号是否存在
	// public boolean Teacher_isTrue(String id);
	// //判断所创建的管理员账号是否存在
	// public boolean Admin_isTrue(String id);

	// 创建学生账号
	/*
	 * sid 学生id name 学生姓名 sword 学生登录密码 isTrue 学生点名状态 此项默认为0 未被点 tid 学生选择的老师 老师
	 * 默认 ai
	 */
	public boolean setup_student(String sid, String sname, String sword, int isTrue, String tid);

	/*
	 * 第二张学生分数表 aid score 默认为0 tid 老师 默认 ai
	 * 
	 */
	public boolean setup_student_score(String aid, double score, String tid);

	// 创建教师账号
	/*
	 * tid tname tword
	 */
	public boolean setup_teacher(String tid, String tname, String tword);

	// 返回一个创建时间
	public String setup_admin_time();

	// 创建管理员账号
	/*
	 * aid aword time 管理员创建时间
	 */
	public boolean setup_admin(String aid, String aword, String time);

	// 删除账户类型选择删除账号类型0--学生，1--老师，2--管理员

	public boolean del_student(String sid);

	// teacher类型
	public boolean del_teacher(String tid);
	// admin类账户类型
	// public boolean del_admin(String aid);

}
