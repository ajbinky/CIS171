package chapter4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			int x = scan.nextInt();
			System.out.println("Entered: " + x);
			if (x % 2 == 0) {
				System.out.println(x + "is odd");
				odd++;
			} else {
				System.out.println(x + "is even");
				even++;
			}
		}
		scan.close();
		System.out.println("Done.");
		System.out.println("Odds: " + odd);
		System.out.println("Evens: " + even);
	}

}
