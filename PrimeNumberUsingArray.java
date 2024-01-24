//checking list and printing prime numbers and counting how many times the number get repeated.
public class PrimeNumberUsingArray {

	public static void main(String[] args) {
	    int  a[]= {2,3,4,7,7};
	    int b[]= new int[10];
	    
		int s=0;
		for(int i=0;i<a.length;i++) {
		int c=0;
		for(int j=2;j<a[i];j++) {
			if(a[i]%j==0) {
				c++;
			}
		}
		if(c==0 && a[i]>1) {
			System.out.println(a[i]);
			b[a[i]]++;
		}
		}
		for(int k=0;k<10;k++){
			//System.out.println(b[k]);
			if(b[k]!=0) {
				System.out.println(k+":"+b[k]);
			}
		}
	}
}
