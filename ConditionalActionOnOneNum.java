import java.util.*;
class ConditionalActionOnOneNum{
	public static void main(String[] args) {
		int n;
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	if(n>=1 && n<=100) {
		if(n%2!=0) {
			System.out.println("weird");
		}else if(n>=2 && n<=5) {
			System.out.println("not weird");
		}else if(n>=6 && n<=20) {
			System.out.println("wweird");
		}else{
			System.out.println("not weird");
		}
	}else {
		System.out.println("Enter a number in range between 1 to 100.");
	}
	}
}