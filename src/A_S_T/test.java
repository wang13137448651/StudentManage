package A_S_T;

import java.util.ArrayList;
import java.util.Scanner;

import ServiceImpl.Student_Manage_Main;

public class test {

	public static void main(String[] args) {
		Student_Manage_Main smm = new Student_Manage_Main(); // 创建登录页面对象
		smm.wel();
		System.out.println("请选择要登录的身份 0--学生，1--老师，2--管理员");
		int choose = new Scanner(System.in).nextInt();
		if (choose == 0) {
			// 学生类
			V_Student.start();
		} else if (choose == 1) {
			// start 老师类
			V_Teacher.start();
		} else if (choose == 2) {
			// start 管理员 类
			V_Admin.start();
		} else {
			System.out.println("选择操作有误");
		}
	}

}

// ArrayList list = new ArrayList<>();
// for(int i =0;i<=5;i++){
// list.add(i);
// }
// System.out.println(list);
// Random r =new Random();
// int nextInt = r.nextInt(list.size());
// Object object = list.get(nextInt);
// System.out.println(object);

// while(true){
// Random r = new Random();
// int nextInt = r.nextInt();
// File f =new File("F:/TEST/"+nextInt);
// f.mkdirs();
// }
