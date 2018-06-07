/**
 * The BlueJ Program of class Piglatin converts Each Word in its Piglatin Form.
 * The first Vowel in the Original Word becomes the Start for the Translation
 * and The Preceeding letters are Shifted towards the End and Followed by AY,
 * conditionally words that Begin with vowel or do not have One remains Unchanged
 * For Ex : King --> ingKAY trouble --> oubletrAy
 * @author SHANTANU KHAN
 * @mail shantanukhan1995@gmail.com
 * @website 0code.blogspot.com
 * Program Type : BlueJ Program - Java
 */
import java.util.*;
public class Piglatin
{
    static Scanner sc=new Scanner(System.in);
    static String txt;
    static int len;
    Piglatin() // CONSTRUCTOR
    {
        txt=""; len=0;
    }
    
    void readString()throws Exception
    {
        System.out.print("Enter a WORD to Convert to Piglatin (1st Word Considered): ");
        if(sc.hasNext())txt=sc.next();
    }
    int consonant(String S) // CALCULATES NO. OF CONSONANTS PRESENT IN A WORD
    {
        int count=0;
        for(int i=0;i<S.length();i++)
            if(!isVowel(S.charAt(i)))    count++;
        return count;
    }
    boolean isVowel(char C) // RETURNS TRUE IF CHAR IS A VOWEL
    {
        return "AEIOUaeiou".indexOf(C)>-1;
    }
    void convert(String S) // CONVERTS THE WORD TO PIGLATIN
    {
        String str="";int i=0;
        for(;i<S.length();i++)
        {
            if(isVowel(S.charAt(i)))    break;
            else    str+=S.charAt(i);
        }
        if(i==0||i==S.length())    str=S;
        else    str=S.substring(i)+str+"AY";
        System.out.println("Word After Piglatin Conversion : "+str);
    }
    
    public static void main(String args[])throws Exception
    {
        Piglatin obj=new Piglatin();
        obj.readString(); txt=txt.toUpperCase(); obj.convert(txt);
        System.out.println("No. Of Consonants Present in Word : "+obj.consonant(txt));
    }
}