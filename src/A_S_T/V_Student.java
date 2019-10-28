package A_S_T;

import java.util.ArrayList;
import java.util.Scanner;

import JavaBeen.Studentbeen;
import JavaBeen.Teacherbeen;
import ServiceImpl.Admin;
import ServiceImpl.Student;
import ServiceImpl.Student_Manage_Main;
import ServiceImpl.Teacher;

public class V_Student {
	static Scanner sc = new Scanner(System.in);
	static Student_Manage_Main smm = new Student_Manage_Main(); // 创建登录页面对象
	static Student stu = new Student();
	static Teacher tea = new Teacher();
	static Admin admin = new Admin();

	public static void start() {
		System.out.println("请输入您的student账号");
		String sid = sc.next();
		boolean s_istrue = smm.s_istrue(sid);
		if (s_istrue) {
			System.out.println("请输入您的student密码");
			String password = sc.next();
			Studentbeen student_login = smm.student_login(sid, password);
			if (student_login != null) {
				while(true){
					function(sid);
				}
			} else {
				System.out.println("账号或密码错误");
			}

		} else {
			System.out.println("账号不存在");
		}
	}
	public static void function(String sid) {
		System.out.println("请选择操作，0--查看所有老师，1--选择授课老师，2--查看个人信息及成绩,3--更换当前账号登录，4--更换登录角色");
		int schoose = sc.nextInt();
		// 0--查看所有老师
		if (schoose == 0) {
			ArrayList<Teacherbeen> selectchoose = stu.selectchoose();
			for (Teacherbeen teacherbeen : selectchoose) {
				System.out
						.println("教师编号：" + "\t" + teacherbeen.getTid() + "\t" + "姓名：" + "\t" + teacherbeen.getTname());
			}
			// 1--选择授课老师
		} else if (schoose == 1) {
			System.out.println("请输入授课老师 --编号");
			String tid = sc.next();
			boolean t_istrue = smm.t_istrue(tid);
			if (t_istrue) {
				boolean choose2 = stu.choose(sid, tid);
				if (choose2) {
					System.out.println("选择成功");
				} else {
					System.out.println("选择失败");
				}
			} else {
				System.out.println("选择老师不存在，或编号不正确");
			}
			// 2--查看个人信息及成绩"
		} else if (schoose == 2) {
			stu.select(sid);
		}else if (schoose == 3) {
			start();
		}else if (schoose == 4) {
			test.main(null);
		} else {
			System.out.println("无此操作");
		}

	}

}
