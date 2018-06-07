import java.io.*;
class PATTERN_1AAAAA
{
    public static void main(String args[])throws IOException
    {
        int a,b,c,flag;
        do
        {
            BufferedReader cab=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ENTER THE NUMBER OF ROWS IN THE TOWER ONE MORE THAN YOU ACTUALLY NEED");
            int n=Integer.parseInt(cab.readLine());
            {
                for(a=1;a<n;a++)
                {
                    for(c=1;c<=a;c++)
                    {
                        System.out.print(a+"\t");
                    }
                    for(b=1;b<=n-a;b++)
                    {
                        System.out.print((char)(64+a)+"\t");
                    }
                    System.out.println();
                }
            }
            System.out.println("PRESS '1' TO TERMINATE THE PROGRAM.");
            System.out.println("           OR");
            System.out.println("PRESS '0' TO TRY AGAIN");
            flag=Integer.parseInt(cab.readLine());
            {
                if(flag==0)
                {
                    System.out.println("*********************************************************************");
                    System.out.println("*********************************************************************");
                    System.out.print("RE");
                }
                else
                {
                    System.out.println("THE PROGRAM IS SUCCESSFULLY TERMINATED");}
                }
            }while(flag==0);
        }
    }