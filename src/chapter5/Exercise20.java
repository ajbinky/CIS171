package chapter5;

/**
 * 
 * @author Andrew Behncke
 *
 * <i>Leap years.</i> Write a method
 * 		<code>public static boolean isLeapYear(int year)</code>
 * that tests whether a year is a leap year: that is, a year with 366 days. Exercise P3.28
 * describes how to test whether a year is a leap year. In this exercise, use multiple <code>if</code>
 * statements and <code>return</code> statements to return the result as soon as you know it.
 *
 */

public class Exercise20 {

	public static void main(String[] args) {
		
		System.out.println(leapYear(1997));
		
	}
	
	/**
	 * Tests if the year given was a leap year or not.
	 * @param year
	 * 		The year being tested
	 * @return
	 * 		true if year given was a leap year, otherwise returns false
	 */
	public static boolean leapYear(int year) {
		if (year % 400 == 0) {
			return true;
		}
		if (year % 100 == 0) {
			return false;
		}
		if (year % 4 == 0) {
			return true;
		}
		return false;
	}

}
