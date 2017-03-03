package codeguide;

import java.util.Scanner;

/**
 * This is the example of duplicate codes.
 * This class shows result of calculating the same 2 numbers in difference calculation methods.
 * @author Pappim Pipatkasrira
 * @version 1.0
 * @since Mar 3, 2017
 */

public class DRY {
	
	/**
	 * All the method have some duplicate class.
	 * Please create new method to seperate the duplicate codes.
	 */
	
	//TODO Create new method to seperate the duplicate codes.

	/**
	 * This methods for plus two numbers.
	 */
	public void plus(){
		Scanner input = new Scanner(System.in);
		System.out.print("First Number:");
		int number = input.nextInt();
		System.out.print("Second Number:");
		int number2 = input.nextInt();
		int answer = number + number2;
	}
	
	/**
	 * This methods for minus two numbers.
	 */
	public void minus(){
		Scanner input = new Scanner(System.in);
		System.out.print("First Number:");
		int number = input.nextInt();
		System.out.print("Second Number:");
		int number2 = input.nextInt();
		int answer = number - number2;
	}
	
	/**
	 * This methods for multiply two numbers.
	 */
	public void multiply(){
		Scanner input = new Scanner(System.in);
		System.out.print("First Number:");
		int number = input.nextInt();
		System.out.print("Second Number:");
		int number2 = input.nextInt();
		int answer = number * number2;
	}
	
}