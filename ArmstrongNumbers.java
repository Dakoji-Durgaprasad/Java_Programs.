
class ArmstrongNumbers{
public static void main(String[] args){
	
	System.out.println("Hi!!");
	int n=1634;
	int t=n;
	int t2=t;
	int r, a=0,x=0;
	int count=0;
	while(n!=0) {	
		r = n % 10;
		count++;
		n = n / 10;
	}
	//System.out.println(count);
	
	while(t!=0) {
		
		r = t % 10;
		x=1;
		for(int i=1;i<=count;i++) {
			x=x*r;
	//		System.out.println(x);
		}
		a = a + x;
		t = t / 10;
	}
	//System.out.println(x);
	//System.out.println(a);
	if(a==t2) {
		System.out.println("Given number is Armstrong number.");
	}else {
		System.out.println("Given number is Not Armstrong number.");
	}
	}
}
