package chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FloatFileGenerator {
	
	static Random randy;

	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Enter number of floats to add to each column: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.print("Enter file name: ");
		String fileName = scan.next();
		
		scan.close();
		
		File file = new File(fileName);
		PrintWriter pw = new PrintWriter(file);
		randy = new Random();
		
		for (int i = 0; i < x; i++) {
			float f = randy.nextFloat();
			pw.print(f + " ");
			f = randy.nextFloat();
			pw.print(f + "\n");
		}
		
		pw.close();
		
	}

}
