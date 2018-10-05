package chapter2;

public class AverageCalculator
{
   public static void main(String[] args)
   {
      int age1 = 18;
      int age2 = 35;
      int age3 = 50;
      int age4 = 44;

      /**
       * This was the one that was given to me.
       * It doesn't work because all of the numbers are integers.
       * It does the entire calculation thinking everything is going to be an int
       * so it drops everything past the decimal. THEN it gets converted to a double.
       * At this point, the number is just 36. So when it gets turned into a double,
       * it makes it 36.0. It prints 36.0
       */
      //double averageAge = (age1 + age2 + age3 + age4) / 4;
      /**
       * Just cast it to a double and its golden.
       */
      double averageAge = (double) (age1 + age2 + age3 + age4) / 4;
      System.out.println(averageAge);
   }
}