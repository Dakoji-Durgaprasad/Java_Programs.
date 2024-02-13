
public class StringPalindrome {

	public static void main(String[] args) {
		
		String s1 = "LEVEL";
		String s2 = s1;
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println("Input you given is : "+s1);
		System.out.println("Output you get is : "+rev);
		
		if(s2.equals(rev)) {
			System.out.println("Given string is palindrome.");
		}else {
			System.out.println("Given string is not palindrome.");
		}
	}

}
