//WAP to accept two no from user and find out add,sub,mul,div,mod 

import java.util.*;
class second_assn01 {
	public static void main(String args[]) {
		int num1, num2, add, sub, mul, div;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter first number =");
		num1 = num.nextInt();
		System.out.print("Enter second number =");
		num2 = num.nextInt();
		
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		
		System.out.println("Addition of " +num1+ " & " +num2+ " is="+add);
		System.out.println("Subtraction of " +num1+ " & " +num2+ " is="+sub);
		System.out.println("Multipilcation of " +num1+ " & " +num2+ " is="+mul);
		System.out.println("Division of " +num1+ " & " +num2+ " is="+div);
	}
}