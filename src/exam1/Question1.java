package exam1;

import java.util.Scanner;

/**
 * 
 * @author Andrew Behncke
 *
 */

public class Question1 {

	/**
	 * Takes user input and prints output
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter price: ");
		double price = scan.nextDouble();
		System.out.print("Enter Customer Loyalty Number: ");
		int cln = scan.nextInt();
		scan.close();
		System.out.println("The discount is " + getDiscount(price, cln));
	}
	
	/**
	 * Returns discount for given price and customer loyalty number
	 * @param price
	 * @param cln
	 * @return percent represented by a double (0.02 == %2)
	 */
	private static double getDiscount(double price, int cln) {
		double discount = 0.02;
		if (cln > 10) {
			discount = 0.1;
		}
		if (cln <= 10 && cln > 5) {
			discount = 0.05;
		}
		return discount;
	}

}