import java.io.*;
class reversepattern
    {
        public static void main(String args[])throws IOException
        {
            int i,j;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            {
                int n=Integer.parseInt(br.readLine());
                for(i=1;i<=n;i++)
                { 
                    for(j=1;j<=i;j++)
                    { 
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                }
            }
        }
    }