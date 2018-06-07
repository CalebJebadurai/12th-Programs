import java.io.*;
import java.util.*;
import java.util.Scanner;
class reversepatterns
    {
        public static void main(String args[])throws IOException
        {
            try
            {
                int i,j,l,k=5;
                char p='A';
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ENTER THE NUMBERS OF ROWS");
                int n=Integer.parseInt(in.readLine());
                {
                    for(i=1;i<=n;i++)
                    {
                        for(j=1;j<=i;j++)
                        {
                            System.out.print(i);
                        }
                        for(l=k;l>=1;l--)
                        {
                            for(j=1;j<=i;j++)
                            {
                                System.out.print((char)(64+i));
                            }
                            k=k-1;
                            p=(char)(p+1);
                            for(k=j-1;k>0;k--)
                            System.out.print("");
                        }
                        System.out.println();
                    }
                }
            }
            catch(Exception e){}
        }
    }
//                         }
//                         System.out.println();
//                     }
//                     for(i=n;i>=1;i--)
//                     {
//                         for(j=1;j<=i;j++)
//                         {
//                             System.out.print((char)((64+n)-i));
//                         }
//                         System.out.println();
//                     }
//                 }
//             }
//         catch(Exception e){}
//         }
//     }