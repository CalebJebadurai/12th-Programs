package xii;
import java.io.*;
class Q1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str,wrd;
        int pos,spc[];
        System.out.println("Enter The String: ");
        str=br.readLine();
        str=str.toUpperCase();
        spc=new int[str.length()];
        for(int i=0,j=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                if(str.charAt(i+1)==' ')
                {
                    str=str.substring(0,i+1)+str.substring(i+2);
                    i--;
                }
            }
        }
        if(str.charAt(0)==' ')
            str=str.substring(1);
        if(str.charAt(str.length()-1)==' ')
            str=str.substring(0,str.length()-1);
        for(int i=0,j=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                spc[j]=i;
                j++;
            }
        }
        System.out.println("Enter The Word To Delete: ");
        wrd=br.readLine();
        System.out.println("Enter The Position Of The Word: ");
        pos=Integer.parseInt(br.readLine());
        wrd=wrd.replaceAll(" ","");
        int lpl=spc[pos];
        int upl=spc[pos]+1+wrd.length();
        str=str.substring(0,lpl)+str.substring(upl);
//         if(str.endsWith(".")||str.endsWith("!")||str.endsWith("?"))
        {
            System.out.println(str);
        }
//         else 
            System.out.println("Invalid Input!\nThe sentence should ONLY End with '.', '!', '?'");
    }
}