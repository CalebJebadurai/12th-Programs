import java.io.*;
public class Diamond_Shape
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a no : ");
            int i=Integer.parseInt(br.readLine());
            int j,k,l;
            j=k=l=0;
            int n=i/2;
            for(j=0;j<n+1;j++)
            {
                for(k=0;k<n-j;k++)
                {
                    System.out.print(" ");
                }
                for(l=0;l<j+1;l++)
                {
                    System.out.print(""+l);
                }
                for(l=0;l<j;l++)
                {
                    System.out.print("");
                }
                System.out.println();   
            }
            for(j=n;j>0;j--)
            {
                for(k=n-j+1;k>0;k--)
                {
                    System.out.print(" ");
                }
                for(l=j-1;l>0;l--)
                {
                    System.out.print("*");
                }
                for(l=j;l>0;l--)
                {
                    System.out.print("*");
                }
                System.out.println();   
            }
        }
    }