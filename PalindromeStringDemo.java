import java.io.*;
public class PalindromeStringDemo
{
    public static void main(String[] args)throws IOException
    {//String to check
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String strToTest=in.readLine();
        int i;
        int n=strToTest.length();
        String reversedString="";
        for(i=n-1;i>=0;i--)
            reversedString=reversedString + strToTest.charAt(i);
            if(strToTest.equals(reversedString))
                System.out.println(strToTest+ " is a palindrome");
                else
                System.out.println(strToTest+ " is not a palindrome");
    }
}