package chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Andrew Behncke
 *
 */

public class ProgExercise2 {
	
	static String input = "";
	static String output = "";

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input file name: ");
		input = scan.next();
		System.out.print("Enter output file name: ");
		output = scan.next();
		scan.close();
		
		File inFile = new File(input);
		File outFile = new File(output);
		PrintWriter pw = new PrintWriter(outFile);
		int line = 1;
		
		scan = new Scanner(inFile);
		while (scan.hasNextLine()) {
			pw.println("/* " + line + " */ " + scan.nextLine());
			line++;
		}
		pw.close();
		scan.close();
	}

}
