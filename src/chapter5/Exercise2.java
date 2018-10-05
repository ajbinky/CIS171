package chapter5;

/**
 * 
 * @author Andrew Behncke
 * 
 * Write the following methods and provide a program to test them.
 * 		a. boolean allTheSame(double x, double y, double z), returning true if the arguments are all the same
 * 		b. boolean allDifferent(double x, double y, double z), returning true if the arguments are all different
 * 		c. boolean sorted(double x, double y, double z), returning true if the arguments are sorted, with the smallest one coming first
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		double x = 512;
		double y = 212;
		double z = 959595;
		
		System.out.println(allTheSame(x, y, z));
		System.out.println(allDifferent(x, y, z));
		System.out.println(sorted(x, y, z));
		
	}
	
	private static boolean allTheSame(double x, double y, double z) {
		if (x == y && y == z)
			return true;
		return false;
	}
	
	private static boolean allDifferent(double x, double y, double z) {
		if (x - y != 0 || x - z != 0)
			return true;
		return false;
	}
	
	private static boolean sorted(double x, double y, double z) {
		if (x < y && y < z)
			return true;
		return false;
	}

}
