
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language l;
		l= new English();
		l.display();
		l = new Telugu();
		l.display();
		l = new Hindi();
		l.display();
	}

}
class Language{
	void display(){
		System.out.println("Language");
	}
}
class English extends Language{
	void display(){
		System.out.println("English Language");
	}
}
class Telugu extends Language{
	void display(){
		System.out.println("Telugu Language");
	}
}
class Hindi extends Language{
	void display(){
		System.out.println("Hindi Language");
	}
}