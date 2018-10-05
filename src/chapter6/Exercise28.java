package chapter6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Andrew Behncke
 *
 * Merges 2 sorted ArrayLists into one and prints the sorted one
 * 
 */
public class Exercise28 {

	public static void main(String[] args) {
		// Begin arraylist initializing
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter list of ints separated by spaces (a): ");
		String[] sa = scan.nextLine().split(" ");
		for (String s : sa) {
			a.add(Integer.parseInt(s));
		}
		System.out.print("Enter list of ints separated by spaces (b): ");
		String[] sb = scan.nextLine().split(" ");
		for (String s : sb) {
			b.add(Integer.parseInt(s));
		}
		scan.close();
		// End arraylist initializing
		
		// Print arrayList
		ArrayList<Integer> c = mergeSorted(a, b);
		for (int i : c) {
			System.out.print(i + " ");
		}
	}
	
	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
		/*
		for (int i = 0; i < b.size(); i++) {
			a.add(b.get(i));
		}
		Collections.sort(a);
		return a;
		*/
		int ac = 0;
		int bc = 0;
		int z = 0;
		ArrayList<Integer> c = new ArrayList<>();
		while (ac < a.size() || bc < b.size()) {
			if(ac == a.size()) {
				z = 1;
			} else if (bc == b.size())
			{
				z = -1;
			} else {
				z = a.get(ac).compareTo(b.get(bc));
			}
			if (z <= 0) {
				c.add(a.get(ac));
				ac++;
			} else {
				c.add(b.get(bc));
				bc++;
			}
		}
		return c;
	}

}
