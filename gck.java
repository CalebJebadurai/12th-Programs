import java.io.*;
public class DriverBuggy
    {
        public static void main(String args[]) throws IOException
        {
            Buggy app;
            app = new Buggy();
            app.appMain();
        } // end of main()
    } // end of class Driver
    class Buggy
    {
        /* Instance Data Declarations */
        BufferedReader stdin;   // define stdin
        int firstVar, secondVar, thirdVar;
        /* appMain method calls for initialization, processing, output */
        public void appMain() throws IOException;
        {
            stdin = new BufferedReader
            (new InputStreamReader(System.in));
            // create input string object
            FirstVar = 11;
            secondVar = 22;
            thirdVar = 33;
            while(firstVar < 18)
            {
                System.out.println("Calling the calc method.");
                calc();
            }
        }   // end of appMain()
        /* calc method calls for comparisons, calculations & detail output */
        void calc()
        {
            if(firstVar < 13)
            {
                System.out.println("firstVar is " + firstVar+"\n");
                firstVar = firstVar + 1;
            }
            else
            {
                System.out.println("firstVar is 13" or greater. n);
                firstVar = firstVar + 2;
                secondVar = secondVar - 1;
                firstVar + secondVar = thirdVar;
            }
        } // end of calc()
        /* reportOut method does the final output /*
         * void reportOut()
         * {
         *     System.out.println("\nFINAL REPORT");
         *     System.out.println("------------");
         *     System.out.println("firstVar is " + firstVar);
         *     System.out.println("secondVar is " + secondVar);
         *     System.out.println("thirdVar is " + thirdVar);
         *     if(firstVar < 11);
         *     {
         *         System.out.println("THIS SHOULD NOT PRINT");
         *      }
         *  } // end of class Buggy