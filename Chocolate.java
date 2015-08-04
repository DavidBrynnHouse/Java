public class Chocolate
{
  public static int breakChocolate(int n, int m) 
  {
    int o;
    if (n >= 2)
    {
     o = 1 + breakChocolate(n - 1, m);
     return o * m;
    }
    else
      return 0;
  }
  public static void main(String[] kg)
  {
      int breaks = breakChocolate(5, 5);
      System.out.print(breaks);
  }
}