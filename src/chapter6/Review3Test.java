package chapter6;

public class Review3Test {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
		
		for (int i = 1; i < 5; i++) { a[i] = a[9-i]; }
		
		System.out.print("{ ");
		for (int i : a) { System.out.print(i + " "); }
		System.out.println("}");
	}

}
