package chapter4;

import java.util.Scanner;

public class ProgExercise16 {
	
	public static void main(String[] args) {
		
		System.out.print("Enter number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int x=1;
		int y=1;
		int z=0;
		
		for (int i = 0; i < n; i++) {
			z = x + y;
			y = x;
			x = z;
		}
		
		System.out.println(x);
		
	}

	
	
}
