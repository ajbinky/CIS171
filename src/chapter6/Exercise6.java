package chapter6;

/**
 * 
 * @author Andrew Behncke
 * 
 * Calculates and prints the alternating sum of integers in arr[]
 * 
 */
public class Exercise6 {

	public static void main(String[] args) {
		int[] arr = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		System.out.println(alternatingSum(arr));
	}
	
	public static int alternatingSum(int[] arr) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				x += arr[i];
			} else {
				x -= arr[i];
			}
		}
		return x;
	}

}
