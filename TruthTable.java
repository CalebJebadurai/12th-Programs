/**
 * The Program Prints the TruthTable for Full Adder and Half Adder. 
 * For Full Adder, Sum = x'y'z + xy'z' + x'yz' + xyz  Carry = xy + yz + xz
 * For Half Adder, Sum = x'y + xy'  Carry = xy
 * @author SHANTANU KHAN
 * @mail shantanukhan1995@gmail.com
 * @website 0code.blogspot.com
 * Program Type : BlueJ Program - Java
 */
public class TruthTable
{
    public void fullAdderTable()
    {
        boolean a,b,c,s,cr;
        int x,y,z,sum,carry;
        System.out.println(" x | y | z | c | s ");  System.out.println("---|---|---|---|---"); // TRUTH TABLE HEADER
        for(x=0;x<2;x++){
            for(y=0;y<2;y++){
                for(z=0;z<2;z++){
                    a=(x==0)?false:true;    b=(y==0)?false:true;    c=(z==0)?false:true; // INITIALIZING BOOLEAN VALUES IN BINARY FORM
                    s=!a&&!b&&c||a&&!b&&!c||!a&&b&&!c||a&&b&&c;     cr=a&&b||b&&c||a&&c; // FULL ADDER SUM AND CARRY CHECK OPERATION
                    sum=(s==false)?0:1;     carry=(cr==false)?0:1; // CONVERTING BOOLEAN SUM AND CARRY TO INTEGERS
                    System.out.println(" "+x+" | "+y+" | "+z+" | "+carry+" | "+sum); // PRINTING EACH LINE OF TRUTH TABLE
                }
            }
        }
    }
    public void halfAdderTable()
    {
        boolean a,b,s,cr;
        int x,y,sum,carry;
        System.out.println(" x | y | c | s ");  System.out.println("---|---|---|---"); // TRUTH TABLE HEADER
        for(x=0;x<2;x++){
            for(y=0;y<2;y++){
                a=(x==0)?false:true;    b=(y==0)?false:true; // INITIALIZING BOOLEAN VALUES IN BINARY FORM
                s=!a&&b||a&&!b;     cr=a&&b; // FULL ADDER SUM AND CARRY CHECK OPERATION
                sum=(s==false)?0:1;     carry=(cr==false)?0:1; // CONVERTING BOOLEAN SUM AND CARRY TO INTEGERS
                System.out.println(" "+x+" | "+y+" | "+carry+" | "+sum); // PRINTING EACH LINE OF TRUTH TABLE
            }
        }
    }
    public static void main(String args[])
    {
        TruthTable obj=new TruthTable();
        System.out.println("\nFull Adder Truth Table\n");  obj.fullAdderTable();
        System.out.println("\nHalf Adder Truth Table\n");  obj.halfAdderTable();
    }
}