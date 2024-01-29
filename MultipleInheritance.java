
public class MultipleInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SClass s = new SClass();
		s.get1();
		s.get2();
		s.get3();
	}

}
class ParCls1{
	void get1(){
		System.out.println("Class");
		}
}
interface ParCls2{
	void get2();
}
class SClass extends ParCls1 implements ParCls2 {
	void get3(){
		System.out.println("Subclass");
	}

	public void get2(){
		System.out.println("Interface");
	}
}