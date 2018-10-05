package chapter5;

/**
 * 
 * @author Andrew Behncke
 * 
 * Write the following methods and provide a program to test them.
 * 		a. double smallest(double x, double y, double z), returning the smallest of the arguments
 * 		b. double average(double x, double y, double z), returning the average of the arguments
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		double x = 512;
		double y = 212;
		double z = 959595;
		
		System.out.println("Smallest number out of 512, 212, and 959595 is " + smallest(x, y, z));
		System.out.println("Average of those same numbers is " + average(x, y, z));
	}
	
	/**
	 * Returns the smallest of the 3 parameters.
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 * 		Smallest number.
	 */
	private static double smallest(double x, double y, double z) {
		return Math.min(Math.min(x, y), z);
	}
	
	/**
	 * Returns the average of the 3 parameters.
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 * 		Average of parameters.
	 */
	private static double average(double x, double y, double z) {
		return (x + y + z)/3;
	}

}
