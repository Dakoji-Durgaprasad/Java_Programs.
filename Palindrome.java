
public class Palindrome {
	
	public static void main(String[] args) {
		int n = 12321;
		int temp = n;
		int r,rev=0;
		
		while(n!=0) {
			r = n % 10;
			rev = rev * 10 + r;
			n=n / 10;
		}
		System.out.println(rev);
	 
		if(temp==rev) {
			System.out.println("palindrome Number");
		}else {
			System.out.println("Not palindrome Number");
		}
		
		String s1="LEVEL";
		String s2= s1;
		String reverse = "";
		
		for(int i=s1.length()-1;i>=0;i--) {
			reverse = reverse + s1.charAt(i);
		}
		
		System.out.println(reverse);
		if(s2.equals(reverse)) {
			System.out.println("palindrome String");
		}else {
			System.out.println("Not a palindrome String");
		}
	}
}
