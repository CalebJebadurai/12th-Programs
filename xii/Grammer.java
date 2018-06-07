package xii;
import java.io.*;
import java.util.*;
class Grammer
{
    String str,wrd;
    int len,pos;
    Grammer(String ss)
    {
        str=ss;
        len=str.length();
    }

    String getWord(String ww)
    {
        wrd=ww;
        wrd.toUpperCase();
        return wrd;
    }

    int getPosition(int pp)
    {
        return pos=pp;
    }
    
    String toUpperCase(String s)
    {
        return s.toUpperCase();
    }

    String replaceAll(String s)
    {
        return s.replaceAll("  ","");
    }

    String delWord(String a,int b)
    {
        
        return str;
    }

    void display()
    {
        System.out.println("OUTPUT:\n\t\t"+str);
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter The String: ");
        String s=br.readLine();
        if(s.endsWith(".")||s.endsWith("?")||s.endsWith("!"))
        {
            Grammer E=new Grammer(s);

            System.out.print("Enter The Word To be Deleted: ");
            E.getWord(br.readLine());
            System.out.print("Enter The Positoion Of The Word: ");
            E.getPosition(Integer.parseInt(br.readLine()));
            
            E.toUpperCase(s);
            E.replaceAll(s);
            E.delWord(E.wrd,E.pos);
            
            E.display();
        }
        else 
            System.out.println("Invalid Input.\nThe String Should End Either with '.' or '?' or '!'.");
    }
}