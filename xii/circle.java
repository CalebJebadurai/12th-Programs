package xii;
import java.io.*;
class circle
{
    static int n,i,j,N;
    circle(int nn)
    {
        n=nn;
    }

    void cir(int x)
    {
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=1;j--)
            {
                if((i*j)%2==0)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])throws IOException
    {
        circle c1=new circle(5);
        circle c2=new circle(j);
        c1.cir(5);
    }
}