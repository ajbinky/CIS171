package chapter2;

public class Substrings {
	
	public static void main(String[] args) {
		String inputString = "The quick brown fox jumps over the lazy dog";
//		String testing = "0123456789*123456789*123456789*123456789*12";
		String outputString;
		
		outputString = inputString.substring(0, 1);
		outputString += inputString.substring(2, 3);
		outputString += inputString.substring(22, 24);
		outputString += inputString.substring(21, 22);
		outputString += inputString.substring(24, 25);
		outputString += inputString.substring(3, 4);
		outputString += inputString.substring(16, 17);
		outputString += inputString.substring(21, 22);
		outputString += inputString.substring(42);
		outputString += inputString.substring(6, 7);
		outputString += inputString.substring(0, 1).toLowerCase();
				
//		System.out.println(inputString);
//		System.out.println(testing);
//		System.out.println();
		System.out.println(outputString);
	}
	
}
