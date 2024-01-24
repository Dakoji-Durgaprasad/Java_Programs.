
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.get1();
		c.get2();
	}
}
class Parent {
 void get1(){
	 System.out.println("This is a parent class");
 }
}
class Child extends Parent{
	void get2() {
		System.out.println("This is a child class");
	}
	
}