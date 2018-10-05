package chapter4;

import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number, 0 to quit: ");
		int n = in.nextInt();
		in.close();

//		int i = 1;
//		while (n * n > Math.pow(2, i)) {
//			i++;
//		}
		
		int i = 0;
		for (int x = 1; n*n > Math.pow(2, x); x++) {
			i = x;
		}
		i++;

		System.out.println("2 raised to " + i + " is the first power of two greater than " + n + " squared");
	}
}
