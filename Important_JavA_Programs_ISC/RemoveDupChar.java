package Important_JavA_Programs_ISC;

/**
 * The class RemoveDupChar inputs a word and removes duplicate characters
 * @author : www.javaforschool.com
 * @Program Type : BlueJ Program - Java
 */

import java.io.*;//importing io class from java
class RemoveDupChar//a class
{
    public static void main(String args[])throws IOException//main method
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//creating a buffer and an input stream
        System.out.print("Enter any word : ");//asking the user for a string
        String s = br.readLine();//string s to hold data
        int l = s.length();//int l to hold the length of the string
        char ch;//char ch to hold the current char
        String ans="";//string ans to hold the final string with chars removed

        for(int i=0; i<l; i++)//loop to check each char of a string
        {
            ch = s.charAt(i);//providing the value of the current char
            if(ch!=' ')//checking if the char is a white space
                ans = ans + ch;//rebuilding the string with chars removed
            s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }

        System.out.println("Word after removing duplicate characters : " + ans);//displays the final result
        //System.out.println("Word after removing duplicate characters : " + s);
    }
}

//Source: http://www.javaforschool.com/1939213-program-to-remove-duplicate-characters-from-a-word-2/#ixzz3R4wYqVwe
