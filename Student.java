//create a object for student by using list.

import java.util.*;
public class Student {
	int Id;
	String name;
	Student(int id,String name){
		this.Id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stu= new ArrayList<Student>();
		Student s1= new Student(1001,"durga");
		Student s2= new Student(1002,"prasad");
		stu.add(s1);
		stu.add(s2);
		for(Student x: stu) {
			System.out.println(x.Id+"  "+x.name);
		}
	}
}
