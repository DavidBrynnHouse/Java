/** David House
    IS 247
    This program will return the occurences of a digit in a number
    */
import java.util.Scanner;
public class NumberOfDigits
{
   public static void main(String[] args)
   {
      int testDigit;
      int digit;
      String again;
      Scanner scan = new Scanner(System.in);
      Scanner scan1 = new Scanner(System.in);
      
      do
      {
      System.out.println("What number do you want to test? ");
      digit = scan.nextInt();
      
      System.out.println("What number do you want to find? ");
      testDigit = scan.nextInt();
      
      System.out.println("There are " + digits(testDigit, digit) + " " + testDigit + "'s in " + digit);
      System.out.println("Would you like to test anouther number? ");
      again = scan1.nextLine();
      }while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"));
   }
   //This is the method for quiz 9 I put the above main method for testing
   public static int digits(int testDigit, int digit)
   {
      if (testDigit == digit)
         return 1;
      else if (digit <= 9 && testDigit != digit)
         return 0;
      else if (digit > 9)
         if((digit % 10) == testDigit)
            return 1 + digits(testDigit, (digit / 10));
         else
            return 0 + digits(testDigit, (digit / 10));
      return 0;
    }
}
         
      