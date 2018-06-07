package rec;
import java.io.*;
class CMagic
{
    int n,m,s;
    CMagic()
    {
        n=m=0;
    }

    boolean isCompo(int x)
    {
        int flag=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)flag++;
        }
        if(flag>2)return true;
        else return false;
    }

    int isMagic(int x)          //28    2     0         10    1     0
    {
        if(x==0)return 0;       //no    no    yesGoBack no    no    yesGoBack
        int d=x%10;             //8     2               0     1
        int r=x/10;             //2     0               1     0
        s=d+isMagic(r);         //8+    8+2+0=10        0+    0+1+0=1
        if(s>9)isMagic(s);      //yes                   no
        return s;               //1
    }

    public static void main(String args[])throws IOException
    {
        CMagic E=new CMagic();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input:\n\tn=");
        E.n=Integer.parseInt(br.readLine());
        System.out.print("\tm=");
        E.m=Integer.parseInt(br.readLine());
        if(E.m>E.n)
        {
            int freq=0;
            String str="";
            for(int i=E.n;i<=E.m;i++)
            {
                if(E.isCompo(i)&&E.isMagic(i)==1)//
                {
                    str+=i+",";
                    freq++;
                }
            }
            System.out.print("\nOUTPUT:\n");
            System.out.println("\tThe Composite Magic Integers are:\n\t"+str.substring(0,str.length()-1));
            System.out.print("\tThe Frequency Of Composite Magic number in the specified Range is:"+freq);
        }
        else System.out.println("Invalid Range!\n 'm' should be greater than 'n' in order to enable this process!");
    }
}