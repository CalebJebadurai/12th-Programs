package Important_JavA_Programs_ISC;

/**
* The class TimeInWords_ISC2003 inputs hours & minutes and then prints out the time they represent, in words
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2003, Question 2
*/
 
import java.io.*;
public class TimeInWords_ISC2003
{  
    public static void main(String args[])throws IOException
    {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
        /* Inputting hours and minutes */
        System.out.print("Enter Hours : ");
        int h=Integer.parseInt(br.readLine());
        System.out.print("Enter Minutes : ");
        int m=Integer.parseInt(br.readLine());
         
        if((h>=1 && h<=12) && (m>=0 && m<=59)) // checking whether given input is legal or not.
        {
         /* creating an array containing numbers from 1-29 in words */
 
        String words[]={"", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine","Ten",
        "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen",
        "Twenty","Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five",
        "Twenty six","Twenty seven","Twenty eight", "Twenty nine"};
          
         /* The below code is for finding whether to print the word 'minute' or 'minutes' */
         String plu, a;
         if(m == 1)
            plu = "Minute";
         else
            plu = "Minutes";
          
         /* When we have minutes from 31-59, we print the hour ahead of the given hour
          * like 6:55 will be 5 minutes to 7 and not 5 minutes to 6
          * when we print the hour ahead of the given hour, we face a problem at hour = 12
          * because if we print an hour ahead of 12, it will be thirteen, but we want 1
          * so the below code checks this & decides what hour to print in words when minutes is from 31-59
          */
         if(h==12)
            a = words[1]; //storing 'one' when hour is 12
         else
            a = words[h+1]; //if hour is not 12, then storing in words, an hour ahead of given hour
             
        /* The below code checks minutes and accordingly prints the time in words using array. */
         System.out.print("Output : "+h+":"+m+" ----- "); //printing the given time in numbers
 
         if(m==0)
            System.out.println(words[h]+" O' clock");
         else if(m==15)
            System.out.println("Quarter past "+words[h]);
         else if(m==30)
            System.out.println("Half past "+words[h]);
         else if(m==45)
            System.out.println("Quarter to "+a);
         else if(m<30) // condition for minutes between 1-29
            System.out.println(words[m]+" "+plu+" past "+words[h]);
         else // condition for minutes between 31-59
            System.out.println(words[60-m]+" "+plu+" to "+a);
        } //end of outer if
 
        else
            System.out.println("Invalid Input !"); //printing error message for illegal input
    }
}

//Source: http://www.javaforschool.com/553891-program-to-print-a-given-time-in-words-isc-practical-2003/#ixzz3R5ajZEGv
