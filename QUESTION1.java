import java.io.* ;
class QUESTION1 
    {
        public static void main(String args[])throws IOException
        {
            int i,j,n,c,k,ch;
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ENTER THE VALUE OF 'N'");
            n=Integer.parseInt(in.readLine());
            c=n-1;
            for(i=1;i<=n;i++)
            {
                for(k=1;k<=c;k++)
                {
                    System.out.print(" ");
                }
                for(j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                for(j=i-1;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.println(" ");
                c=c-1;
            }
            c=c+2;
            for(i=-1;i>=1;i--)
            {
                for(k=1;k<=c;k--)
                {
                    System.out.print("");
                }
                for(j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                for(j=i-1;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.print("");
                c=c+1;
            }
        }
    }