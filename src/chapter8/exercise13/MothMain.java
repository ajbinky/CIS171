package chapter8.exercise13;

/**
 * 
 * @author Andrew Behncke
 * 
 * Main method for Moth class as described in Programming Exercise 8.13
 * 
 */
public class MothMain
{

  public static void main(String[] args)
  {
    Moth jerry = new Moth(0);
    jerry.moveToLight(10);
    System.out.println("5 | " + jerry.getPosition());
    jerry.moveToLight(2);
    System.out.println("3.5 | " + jerry.getPosition());
    jerry.moveToLight(-3.5);
    System.out.println("0 | " + jerry.getPosition());
    jerry.moveToLight(Double.MAX_VALUE);
    System.out.println("Double.halfmaxvalue? | " + jerry.getPosition());
  }

}
