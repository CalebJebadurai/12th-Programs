package Important_JavA_Programs_ISC;

/**
* The superclass Record stores the stores the name and ranks of 50 students and
* the subclass Rank finds the highest rank along with the name
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Theory 2011 Question 11
*/
 
import java.io.*;
class Record //superclass
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name[];
        int rnk[];
         
        Record()
        {
            name = new String[50];
            rnk = new int[50];
        }
         
        void readvalues()throws IOException
        {
            System.out.println("*** Inputting The Names And Ranks ***");
            for(int i=0;i<50;i++)
            {
                System.out.print("Enter name of student "+(i+1)+" : ");
                name[i]=br.readLine();
                System.out.print("Enter his rank : ");
                rnk[i]=Integer.parseInt(br.readLine());
            }
        }
         
        void display()
        {
            System.out.println("Name\t\tRank");
           System.out.println("-------\t\t-------"); //this is just for styling the output. You can skip it !
            for(int i=0;i<50;i++)
            {
                System.out.println(name[i]+"\t\t"+rnk[i]);
            }
        }
    } //end of superclass Record
 
class Rank extends Record //subclass
    {
        int index;
         
        Rank()
        {
            super(); //invoking the constructor of superclass
            index = 0;
        }
         
        void highest()
        {
            int min = rnk[0];
            for(int i=0;i<50;i++)
            {
                if(rnk[i]<min)
                {
                    min = rnk[i];
                    index = i;
                }
            }
        }
         
        void display()
        {
            super.display(); //calling the superclass function display()
            highest(); //calling the function highest() for finding index of topmost rank
            System.out.println("nTop most rank = "+rnk[index]);
            System.out.println("Student with topmost rank = "+name[index]);
        }
    } //end of subclass Rank
 
/* In your exams you don't need to write the below given code
   We are writing it so as to familiarize the students on how to run programs
   based on the concept of inheritance.*/
 
public class Question11_ISC2011 //Class which will contain the main() method and execute the program
    {
        public static void main(String args[])throws IOException
        {
            Rank ob=new Rank(); //creating object of subclass
            ob.readvalues(); //calling radvalues() function of superclass to input the names and ranks
            System.out.println("*** Output ***");
            ob.display(); //calling display() function of subclass
        }
    }

// Source: http://www.javaforschool.com/444401-question-11-inheritance-isc-2011-theory-paper-solved/#ixzz3R5c8jYpS
