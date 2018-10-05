package chapter6;

import java.util.Random;

/**
 * 
 * @author Andrew Behncke
 * 
 * Write a program that initializes an array with ten random integers and then prints
 * four lines of output, containing
 * 		<ul>
 * 			<li>Every element at an even index.</li>
 * 			<li>Every even element.</li>
 * 			<li>All elements in reverse order.</li>
 * 			<li>Only the first and last element.</li>
 * 		</ul>
 * 
 */

public class Exercise1 {
	
	static Random randy;
	static int ints[];

	public static void main(String[] args) {
		randy = new Random();
		ints = new int[10];
		
		for (int i = 0; i < ints.length; i++) {
			ints[i] = randy.nextInt(/*100*/); // Looks much nicer if you put in a bound for nextInt()
		}
		
		/* Used this for testing to make sure everything worked.
		for (int i : ints) {
			System.out.print(i + " ");
		}
		System.out.println();
		*/
		
		/**
		 * Every element at an even index.
		 */
		for (int i = 0; i < ints.length; i+=2) {
			System.out.print(ints[i] + "\t");
		}
		
		System.out.println();
		
		/**
		 * Every even element.
		 */
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] % 2 == 0) {
				System.out.print(ints[i] + "\t");
			}
		}
		
		System.out.println();
		
		/**
		 * All elements in reverse order.
		 */
		for (int i = ints.length-1; i >= 0; i--) {
			System.out.print(ints[i] + "\t");
		}
		
		System.out.println();
		
		/**
		 * Only the first and last element.
		 */
		System.out.println(ints[0] + "\t" + ints[9]);
		
	}

}
