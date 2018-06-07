package Important_JavA_Programs_ISC;

/**
* The class Sort2D_Method1 inputs a two dimensional array and sorts it in ascending order
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/

import java.io.*;
class Sort2D_Method1
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the no. of  rows: "); //inputting number of rows
            int r=Integer.parseInt(br.readLine());
            System.out.print("Enter the no. of columns: "); //inputting number of columns
            int c=Integer.parseInt(br.readLine());

            int A[][]=new int[r][c]; //creating a 2D array
            
            /* Inputting the 2D Array */

            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print("Enter the elements: ");
                    A[i][j]=Integer.parseInt(br.readLine());
                }
            }        
    
            /* Printing the original 2D Array */

            System.out.println("The original array:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }

            /* Saving the 2D Array into a 1D Array */

            int B[]=new int[r*c]; //creating a 1D Array of size 'r*c'
            int x = 0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    B[x] = A[i][j];
                    x++;
                }
            }
            
            /*Sorting the 1D Array in Ascending Order*/

            int t=0;
            for(int i=0; i<(r*c)-1; i++)
            {
                for(int j=i+1; j<(r*c); j++)
                {
                    if(B[i]>B[j])
                    {
                        t=B[i];
                        B[i]=B[j];
                        B[j]=t;
                    }
                }
            }
            
            /*Saving the sorted 1D Array back into the 2D Array */

            x = 0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    A[i][j] = B[x];
                    x++;
                }
            }

            /* Printing the sorted 2D Array */

            System.out.println("The Sorted Array:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }


//Source: http://www.javaforschool.com/649498-how-to-sort-a-two-dimensional-2d-array/#ixzz3R5YAvtyq
