package chapter3;

/**
 * 
 * @author Andrew Behncke
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * Takes input from user: [a, 2-10, j, q, or k][c, s, h, or d]
 * Prints what the card value of that input would be (Queen of Spades.)
 *
 */
public class ProgChallenge14 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the card notation: ");
		String s = scan.next().toLowerCase();
		Pattern p = Pattern.compile("(\\d{1,2}|[ajqk])([hdsc])");
		scan.close();
		Matcher m = p.matcher(s);
		m.find();
		System.out.println(buildString(m.group(1), m.group(2)));
	}
	
	private static String buildString(String first, String second) {
		String ret = "";
		switch(first) {
		case "a":
			ret += "Ace of ";
			break;
		case "j":
			ret += "Jack of ";
			break;
		case "q":
			ret += "Queen of ";
			break;
		case "k":
			ret += "King of ";
			break;
		default:
			ret += first + " of ";
			break;
		}
		switch(second) {
		case "h":
			ret += "Hearts.";
			break;
		case "d":
			ret += "Diamonds.";
			break;
		case "s":
			ret += "Spades.";
			break;
		case "c":
			ret += "Clubs.";
			break;
		}
		return ret;
	}
	
	

}
