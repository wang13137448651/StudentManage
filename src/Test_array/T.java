package Test_array;

import java.util.Scanner;
import ServiceImpl.Admin;
import ServiceImpl.Teacher;


public class T  {
	static Scanner sc = new Scanner(System.in);

	public static void getmax(int[] num) {
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			max = num[i] > max ? num[i] : max;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		String tid = "ai";
		Teacher t = new Teacher();
		Admin admin = new Admin();
		String setup_admin_time = admin.setup_admin_time();
		System.out.println("现在时间：" + setup_admin_time);
		int[] t1 = new int[] { 10, 20, 30, 9, 56 };
		getmax(t1);
		int i = 1;
		while (true) {
			System.out.println(t.ran(tid).getSname() + " \t " + ":" + "执行第" + i++ + "次");
//			if (i == 32) {
//				break;
//			}
		}

		// }

		// Random r =new Random();
		// int l = r.nextInt(list.size());//随机数类，把长度放进去，当做下标
		// Studentbeen studentbeen = list.get(l); //获取一个随机下标
	}
}
