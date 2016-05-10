package rectangle;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the sides of the rectangle:");
		double decimalNumber = input.nextDouble();
		System.out.println("And the other one:");
		double anotherNumber = input.nextDouble();
		
		System.out.println("The area of the rectangle is:");
		System.out.println(decimalNumber*anotherNumber);

	}

}
