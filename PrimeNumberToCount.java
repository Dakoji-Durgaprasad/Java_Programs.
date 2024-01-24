
public class PrimeNumberToCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int c=0;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1 && n>1) {
				System.out.println(i);
				c++;
			}
		}
		System.out.println("The number of prime number upto "+n+" is : "+c);
	}

}
