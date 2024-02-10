
public class Fabonacci {
	public static void main(String[] args) {
		int a=0,b=1;
		int n=5;
		System.out.println(a+"\n"+b);
		for(int i=1;i<n-1;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
