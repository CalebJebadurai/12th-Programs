/**
 * The BlueJ Program of class Quad calculates the Type Of Root(s) of the 
 * Quadratic Equation and Displays the Program by Proper Corresponding Functions.
 * @author SHANTANU KHAN
 * @mail shantanukhan1995@gmail.com
 * @website 0code.blogspot.com
 * Program Type : BlueJ Program - Java
 */
import java.util.*;
public class Quad
{
    static Scanner sc=new Scanner(System.in);
    public double a,b,c,X1,X2;
    
    public void input()
    {
        System.out.println("Enter values of Quadratic Equation : ax2+bx+c=0");
        System.out.print("a : ");a=sc.nextDouble();
        System.out.print("b : ");b=sc.nextDouble();
        System.out.print("c : ");c=sc.nextDouble();
    }
    
    public double discriminant() // CALCULATING DISCRIMINANT
    {
        return (Math.pow(b,2)-(4*a*c));
    }
    public void real() // FOR REAL ROOTS
    {
        double real1=((-b+Math.sqrt(b*b-4*a*c))/2.0*a);
        double real2=((-b-Math.sqrt(b*b-4*a*c))/2.0*a);
        System.out.println("1st Real Root : "+real1);
        System.out.println("2nd Real Root : "+real2);
    }
    public void equal() // FOR REAL AND EQUAL ROOTS
    {
        double equal=((-b/(2.0*a)));
        System.out.println("Equal Real Root : "+equal);
    }
    public void imaginary() // FOR IMAGINARY ROOTS
    {
        double imaginaryPart=(Math.sqrt(Math.abs(b*b-4.0*a*c)));
        double realPart=(-b/(2.0*a));
        System.out.println(realPart+" + "+imaginaryPart+" i");
        System.out.println(realPart+" - "+imaginaryPart+" i");
    }
    
    public void root() // CONDITIONAL FUNCTION EXECUTION
    {
        if(discriminant()==0){
            System.out.println("\nBoth the Roots are Equal:"); equal(); }
        else if(discriminant()<0){
            System.out.println("\nThe Roots are Imaginary :"); imaginary(); }
        else{
            System.out.println("The Roots are Real and Unequal :"); real(); }
    }
    
    public static void main(String[] args)
    {
        Quad obj=new Quad();    obj.input();    obj.root();
    }
}