import java.util.*;
public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "RACE";
		String s2 = "CARE";
		
		if(s1.length()==s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
//			System.out.println(ch1);
//			System.out.println(ch2);
			
			if(Arrays.equals(ch1, ch2)){
				System.out.println("Given Strings are Anagram.");
			}else {
				System.out.println("Given Strings are not anagram.");
			}
		
		}else {
			System.out.println("Both the string lengths are different..");
		}
	}

}
