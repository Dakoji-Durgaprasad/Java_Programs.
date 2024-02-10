# Java_Programs.
In this repository uploading some java programs.

# checking given number is prime number or not.


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
O/p:-
Given number is prime number.

# Printing prime numbers upto given range.

public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int p=15;
		for(i=2;i<=p;i++)
		{
			int count=0;
			for(j=2;j<=p;j++) {
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
O/p:-
2
3
5
7
11
13

# Fibonacci program


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
O/p:-
0
1
1
2
3

# Creating an object and accessing it. 

public class BankAccount {
	int accNum;
	String accHolderName;
	String accType;
	String branchIFSC;
	double accCurrentBalance;
	boolean isSavingsAcc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
			ba.accNum=1234;
			ba.accHolderName="DURGA";
			ba.accType="SAVINGS";
			ba.branchIFSC="SBIN0001948";
			ba.accCurrentBalance=500.0;
			ba.isSavingsAcc=true;
			
		BankAccount ba1 = new BankAccount();
			ba1.accNum=5678;
			ba1.accHolderName="PRASAD";
			ba1.accType="CURRENT";
			ba1.branchIFSC="ICICI0093";
			ba1.accCurrentBalance=1000.0;
			ba1.isSavingsAcc=false;
			
		System.out.println(ba.accNum);
		System.out.println(ba.accHolderName);
		System.out.println(ba.accType);
		System.out.println(ba.branchIFSC);
		System.out.println(ba.accCurrentBalance);
		System.out.println(ba.isSavingsAcc);
		
		System.out.println(ba1.accNum+" \n"+ba1.accHolderName+" \n"+ba1.accType+" \n"+ba1.branchIFSC+" \n"+ba1.accCurrentBalance+" \n"+ba1.isSavingsAcc);
	}
}
o/p:-
1234
DURGA
SAVINGS
SBIN0001948
500.0
true
5678 
PRASAD 
CURRENT 
ICICI0093 
1000.0 
false

# Even Number while using FOR LOOP.

public class PrintingEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i=i+2) {
			System.out.println(i);
		}
	}

}
O/p:-
0
2
4
6
8
10
12
14
16
18
20

# ODD Number while using WHILE LOOP
public class Dp_demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop
		int i=0;
		while(i<=30) {
			System.out.println(i);
			i=i+3;
		}
	}
}
O/p:-
0
3
6
9
12
15
18
21
24
27
30

# Nested If Condition
public class NestedIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=15;
		if(x%2==0) {
			System.out.println("Given number is divisible by 2.");
		}else if(x%3==0) {
			System.out.println("Given number is divisible by 3.");
		}else{
			System.out.println("Given number is not divisible by 2 or 3. ");
		}
	}
}


O/p:-
Given number is divisible by 3.




