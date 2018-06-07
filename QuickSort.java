/**
 * The class QuickSort sorts the Array and is Comparitively Fast in
 * sorting if array length is Greate than 21.
 * @author SHANTANU KHAN
 * @mail shantanukhan1995@gmail.com
 * @website 0code.blogspot.com
 * Program Type : BlueJ Program - Java
 */
import java.util.*;
public class QuickSort
{
    private static int arr[],size;
    
    public QuickSort(int arr[])
    {
        this.arr=arr;
    }
    public void quickSort(int lb,int ub)
    {
        if(lb>=ub)  return ;
        int pivot=(lb+ub)/2;
        swap(lb,pivot);
        int last=lb;
        // SAVING PIVOT ELEMENT AT LB LOCATION
        for(int i=lb+1;i<=ub;i++)
        {
            if(arr[i]<arr[lb])
                swap(++last,i);
        }
        // REPLACING PIVOT ELEMENT IN FINAL POSITION
        swap(lb,last);
        quickSort(lb,last-1);
        quickSort(last+1,ub);
    }
    private void swap(int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private void print()
    {
        System.out.println("\nArray After Sorting :\n");
        for(int i=0;i<size;i++)
        {   System.out.print(arr[i]+" ");   }
    }
    public static void main(String args[])throws Exception
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Size of Array : "); size=in.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++)
        {   System.out.print("Enter Element "+(i+1)+" : "); arr[i]=in.nextInt();    }
        QuickSort obj=new QuickSort(arr);
        obj.quickSort(0,size-1); obj.print();
    }
}