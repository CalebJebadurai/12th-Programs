import java.io.*;
class palindrome111
    {
        public static void main(String arg[])throws IOException
        {
            DataInputStream in=new DataInputStream(System.in);
            int l,i,j,flag=1;
            String s;
            System.out.println("Enter the string:");
            s=in.readLine();
            l=s.length();
            for(i=0,j=l-1;i<=j;i++,j--)
            {
                if(s.charAt(i)==s.charAt(j))
                {}
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            System.out.print(s+" is palindrome");
            else
            System.out.print(s+" is not palindrome");
        }
    } 