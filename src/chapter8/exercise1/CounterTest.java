package chapter8.exercise1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Andrew Behncke
 * 
 * Unit tests for the Counter class
 * 
 */
public class CounterTest {
	
	Counter count;
	
	@Before
	public void setup() {
		count = new Counter();
	}
	
	@Test
	public void testExercise1() {
		for(int i = 0; i < 42; i++) {
			count.count();
		}
		count.undo();
		assertTrue("Undo didn't produce correct result", count.getValue() == 41);
		count.undo();
		count.undo();
		assertTrue("Undo didn't produce correct result", count.getValue() == 39);
		for (int i = 0; i < 100; i++) {
			count.undo();
		}
		assertTrue("\"Make sure that the operator cannot click the undo button more often than the count button\"", count.getValue() == 0);
	}
	
	@Test
	public void testExercise2() {
		count.setLimit(17);
		for (int i = 0; i < 1000; i++) {
			count.count();
		}
		assertTrue("Upper limit not functioning correctly - Expected: 17  Actual: " + count.getValue(), count.getValue() == 17);
		count.undo();
		count.count();
		assertTrue("Upper limit not functioning correctly - Expected: 17  Actual: " + count.getValue(), count.getValue() == 17);
	}

}
