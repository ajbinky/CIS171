// Added package declaration
package chapter2;

public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      // could cast these to int and divide, or call math.floor then cast that to int.
      int completelyFilledJars = (int) Math.floor(milk / jarCapacity);
      
      //int completelyFilledJars = milk / jarCapacity;
      
      System.out.println(completelyFilledJars);
   }
}
