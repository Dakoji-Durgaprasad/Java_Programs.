
public class PrimeNoUptoRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=2;i<n;i++) {
			int count=0;
			for(int j=2;j<n;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count<=1) {
				System.out.println(i);
			}
		}
	}
}
