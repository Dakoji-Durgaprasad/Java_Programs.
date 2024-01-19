
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int r,rev=0;
		int temp=n;
		while(n!=0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("Given number is fibonacci number.");
		}else {
			System.out.println("Given number is not fibonacci number.");
		}
	}


}
