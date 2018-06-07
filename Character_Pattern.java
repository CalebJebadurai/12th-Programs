import java.util.Scanner;
 
class Character_Pattern
{
   public static void main(String args[])
   {
      int n, number = 0, c, d;
      char ch = 'A';
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows");
      n = in.nextInt();
 
      for ( c = 1 ; c <= n ; c++ )
      {
         for ( d = 1 ; d <= c ; d++ )
         {
            System.out.print((char)(64 + c));
	    ch++;	
         }
         ch = 'A'; 	
         System.out.println();
      }
   }
}