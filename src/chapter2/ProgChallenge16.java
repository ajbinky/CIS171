package chapter2;

/**
 * 
 * @author Andrew Behncke
 *
 */

public class ProgChallenge16 {

	public static void main(String[] args) {
		
		int input = 166647935;
		String output = "";
		
		String s = Integer.toString(input);
		
		for (int i = 0; i < s.length(); i++) {
			output += s.charAt(i) + " ";
		}
		
		output = output.substring(0, output.length()-1);
	
		System.out.println(output);
	}

}
