import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using ArrayList
		List<Integer> Id = new ArrayList<>();
		Id.add(01);
		Id.add(02);
		Id.add(03);
		System.out.println("ArrayList:-");
		System.out.println(Id);
		//To print individual data.
		for(Integer i:Id) {
			System.out.println(i);
		}
		System.out.println();
		
		//Using LinkedList
		List<String> Student = new LinkedList<String>();
		Student.add("Sai");
		Student.add("Dp");
		Student.add("Siva");
		System.out.println("LinkedList:-");
		System.out.println(Student);
		System.out.println();
		for(String x:Student) {
			System.out.println(x);
		}
		System.out.println();
		
		//Using ArrayList
		List in = new Vector(Student);
		in.remove(0);
		System.out.println("Vector:-");
		System.out.println(in);
		System.out.println();
		
		//Using Stack
		List<String> Studs = new Stack();
		Studs.add("Raj");
		Studs.add("Ram");
		System.out.println("Stack:-");
		System.out.println(Studs);
	}
}