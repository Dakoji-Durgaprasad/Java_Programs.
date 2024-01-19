
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0 && n>1) {
			System.out.println("Given number is prime number.");
		}else {
			System.out.println("Given number is not prime number.");
		}
	}

}
