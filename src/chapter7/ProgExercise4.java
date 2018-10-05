package chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Andrew Behncke
 *
 */

public class ProgExercise4 {
	
	static String inputFileName = "";
	static File inputFile;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input file name: ");
		inputFileName = scan.next();
		scan.close();
		
		inputFile = new File(inputFileName);
		
		scan = new Scanner(inputFile);
		while (scan.hasNext()) {
			float f1 = scan.nextFloat();
			float f2 = scan.nextFloat();
			System.out.println((f1 + f2) / 2);
		}
		scan.close();
		
	}

}
