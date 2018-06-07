import java.util.*;

class date

{

    void main()

    {

        Scanner op=new Scanner (System.in);

        System.out.println("input the date without space and in dd/mm/yr formate");

        long n=op.nextLong();

        String str="  ";long s,m,j,fg;

 

 

        if(n<=230814&&n>=99999)

        {

            s=n/10000;

 

            m=n/100;

            j=m%100;

 

            if(j==1)

            {

               str="january";

 

             }

             else if(j==02)

             {

                 str="february";

                }

                else if(j==03)

                {

                    str="march";

                }

                else if(j==04)

                {

                    str="april";

                }

                else if (j==05)

                {

                    str="may";

                }

                else if (j==06)

                {

                    str="june";

                }

                else if (j==07)

                {

                    str="july";

                }

                else if (j==8)

                {

                    str="augest";

                }

                else if (j==9)

                {

                    str="september";

                }

                else if (j==10)

                {

                    str="october";

                }

                else if(j==11)

                {

                    str="november";

                }

                else if (j==12)

                {

                    str="december";

                }

 

                fg=n%100;

 

                System.out.println("the date is" + s +" "+str+" "+fg);

 

 

        }

        else 

        System.out.println("invalid date");

        }

    }