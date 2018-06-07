import java.io.*;
class Palindrome1
{
    public static void main(String args[])throws IOException
    {
        try
        {
            int flag;
            do 
            {
                BufferedReader cab=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ENTER A NUMBER TO CHECK PALINDROME");
                int num = Integer.parseInt(cab.readLine());
                int n = num;
                int reverse=0,remainder;
                while(num > 0)
                {
                    remainder = num % 10;
                    reverse = reverse * 10 + remainder;
                    num = num / 10;
                }
                if(reverse == n)
                System.out.println(n+" is a Palindrome Number");
                else
                System.out.println(n+" is not a Palindrome Number");
                System.out.println("");
                System.out.println("PRESS '1' TO TERMINATE THE PROGRAM.");
                System.out.println("           OR");
                System.out.println("PRESS '0' TO TRY AGAIN");
                flag=Integer.parseInt(cab.readLine());  
                {   
                    if(flag==0)
                    {
                        System.out.println("****************************************************");
                        System.out.println("****************************************************");
                        System.out.print("RE");
                    }
                    else
                    {
                        System.out.println("THE PROGRAM IS SUCCESSFULLY TERMINATED");
                    }
                }
            }while(flag==0);
        }catch(Exception e){}
    }
}