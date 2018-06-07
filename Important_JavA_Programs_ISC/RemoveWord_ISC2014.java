package Important_JavA_Programs_ISC;/**
* The class RemoveWord_ISC2014 inputs a sentence. It also inputs a word and an integer.
* It then removes the word present at that position in the sentence
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2014 Question 3
*/

import java.io.*;
class RemoveWord_ISC2014
{           
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));

        System.out.print("Enter any sentence : "); // Inputting the sentence
        String s = br.readLine();
        s = s.toUpperCase(); // Converting the sentence into Upper Case
        int l = s.length();
      
        String ans=""; // String variable to store the final result
        char last = s.charAt(l-1); // Extracting the last character
        
        /* Checking whether the sentence ends with '.', '?' or a '!' or not */
        if(last == '.' || last == '?' || last == '!')
        {
            String word[]=s.split("[.?! ]+"); // Saving the words in an array using split()
            int c = word.length; // Finding the number of words
        
            System.out.print("Enter the word to delete : ");
            String del = br.readLine();
            del = del.toUpperCase();

            System.out.print("Enter the word position in the sentence : ");
            int x = Integer.parseInt(br.readLine());
        
            if(x<1 || x>c) // Checking whether integer inputted is acceptable or not
            {
                System.out.println("Sorry! The word position entered is out of range");
            }

            else
            {      
                for(int i=0; i<c; i++)
                {
                    /* Skipping if the word to delete and the position matches */
                    if(word[i].equals(del)==true && i == x-1)
                        continue;
                    ans = ans + word[i] + " ";
                }
                System.out.print("Output : "+ans.trim()+last);
            }
        }

        else
        {
            System.out.println("Invalid Input. End a sentence with either '.', '?' or '!'");
        }
    }
}


//Source: http://www.javaforschool.com/1839562-isc-2014-question-3-practical-paper-solved-removing-words/#ixzz3R5MfsRQd
