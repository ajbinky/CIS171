package chapter8.exercise1;

/**
 * 
 * @author Andrew Behncke
 *
 */
public class CounterMain {

	public static void main(String[] args)
	   {
	      Counter tally = new Counter();
	      tally.count();
	      tally.count();
	      int result = tally.getValue();
	      System.out.println("Value: " + result);
	      tally.count();
	      tally.count();
	      result = tally.getValue();
	      System.out.println("Value: " + result);
	   }

}
