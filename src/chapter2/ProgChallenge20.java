package chapter2;

/**
 * 
 * @author Andrew Behncke
 *
 */

import java.util.ArrayList;

public class ProgChallenge20 {

	public static void main(String[] args) {
		
		ArrayList<String> lines = new ArrayList<>();
		
		lines.add("			    _\\/_");
		lines.add("			     /\\");
		lines.add("			     /\\");
		lines.add("			    /  \\");
		lines.add("			    /~~\\o");
		lines.add("			   /o   \\");
		lines.add("			  /~~*~~~\\");
		lines.add("			 o/    o \\");
		lines.add("			 /~~~~~~~~\\~`");
		lines.add("			/__*_______\\");
		lines.add("			     ||");
		lines.add("			   \\====/");
		lines.add("			    \\__/");
		
		for (String line : lines) {
			System.out.println(line);
		}
		
	}

}
