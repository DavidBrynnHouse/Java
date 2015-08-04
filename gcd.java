public class gcd
{
   public static void main(String[] args)
   {
      System.out.print(Integer.bitCount(GCD(25, 5)));
   }
   public static int GCD(int a, int b) 
   { 
      return b==0 ? a : GCD(b, a%b); 
   }
}