/**
 * < Syntax: [-h] filename.ext > will print the last n lines of the Specified file.
 * If the switch n is omitted, it will show the last 10 lines. If the file contains less,
 * It Shows the Full Content.
 * Author SHANTANU KHAN
 * Date   26/06/2012
 */
import java.io.*;
public class tail
{
    // INSTANCE VARIABLES
    private int lines,present; // FILE SIZE AND EXISTING NO. OF LINES
    private String file;    // FILE NAME OR LOCATION TO BE READ
    public tail(String file){ // CONSTRUCTOR
        this.file=file;
        present=countLines(file); // COUNTS THE NO. OF LINES PRESENT IN THE FILE.
        lines=10; // DEFAULT NO. OF LINES
    }
    public tail(String file,int printLines){ // CONSTRUCTOR
        this.file=file;
        present=countLines(file);
        lines=printLines;
    }
    
    public static int countLines(String file){ // COUNT AND RETURN THE NUMBER OF LINES
        try{
            BufferedReader rFile=new BufferedReader(new FileReader(file));
            int count=0; String s;
            while(rFile.readLine()!=null) // READING THE FILE LINE-WISE
                count++; // INCREMENTING COUNTER
            rFile.close();  return count;
        }
        catch(Exception E){
            System.out.println("\nFile Not Found or UnReadAble.\n"+E);
            System.exit(-1); return -1; // RETURN STATEMENT NECESSARY
        }
    }
    
    private void printLine(){ // PRINT THE DATA IN THE SPECIFIED FILE
        int skip=0; // DEFAULT IF LINES >=AVAILABLE, SKIPS NOTHING
        if(lines<0){ // IF PARAMETER WITH SWITCH HAS NEGATIVE NUMBER : --23 TEST.TXT
            System.out.println("Error : Parameter Was Below Minimum Limit Of 0.");
            System.exit(-1);    } // EXITS IF n NEGATIVE
        else if(lines<present)
            skip=present-lines; // WILL SKIP PRINTING OF THE LINES
        try{ // EXCEPTION MAY BE THROWN IN RARE CASES, ALREADY FILE CHECKED DURING COUNT LINES
            BufferedReader rFile=new BufferedReader(new FileReader(file));
            String s;
            while(skip-->0) // READING THE FILE LINE-WISE
                s=rFile.readLine();
            while((s=rFile.readLine())!=null) // READING THE FILE LINE-WISE
                System.out.println(s);
            rFile.close();
        }
        catch(Exception E){;}
    }
    
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("\nSyntax : tail [-n] fileName.ext\nn = Number of Lines to Print."); 
            System.exit(-1); // STOP EXECUTION
        }
        if(args.length==1){ // 1 PARAMETER PROVIDED 
            if(args[0].charAt(0)=='-'){ // ONLY SWITCH PROVIDED AS INPUT
                System.out.println("\nFileName Missing in Parameter.\nSyntax : tail [-n] fileName.ext\nn = Number of Lines to Print.");
                System.exit(-1); // STOP EXECUTION
            }
            else{ // ONLY FILENAME PROVIDED IN PARAMETER
                System.out.println("\nFile Accessed : "+args[0]+"\n");
                tail obj=new tail(args[0]);
                obj.printLine();
            }
        }
        else if(args.length>=2){
            if(args.length>2)
                System.out.println("\nExcess Parameters Will Be Ignored.");
            if(args[0].charAt(0)=='-'){
                int n=Integer.parseInt(args[0].substring(1));
                System.out.println("\nFile Accessed : "+args[1]+"\n");
                tail obj=new tail(args[1],n);
                obj.printLine();
            }
            else{
                System.out.println("\nFile Accessed : "+args[0]+"\n");
                tail obj=new tail(args[0]);
                obj.printLine();
            }
        }
    }
}