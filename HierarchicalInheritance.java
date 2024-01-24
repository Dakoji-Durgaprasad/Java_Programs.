
public class HierarchicalInheritance {

	public static void main(String[] args) {
        
        System.out.println("Hello \n");
        SubClass1 s1 = new SubClass1();
        	s1.get1();
        	s1.get2();
        SubClass2 s2 = new SubClass2();
        	s2.get1();
        	s2.get3();
		}
	}
class SuperClass{
    void get1(){
        System.out.println("Super class is super ");
    }
}
class SubClass1 extends SuperClass{
    void get2(){
        System.out.println("Sub class1 is also super ");
    }
}
class SubClass2 extends SuperClass{
  void get3(){
        System.out.println("Sub class2 is also super ");
  	}
}
