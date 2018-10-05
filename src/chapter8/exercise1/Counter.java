package chapter8.exercise1;

/**
 * 
 * @author Andrew Behncke
 *
 * This class models a tally counter.
 *
 */
public class Counter {
	private int value;
	private int limit;
	
	/**
	 * I added a constructor
	 */
	public Counter() {
		this.value = 0;
		this.limit = Integer.MAX_VALUE;
	}

	/**
	 * Gets the current value of this counter.
	 * 
	 * @return the current value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Advances the value of this counter by 1.
	 */
	public void count() {
		if (value == limit) {
			System.out.println("Limit exceeded");
		} else {
			value = value + 1;
		}
	}

	/**
	 * Resets the value of this counter to 0.
	 */
	public void reset() {
		value = 0;
	}
	
	/**
	 * Decreases value of this counter by 1, with a minimum of 0.
	 */
	public void undo() {
		value = Math.max(0, value - 1);
	}

	/**
	 * Sets upper limit allowed on counter value.
	 * @param i
	 * 		Upper limit allowed on counter value
	 */
	public void setLimit(int i) {
		limit = i;
	}
}
