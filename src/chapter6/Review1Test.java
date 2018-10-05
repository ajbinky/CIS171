package chapter6;

public class Review1Test {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i%5;
		}
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		
	}

}
