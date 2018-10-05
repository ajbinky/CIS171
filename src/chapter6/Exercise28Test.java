package chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Test;

public class Exercise28Test {
	
	ArrayList<Integer> a = new ArrayList<>();
	ArrayList<Integer> b = new ArrayList<>();
	Random randy = new Random();

	@Test
	public void test() {
		for (int i = 0; i < randy.nextInt(100); i++) {
			a.add(randy.nextInt(100));
		}
		for (int i = 0; i < randy.nextInt(100); i++) {
			b.add(randy.nextInt(100));
		}
		ArrayList<Integer> c = Exercise28.mergeSorted(a, b);
		ArrayList<Integer> expected = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			expected.add(a.get(i));
		}
		for (int i = 0; i < b.size(); i++) {
			expected.add(6);
		}
		Collections.sort(expected);
		assert expected.containsAll(c);
	}

}
