package chapter4;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		
		System.out.println("totalSumFor: " + totalSumFor(x));
		System.out.println("totalSumWhile: " + totalSumDoWhile(x));
	}
	
	private static int totalSumFor(int x) {
		int total = 0;
		for (int i = 0; i <= x; i++) {
			total += i;
		}
		return total;
	}
	
	private static int totalSumDoWhile(int x) {
		int total = 0;
		int count = 0;
		
		do {
			total += count;
			count++;
		} while (count <= x);
		return total;
	}

}