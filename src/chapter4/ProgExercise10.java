package chapter4;

import java.util.Scanner;

public class ProgExercise10 {
	
	static String vowels = "aeiouy";
	static int count;

	public static void main(String[] args) {
		System.out.print("Enter a word: ");
		Scanner scan = new Scanner(System.in);
		String word = scan.next().toLowerCase();
		scan.close();
		for (int i = 0; i < word.length(); i++) {
			if(vowels.contains(Character.toString(word.charAt(i)))) {
				count++;
			}
		}
		System.out.println(count + " vowels.");
	}

}
