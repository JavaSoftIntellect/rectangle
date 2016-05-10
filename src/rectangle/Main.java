package rectangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter 'a':");
		Scanner input = null;
		double decimalNumber = input.nextInt();
        
        System.out.println("Please enter 'b':");
        double anotherNumber = input.nextInt();
        
        System.out.println("The area of the rectangle is:");
        System.out.println(decimalNumber*anotherNumber);
	}

}
