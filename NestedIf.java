
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int x=11;
			if(x%2==0) {
				System.out.println("Given number is divisible by 2.");
			}else if(x%3==0) {
				System.out.println("Given number is divisible by 3.");
			}else if(x%4==0 || x%5==0){
				System.out.println("Given number is not divisible by 4 or 5. ");
			}else {
				System.out.println("Given number is not divisible by 2 or 3 or 4 or 5. ");
			}
	}

}
