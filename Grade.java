import java.util.*;
public class Grade {
	public static void main(String[] args) {
		int avg;
		System.out.println("Enter your avg marks: ");
		Scanner sc = new Scanner(System.in);
		avg = sc.nextInt();
		
		if(avg>=80) {
			System.out.println("Grade A");
		}else if(avg<80 && avg>=60) {
			System.out.println("Grade B");
		}else if(avg<60 && avg>=40) {
			System.out.println("Grade c");
		}else {
			System.out.println("Grade D");
		}
	}
}
