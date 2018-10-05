package chapter5;

/**
 * 
 * @author Andrew Behncke
 * 
 * Write the following methods.
 * 		a. int firstDigit(int n), returning the first digit of the argument
 * 		b. int lastDigit(int n), returning the last digit of the argument
 * 		c. int digits(int n), returning the number of digits of the argument
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		int i = 823755;
		
		System.out.println(firstDigit(i));
		System.out.println(lastDigit(i));
	}
	
	private static int firstDigit(int n) {
		return Integer.parseInt(Character.toString(Integer.toString(n).charAt(0)));
	}
	
	private static int lastDigit(int n) {
		return n%10;
	}

}
