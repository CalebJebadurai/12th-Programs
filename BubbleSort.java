/**
 * Class BubbleSort sorts the Array using the Bubble Sort Technique.
 * @author SHANTANU KHAN
 * @mail shantanukhan1995@gmail.com
 * @website 0code.blogspot.com 
 * Program Type : BlueJ Program - Java
 */
import java.io.*;
public class BubbleSort
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int A[],size;
    void Input()throws Exception
    {
        System.out.print("Enter the Size of the Array to be Bubble Sorted :");
        size=Integer.parseInt(br.readLine());
        A=new int[size];
        for(int i=0;i<size;i++)
        {
            int flag=0;
            do
            {
                flag=0;
                System.out.print("Enter the Element No."+(i+1)+" : ");
                A[i]=Integer.parseInt(br.readLine());
                for(int j=0;j<i;j++)
                {
                    if(A[j]==A[i])
                    {
                        flag=1;
                        System.out.println("Duplicate Element Inputted. Try Again");
                    }
                }   
            }while(flag==1);
        }
    }
    void BubbleAsc()
    {
        int temp;
        for(int i=1;i<A.length;i++)
        for(int j=0;j<A.length-i;j++)
        if(A[j]>A[j+1])
        {
            temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp;
        }
    }
    void BubbleDes()
    {
        int temp;
        for(int i=1;i<A.length;i++)
        for(int j=0;j<A.length-i;j++)
        if(A[j]<A[j+1])
        {
            temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp;
        }
    }
    void Print()
    {
        System.out.println("Array After Bubble Sorting is -->");
        for(int i=0;i<A.length;i++)
        System.out.print(A[i]+" ");
    }
    public static void main(String args[])throws Exception
    {
        int flag=0,choice;
        BubbleSort obj=new BubbleSort();
        obj.Input();
        do
        {
            System.out.println("\n\n1. Ascending 2. Descending 3. Terminate Program");
            System.out.print("Enter Your Choice : ");
            choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                obj.BubbleAsc();
                obj.Print();
                break;
                case 2:
                obj.BubbleDes();
                obj.Print();
                break;
                case 3:
                System.out.println("Program Successfully Terminated");
                flag=1;
                break;
                default:
                System.out.println("INVALID INPUT");
                flag=1;
                break;
            }
        }while(flag==0);
    }
}