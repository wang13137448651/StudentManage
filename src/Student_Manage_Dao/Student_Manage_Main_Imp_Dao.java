package Student_Manage_Dao;

import java.util.ArrayList;

import JavaBeen.Adminbeen;
import JavaBeen.Studentbeen;
import JavaBeen.Teacherbeen;

public interface Student_Manage_Main_Imp_Dao {

	// 登录方法,选择登陆角色0-学生
	public Studentbeen student_login(String id, String password);

	// 判断学生账号是否存在
	public ArrayList<Studentbeen> s_istrue(String id);

	// 1--老师登录验证 账号和密码
	public Teacherbeen teacher_login(String id, String password);

	// 判断老师账号是否存在
	public ArrayList<Teacherbeen> t_istrue(String id);

	// ，2--管理员登录
	public Adminbeen admin_login(String id, String password);

	// 判断学生账号是否存在
	public ArrayList<Adminbeen> a_istrue(String id);

}
