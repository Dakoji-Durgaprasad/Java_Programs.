import java.util.*;
public class ArithmaticOperators {
	public static void main(String[] args) {
		double num1; 
		double num2;
		char Oper;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num1 = sc.nextDouble();
		System.out.println("Enter an Operator(+,-,*,/): ");
		Oper = sc.next().charAt(0);
		System.out.println("Enter a number: ");
		num2 = sc.nextDouble();
		
		switch(Oper) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Enter a valid Operator..");
		}
		
	}
}
