//WAP to accept l & B from user and calculate AR and PR

import java.util.*;
class sec_assn02 {
	public static void main(String args[]) {
		int l, b, area, peri;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter length of the rectangle= ");
		l = num.nextInt();
		System.out.print("Enter breadth of the rectangle= ");
		b = num.nextInt();
		
		area = l * b;
		peri = 2*( l + b);
		
		System.out.println("Area of rectangle is= " +area);
		System.out.println("Perimeter of rectangle is= " +peri);
	}
}