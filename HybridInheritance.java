
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.Aget();
		c.Cget();
		D d = new D();
		d.Bget();
		d.Dget();
		
	}

}
class A{
	void Aget() {
		System.out.println("Class A");
	}
}
interface B{
	void Bget();
}
class C extends A{
	void Cget() {
		System.out.println("Class C");
	}
}
class D implements B{
	void Dget() {
		System.out.println("Class D");
	}
	public void Bget() {
		System.out.println("interface B");
	}
}
