
public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape t = new Triangle();
		t.get1();
		if(t instanceof Triangle) {
			System.out.println("triangle");
		}
	}
}
class Shape{
	void get1() {
		System.out.println("Shape");
	}
}
class Triangle extends Shape{
	void get2() {
		System.out.println("Triangle");
	}
}
