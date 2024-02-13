import java.util.*;
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Durga";
		char  a,e,i,o,u;
		int count=0;
		
		  s = s.toLowerCase();
		  
		System.out.println(s);
		for(int x=0;x<s.length();x++) {
		if(s.charAt(x)=='a' || s.charAt(x)=='e' ||s.charAt(x)=='i' ||s.charAt(x)=='o' ||s.charAt(x)=='u' ) {
			count++;
		}
			
	}
		System.out.println(count);
	}
	
}
