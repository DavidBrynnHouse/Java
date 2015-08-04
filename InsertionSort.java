public class InsertionSort
{
   public static void main(String[] args)
   {
      int[] A = {2, 5, 5, 6, 3, 8, 9, 3, 6, 7};
      insertion(A);
      
   }
   public static void insertion(int[] a)
   {
      int temp;
      
      for( int j = 1; j < a.length - 1; j++)
      {  
         temp = a[j];
         
         for(int i = j - 1; j >= 0 && temp < a[j]; j--)
            a[j + i] = a[j];
         a[j + 1] = temp;
      }
      for(int e: a)
         System.out.println(e);
   }
}
            