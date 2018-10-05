package chapter3;

/**
 * 
 * @author Andrew Behncke
 *
 */

import java.util.Scanner;

/**
 * 
 * Takes input from user: [1-12]
 * Prints how many days are in x month
 *
 */

public class ProgChallenge27 {

	static Integer month[] = {31, null, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a month: ");
		int x = scan.nextInt();
		scan.close();
		x -= 1;
		if (x == 1) {
			System.out.println("28 or 29 days.");
		} else {
			x = month[x];
			System.out.println(x + " days.");
		}
	}

}
