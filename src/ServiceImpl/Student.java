package ServiceImpl;

import java.util.ArrayList;

import Interface.StudentImp;
import JavaBeen.Teacherbeen;
import Student_Manage_Dao.Student_Dao;

public class Student implements StudentImp {
	Student_Dao s = new Student_Dao();

	@Override //返回所有老师的集合
	public ArrayList<Teacherbeen> selectchoose() {
		ArrayList<Teacherbeen> sc = s.selectchoose();
		return sc;
	}
	
	@Override //选择老师
	public boolean choose(String sid, String tid) {
		boolean ce = s.choose(sid, tid);
		return ce;
	}

	@Override
	public void select(String id) {
		s.select(id);
	}


}
