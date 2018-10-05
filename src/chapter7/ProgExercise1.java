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

public class ProgExercise1 {
	
	static String fileName = "hello.txt";
	static String outputText = "Hello, World!";
	static File f = new File(fileName);
	static String readFileText = "";

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter(f);
		pw.println(outputText);
		pw.close();
		
		Scanner scan = new Scanner(f);
		readFileText = scan.nextLine();
		scan.close();
		System.out.println(readFileText);
	}

}
