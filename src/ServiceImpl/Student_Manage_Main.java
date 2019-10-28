package ServiceImpl;


import java.util.ArrayList;

import Interface.Student_Manage_Main_Imp;
import JavaBeen.Adminbeen;
import JavaBeen.Studentbeen;
import JavaBeen.Teacherbeen;
import Student_Manage_Dao.Student_Manage_Main_Dao;


public class Student_Manage_Main implements Student_Manage_Main_Imp{

	@Override
	public void wel() {
	System.out.println("欢迎使用xxx管理系统");
		
	}
	Student_Manage_Main_Dao smmd = new Student_Manage_Main_Dao();
	
	@Override//学生登录
	public Studentbeen student_login(String id, String password) {
		Studentbeen student_login = smmd.student_login(id, password);
		return student_login;
	}
	@Override
	public boolean s_istrue(String id) {
		ArrayList<Studentbeen> s_istrue = smmd.s_istrue(id);
		if(s_istrue.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	@Override //教师登录
	//返回账号进行验证
	public Teacherbeen teacher_login(String id,String password) {
		Teacherbeen teacher_login = smmd.teacher_login(id,password);
		return teacher_login;
	}
	
	
	@Override //判断老师账号是否存在
	public boolean t_istrue(String id) {
	ArrayList<Teacherbeen> t_istrue = smmd.t_istrue(id);
		if(t_istrue.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	
	@Override//admin登录id验证
	public Adminbeen admin_login(String id,String password) {
		Adminbeen admin_login = smmd.admin_login(id,password);
		return admin_login;
	}
	
	//判断管理员账号是否存在
	@Override
	public boolean a_istrue(String id) {
		ArrayList<Adminbeen> a_istrue = smmd.a_istrue(id);
		if(a_istrue.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	
	
	
	




}
