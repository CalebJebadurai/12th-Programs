/**
 * A Complex Number is a Number of the form x + iy, where x and y are real numbers and i is the 
 * square root of -1. The Number x is known as the real part of the complex Number and iy is 
 * known as the imaginary Part. Complex Numbers are a quintessential mathematical abstraction:
 * whether or not one believes it makes sense physicallyto take the square root of -1, Complex
 * Numbers help us Understand the Natural World. they are Extensively used in Applied Mathematics
 * and Play an Essential role in branches of Science and Engineering. They are used to model 
 * physical system of all sorts,from Circuits to sound waves to Electomagnetic fiels. These Models
 * typically require Extensive Computations involving manipulating complex numbers according to
 * well defined arithmetic operations.
 * @author SHANTANU KHAN
 * @mail shantanukhan1995@gmail.com
 * @website 0code.blogspot.com
 * Program Type : BlueJ Program - Java
 */
import java.io.*;
public class ComplexNumbers
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static Double x=0.0,y=0.0,v=0.0,w=0.0;
    private void input()throws Exception
    {
        System.out.println("Complex Number A = x + iy");
        System.out.print("Real Part (x) = ");    x=Double.parseDouble(br.readLine());
        System.out.print("Imaginary Part (y) = ");    y=Double.parseDouble(br.readLine());
        System.out.println("\nComplex Number B = v + iw");
        System.out.print("Real Part (v) = ");    v=Double.parseDouble(br.readLine());
        System.out.print("Imaginary Part (w) = ");    w=Double.parseDouble(br.readLine());
        System.out.println();
    }
    
    public void add(double x, double y,double v,double w)
    {
        System.out.println("\nAddition of "+x+" + i"+y+" and "+v+" + i"+w+" is : "+(x+v)+" + i"+(y+w));
    }
    
    public void multiply(double x, double y,double v,double w)
    {
        System.out.println("\nProduct of "+x+" + i"+y+" and "+v+" + i"+w+" is : "+((x*v)+(y*w))+" + i"+((y*v)+(x*w)));
    }
    
    public void magnitude(double x,double y)
    {
        System.out.println("\nMagnitude of "+x+" + i"+y+" is : "+Math.sqrt((Math.pow(x,2))+(Math.pow(y,2))));
    }
    
    public void toForm(double x,double y)
    {
        System.out.println("Complex Number Form "+x+" + i"+y);
    }
    
    public static void main(String args[])throws Exception
    {
        ComplexNumbers obj=new ComplexNumbers();
        obj.input();    System.out.print("A = ");obj.toForm(x,y);   System.out.print("B = ");obj.toForm(v,w);
        obj.magnitude(x,y); obj.magnitude(v,w); obj.add(x,y,v,w);   obj.multiply(x,y,v,w);  
    }
}