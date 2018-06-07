package rec;
import java.util.*;
class sqrMat
{
    int C[][];	
    Scanner sc=new Scanner(System.in);
    sqrMat(int ss)// constructor to create a object of C[][] with size limit ss
    {
        C[][]=new int[ss][ss];
    }

    void input(ss)
    {
        System.out.print("INPUT:");
        System.out.println("\n\tEnter the elements of the Matrix:\n");
        for(int i=0;i<ss;i++)//loop for coloumn of the matrix
        {
            for(int j=0;j<ss;j++)//loop for row of the matrix
            {
                System.out.print("\t\t");
                C[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
    
    private sqrMat mirror(sqrMat E,sqrMat C)
    {
        for(int i=0;i<ss;i++)
        {
            for(int j=0,k=ss-1; j<ss; j++,k--)//'k' for original matrix,
            {                                 //'j' for mirrored matrix.
                E.C[i][j]=C.C[i][k];//Mirror swaping of coloumns
            }
        }
    }
    
    void display()
    {
        for(int i=0;i<ss;i++)//loop for coloumn of the matrix
        {
            for(int j=0;j<ss;j++)//loop for row of the matrix
            {
                System.out.print("\t\t");
                C[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
}