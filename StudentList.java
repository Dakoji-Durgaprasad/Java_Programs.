import java.util.ArrayList;
import java.util.List;

class StudentList{
	int id;
	String name;
	StudentList(int id, String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		List<StudentList> StuLt = new ArrayList<StudentList>();
		
		StudentList s1 = new StudentList(01,"Ram");
		StudentList s2 = new StudentList(02,"Palak");
		StudentList s3 = new StudentList(03,"Dp");
		
//		StudentList s1 = new StudentList();
//		s1.id=01;
//		s1.name="ram";
//		
//		StudentList s2 = new StudentList();
//		s2.id=02;
//		s2.name="palak";
		
		StuLt.add(s1);
		StuLt.add(s2);
		StuLt.add(s3);
		
		for(StudentList s:StuLt) {
			System.out.println(s.id+"  "+s.name);
		}
	}
}