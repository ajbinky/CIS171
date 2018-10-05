package chapter8.exercise13;

/**
 * 
 * @author Andrew Behncke
 * 
 * Moth class as described in Programming Exercise 8.13
 * 
 */
public class Moth
{
  private double position;

  public Moth(double initialPosition)
  {
    this.position = initialPosition;
  }
  
  public double getPosition() {
    return position;
  }
  
  public void moveToLight(double lightPosition) {
    position = ((lightPosition - position) / 2) + position;
  }
}
