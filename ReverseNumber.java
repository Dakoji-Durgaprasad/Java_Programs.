
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int temp=n;
		int r,rev=0;
		while(n!=0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
	
		System.out.println("The reverse number for "+temp +" is : "+rev);
	}

}
