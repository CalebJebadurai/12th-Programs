package Important_JavA_Programs_ISC;

/**
* The class Sent_Merge_Rev inputs multiple sentences and prints the words in reverse order
* without any punctuation marks other than blanks
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/

import java.io.*;
import java.util.*;
class Sent_Merge_Rev
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of sentences: "); //inputting the number of sentences to accept
        int n = Integer.parseInt(br.readLine());
        String s = "";

        for(int i=1; i<=n; i++)
        {
            System.out.print("Enter Sentence "+i+": ");
            s = s + br.readLine(); //inputting multiple sentences and joining them in the same String
        }
        
        //converting the sentence into StringTokenizer giving the given punctuation marks

        StringTokenizer str=new StringTokenizer(s," '.,;:!?");
        int c=str.countTokens();

        String w="", rev="";
        for(int i=1; i<=c; i++)
        {
            w = str.nextToken(); //extracting one word at a time
            rev = w+" "+rev; //joining the extracted words in reverse order
        }
        
        System.out.println("Output: "+rev);
    }
}


//Source: http://www.javaforschool.com/534584-program-to-input-multiple-sentences-and-reverse-it-without-punctuation-marks/#ixzz3R5bSXEvK
