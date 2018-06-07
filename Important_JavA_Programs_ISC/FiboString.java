package Important_JavA_Programs_ISC;/**
* The class FiboString prints the sequence of fibonacci strings
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
* @Question Year : ISC 2014 Question 10 (Theory)
*/
 
import java.io.*;
class FiboString
{
    String x,y,z;
    int n;
     
    FiboString() // Constructor
    {
        x = "a";
        y = "b";
        z = "ba"; // mentioned in the question otherwise not required. z = "" is sufficient
    }
     
    void accept()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the number of terms : ");
        n = Integer.parseInt(br.readLine());
    }
     
    void generate()
    {
        System.out.print("\nThe Fibonacci String Series is : ");
        if(n <= 1) // If no of terms is less than or equal to 1
            System.out.print(x);
        else // If no of terms is more than or equal to 2
        {
            System.out.print(x+", "+y);
            for(int i=3; i<=n; i++)
            {
                z = y+x;
                System.out.print(", "+z);
                x = y;
                y = z;
            }
        }
    }
     
    public static void main(String args[]) throws IOException
    {
        FiboString ob = new FiboString();
        ob.accept();
        ob.generate();
    }
}

//Source: http://www.javaforschool.com/1919992-isc-2014-question-10-theory-paper-solved-fibonacci-string/#ixzz3R5KncSM1