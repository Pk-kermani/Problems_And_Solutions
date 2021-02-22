import java.util.Scanner;

public class TakesTwoNumbersAsInputAndDisplayProductOfTwoNumbers {

	public static void main(String[] args) {
		// Write a Java program that takes two numbers as input and display the product
		// of two numbers.
		// Test Data:Input first number: 25 Input second number: 5
		// Expected Output : 25 x 5 = 125

		Scanner in = new Scanner(System.in);
		System.out.println("Input first number: ");
		int num1 = in.nextInt();
		System.out.println("Input second number: ");
		int num2 = in.nextInt();
		int product = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + product);
		in.close();
		
		
	}

}
