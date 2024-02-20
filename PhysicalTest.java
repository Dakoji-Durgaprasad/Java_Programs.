import java.util.*;
public class PhysicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your height: ");
		height = sc.nextDouble();
		System.out.println("Enter Your weight: ");
		weight = sc.nextDouble();
		
		if(height>=5.5 && weight >= 55) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not eligible");
		}
	}

}
