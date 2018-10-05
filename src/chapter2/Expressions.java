// Added package declaration
package chapter2;

public class Expressions
{
   public static void main(String[] args)
   {
      int a = 3;
       int b = 4;
      int c = 5;
      int d = 17;
      //System.out.println((a + b)/ c);
      // 3 and 4 are added with sum 7
      // 7 is divided by 5 with quotient 1
      //System.out.println(a + b / c);
      // 4 is divided by 5 with quotient 0
      // 3 is added to 0 with sum 3
      System.out.println(a++);
      //increments a after it prints. prints 3 then becomes 4.
      System.out.println(a--);
      //decrements a after it prints. prints 4 then becomes 3.
      System.out.println(a + 1);
      //prints a+1. a is currently 3. 3+1=4. it prints 4.
       System.out.println(d % c);
       //prints d mod c. d is 17. c is 5. d mod c is 2. it prints 2.
      System.out.println(d / c);
      //oh god integer division O.O prints 3.
      System.out.println(d % b);
      //d mod b. prints 1.
      System.out.println(d / b);
      //more integer division. prints 4.
      System.out.println(d + a / d + b);
      //order of operations d=17 + (a=3 / d=17) + b=4 => 17 + 0 + 4 => 21
      System.out.println((d + a) / (d + b));
      //see above. 21/20 prints 0.
      System.out.println(Math.sqrt(b));
      //sqrt(b) is square root of 4. takes and returns doubles. prints 2.0
      System.out.println(Math.pow(a, b));
      //a to the power of b. takes and returns doubles. prints 81.0
      System.out.println(Math.abs(-a));
      //prints a. |-a| == a
      System.out.println(Math.max(a, b));
      //prints b. Math.max prints largest of the 2 parameters.
      System.out.println(20 / 21);
   }
}
