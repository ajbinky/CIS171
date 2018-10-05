package chapter4;

public class ProgExercise19 {

	public static void main(String[] args) {
		int output[][] = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				output[j][i] = (i+1)*(j+1);
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(output[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
