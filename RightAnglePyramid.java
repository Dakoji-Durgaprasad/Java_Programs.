
public class RightAnglePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number pyramid 1
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		 }
		System.out.println("\n");
		
	// number pyramid 2
	
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		 }
		System.out.println("\n");
		
	// number pyramid 3
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		 }
		System.out.println("\n");
				
    //--------right angle pyramid pattern.-------------------------------		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
		//----------------------------------------------------------------
		int b=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		 }
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		 }
		System.out.println("\n");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		 }
		
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		 }
		System.out.println("\n");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		 }
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		 }
		System.out.println("\n");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		 }
	}

}
