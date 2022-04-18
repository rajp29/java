//WAP to accept SP and CP from user and display the result

import java.util.*;
class sec_assn03 {
	public static void main(String args[]) {
		int sp, cp, prof;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter selling price= ");
		sp = num.nextInt();
		System.out.print("Enter cost price= ");
		cp = num.nextInt();
		
		prof = sp - cp;
		
		System.out.println("Profit is " +prof);
	}
}