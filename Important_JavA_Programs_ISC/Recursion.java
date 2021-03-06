package Important_JavA_Programs_ISC;

/**
* The class Recursion prints the Fibonacci Series upto 'n' terms using the concept of Recursion
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Theory 2005 Question 12
*/

import java.io.*;
class Recursion
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b,c,limit;
Recursion() //Constructor
    {
     a=0;
     b=1;
     c=0;
     limit=0;
    }

void input()throws IOException //Function to input the limit
    {
     System.out.print("Enter the limit : ");
     limit=Integer.parseInt(br.readLine());
    }

int fib(int n) //Recursive function generating the 'nth' term of Fibonacci Series
    {
    if(n<=1)
    return a;
    else if(n==2)
    return b;
    else
    return (fib(n-1)+fib(n-2));
    }

void generate_fibseries() //Function generating all the Fibonacci Series numbers upto 'n' terms
    {
        System.out.println("The Fibonacci Series is:");
        for(int i=1;i<=limit;i++)
        {
            c=fib(i);
            System.out.print(c+"  ");
        }
    }

public static void main(String args[])throws IOException
  {
   Recursion ob=new Recursion();
   ob.input();  
   ob.generate_fibseries();
  }
}


// Source: http://www.javaforschool.com/351450-question-12-isc-2005-solved-fibonacci-series-using-recursion/#ixzz3R5d6M0Iw
