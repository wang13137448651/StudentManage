package A_S_T;

import java.util.Scanner;

import JavaBeen.Adminbeen;
import ServiceImpl.Admin;
import ServiceImpl.Student_Manage_Main;

public class V_Admin {

	static Scanner sc = new Scanner(System.in);
	static Student_Manage_Main smm = new Student_Manage_Main(); // 创建登录页面对象
	static Admin admin = new Admin();

	public static void start() {
		System.out.println("请输入您的Admin账号");
		String aid = sc.next();
		boolean a_istrue = smm.a_istrue(aid); // 判断此账号是否存在
		if (a_istrue) {
			System.out.println("请输入密码");
			String password = sc.next();
			Adminbeen admin_login = smm.admin_login(aid, password); // 获取数据库账号
			if (admin_login != null) {
				while (true) {
					function(aid);
				}
			} else {
				System.out.println("账号或密码不正确");
			}
		} else {
			System.out.println("此管理员账号不存在");
		}
	}

	public static void function(String aid) {
		System.out.println("尊敬的" + ":" + aid + "：" + "Admin您好");
		System.out.println("请选择您的操作0--创建学生账号，1--创建教师账号，2--创建管理员账号," + "3--删除账号学生账号），4--删除账号老师账号,5--更换当前登录账号，6--更换登录角色");
		int achoose = sc.nextInt();
		if (achoose == 0) {
			System.out.println("请输入创建学生sid");
			String sid = sc.next();
			boolean a_istrue2 = smm.a_istrue(sid);
			if (!a_istrue2) {
				System.out.println("请输入创建学生sname");
				String sname = sc.next();
				System.out.println("请输入创建学生sword");
				String sword = sc.next();
				boolean setup_student = admin.setup_student(sid, sname, sword, 0, "ai"); // 学生表
				boolean setup_student_score = admin.setup_student_score(aid, 0, "ai"); // 学生成绩表
				if (setup_student && setup_student_score) {
					System.out.println("创建成功");
				} else {
					System.out.println("创建失败");
				}
			} else {
				System.out.println("此学生已存在");
			}
		} else if (achoose == 1) {
			System.out.println("教师tid");
			String tid = sc.next();
			boolean s_istrue = smm.s_istrue(tid);
			if (!s_istrue) {
				System.out.println("教师tname");
				String tname = sc.next();
				System.out.println("教师tword");
				String tword = sc.next();
				boolean setup_teacher = admin.setup_teacher(tid, tname, tword);
				if (setup_teacher) {
					System.out.println("创建成功");
				} else {
					System.out.println("创建失败");
				}
			} else {
				System.out.println("此教师tid已存在");
			}
		} else if (achoose == 2) {
			System.out.println("管理员aid");
			String aid1 = sc.next();
			boolean a_istrue2 = smm.a_istrue(aid1);
			if (!a_istrue2) {
				System.out.println("请设置密码");
				String aword = sc.next();
				String time = admin.setup_admin_time(); // 返回一个创建时间(创建时的时间)
				boolean setup_admin = admin.setup_admin(aid1, aword, time);
				if (setup_admin) {
					System.out.println("创建管理员账号成功");
				} else {
					System.out.println("创建管理员账号失败");
				}
			} else {
				System.out.println("此管理员已存在");
			}
		} else if (achoose == 3) {
			// 删除角色 选择删除账号类型0--学生，
			System.out.println("输入要删除学生的sid");
			String sid = sc.next();
			boolean s_istrue = smm.s_istrue(sid);
			if (s_istrue) {
				boolean del_student = admin.del_student(sid);
				if (del_student) {
					System.out.println("删除成功");
				} else {
					System.out.println("删除失败");
				}
			} else {
				System.out.println("要删除的账户不存在");
			}
			
		} else if (achoose == 4) {
			// 1--删除老师，
			System.out.println("输入要删除老师的sid");
			String tid = sc.next();
			boolean t_istrue = smm.t_istrue(tid);
			if (t_istrue) {
				boolean del_teacher = admin.del_teacher(tid);
				if (del_teacher) {
					System.out.println("删除成功");
				} else {
					System.out.println("删除失败");
				}
			} else {
				System.out.println("要删除的账户不存在");
			}
		} else if (achoose == 5) {
			start();
		} else if (achoose == 6) {
			test.main(null);
		} else {
			System.out.println("无此操作");
		}

	}

}
