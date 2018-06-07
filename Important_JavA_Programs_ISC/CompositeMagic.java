package Important_JavA_Programs_ISC;

import java.io.*;
class CompositeMagic
{
    int n,m;
    CompositeMagic(int nn,int mm)
    {
        n=nn;
        m=mm;
    }

    boolean checkComposite(int x)
    {
        int flag=0;
        for(int i=1;i<=x;i++)
            if(x%i==0)
                flag++;
        if(flag>2)return true;
        else return false;
    }

    int checkMagic(int x)
    {
        if(x<=1)return(1);
        int sum=0;
        int digit=x%10;
        x/=10;
        sum+=digit+checkMagic(x);
        if(sum>9)checkMagic(sum);
        return(sum);
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the lower limit \n\tn=");
        int p=Integer.parseInt(br.readLine());
        System.out.println("Enter the upper limit \n\tn=");
        int q=Integer.parseInt(br.readLine());

        if(p>q)
            System.out.println("Invalid Input");
        else
        {
            CompositeMagic E=new CompositeMagic(p,q);
            for(int i=E.n;i<=E.m;i++)
                if(E.checkComposite(i)&&E.checkMagic(i)==1)
                    System.out.println("\t"+i);
        }
    }
}