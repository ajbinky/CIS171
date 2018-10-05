package chapter5;

/**
 * 
 * @author Andrew Behncke
 * 
 * Write a method <code>public static String middle(String str)</code>
 * that returns a string containing the middle character in str if the
 * length of str is odd, or the two middle characters if the length is
 * even. For example, <code>middle("middle")</code> returns "dd".
 *
 */

public class Exercise4 {

	public static void main(String[] args) {
		String middle = "middle";
		System.out.println(middle(middle));
	}
	
	public static String middle(String str) {
		if (str.length() % 2 != 0) {
			return str.substring(str.length()/2, str.length()/2+1);
		} else {
			return str.substring(str.length()/2-1, str.length()/2+1);
		}
	
	}

}
