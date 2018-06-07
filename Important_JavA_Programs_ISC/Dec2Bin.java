package Important_JavA_Programs_ISC;

/**
* The class Dec2Bin inputs a Decimal number and converts it into its equivalent Binary number
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/

import java.io.*;
class Dec2Bin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());

        int r;
        String s=""; //variable for storing the result

        char dig[]={'0','1'}; //array storing the digits (as characters) in a binary number system

        while(n>0)
            {
                r=n%2; //finding remainder by dividing the number by 2
                s=dig[r]+s; //adding the remainder to the result and reversing at the same time
                n=n/2;
            }
        System.out.println("Output = "+s);
    }
}


// Source: http://www.javaforschool.com/331571-program-on-decimal-to-binary-number-conversion/#ixzz3R5dpx7wI
