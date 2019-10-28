package A_S_T;

import java.util.ArrayList;
import java.util.Scanner;

import JavaBeen.Gradebeen;
import JavaBeen.Studentbeen;
import JavaBeen.Teacherbeen;
import ServiceImpl.Admin;
import ServiceImpl.Student;
import ServiceImpl.Student_Manage_Main;
import ServiceImpl.Teacher;

public class V_Teacher {
	static Scanner sc = new Scanner(System.in);
		static Student_Manage_Main smm = new Student_Manage_Main(); // 创建登录页面对象
		Student stu = new Student();
		static Teacher tea = new Teacher();
		Admin admin = new Admin();
		
		public static void start() {
			
		System.out.println("请输入您的teacher账号");
		String tid = sc.next();
		boolean t_istrue = smm.t_istrue(tid);
		if (t_istrue) {
			System.out.println("请输入密码");
			String password = sc.next();
			Teacherbeen teacher_login = smm.teacher_login(tid, password);
			if (teacher_login != null) {	
			while(true){
				function(tid);
			}
			} else {
				System.out.println("账号或密码不正确");
			}
		} else {
			System.out.println("账户不存在");
		}
	
		}
		
		
	public static void function(String tid){
		System.out.println("尊敬的" + ":" + tid + "：" + "老师您好");
		System.out.println("请选择您的操作0--查询所教学生信息，1--修改学生成绩，2--随机点名,3--更换当前账号登录，4--更换登录角色");
		int choose1 = sc.nextInt();
		if (choose1 == 0) {
			ArrayList<Gradebeen> selectall = tea.selectall(tid);
			for (Gradebeen gradebeen : selectall) {
				System.out.println(gradebeen.getAid() + "  \t  " + gradebeen.getScore());
			}
		} else if (choose1 == 1) {
			System.out.println("输入要修改学生id");
			String aid = sc.next();
			System.out.println("输入修改后的成绩");
			double score = sc.nextDouble();
			boolean update = tea.update(aid, score);
			if (!update) {
				System.out.println("修改失败");
			} else {
				System.out.println("修改成功");
			}
		} else if (choose1 == 2) {
			Studentbeen ran = tea.ran(tid);
			System.out.println("此次被点中的人是" + ":" + ran.getSname());			
		}else if(choose1==3){
			start();
		}else if(choose1==4){
			test.main(null);
		} else {
			System.out.println("无此操作");
		}
	}

}
