
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 s = new Sub2();
		s.get1();
		s.get2();
		s.get3();
	}

}
class Super{
	void get1() {
		System.out.println("Superclass");
	}
}
class Sub1 extends Super{
	void get2() {
		System.out.println("Subclass one");
	}
}
class Sub2 extends Sub1{
	void get3() {
		System.out.println("Subclass two");
	}
}