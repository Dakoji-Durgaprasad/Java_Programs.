
public class StringMethods {

	public static void main(String[] args) {

		String name = "Durga";
		
//		toUpperCase() & toLowerCase()
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
//		trim():  it is used to delete space before and after the word.
		String string = " Java is programming language.";
		System.out.println(string);
		System.out.println(string.trim());
		
//		startsWith() and endsWith() : it is like boolean type it display whether it is true or false in output. 
		String str = " Java Programming";
		System.out.println(str.startsWith(" J"));
		System.out.println(str.endsWith("g"));
		
//		charAt():  it is used to display particular character by giving index number.
		System.out.println(str.charAt(6));
		
//		length():  it is used to calucate the length of given string.
		String st = "Java is programming language.";
		System.out.println(st.length());

		
//		intern():  it is used to assign same value to another variable.
		String s= st.intern();
		System.out.println(s);
		
//		valueOf(): method coverts given type such as int, long, float, double, boolean, char and char array into String.
		int a = 12;
		String b = String.valueOf(a);
		System.out.println(b+10);
		
//		replace():  it is used to replace some strings by assign another string in it.
		System.out.println(st.replace("Java","JAVA"));
	}

}
