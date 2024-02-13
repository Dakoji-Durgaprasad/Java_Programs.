
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,8,16,20,4};
		int n = 24;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i] + a[j] == n && i!=j) {
					System.out.println(a[i]+":"+a[j]);
				}
			}
		}
	}

}
