package chapter4;

import java.util.Scanner;

public class ProgExercise20 {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		StringBuffer output = new StringBuffer();
		String stars = new String(new char[x]).replace('\0', '*');
		String spaces = new String(new char[x-2]).replace('\0', ' ');
		
		output.append(stars + ' ' + stars + '\n');
		for (int i = 0; i < x-2; i++) {
			output.append(stars + " *" + spaces + "*\n");
		}
		output.append(stars + ' ' + stars + "\n");
		
		System.out.println(output.toString());
	}

}
