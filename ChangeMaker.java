import java.io.*;
import java.text.*;
public class ChangeMaker {
  public static void main(String [] args) throws IOException
  {
    // declarations
  
    // the input string
    String str;
    final String amountInputString=" Enter the amount you want changed (in whole dollars): ";
    final String denomInputString =" Enter the preferred bill denomination (100, 50 or 20): ";
    // number of bills in each denomination
    int hundreds = 0,
        fifties = 0,
        twenties = 0,
        tens = 0,
        fives = 0,
        ones = 0;


    // get the input from readInput method
    str = readInput(amountInputString);


    // remove inadvertant/unwanted dollar signs
    if (str.indexOf('$') != -1)
    {
      str = str.replace('$',' ');
      str = str.trim();
    }


    // ensure the input is integer/long not float/double
    if (str.indexOf('.') != -1)
    {
      int dec = str.indexOf('.');
      str = str.substring(0,dec);
    }


    // convert user input into long integer in case the resulting number exceeds
    //   the largest amount allowed for an integer
    long longAmount = Long.parseLong(str);


    // limit the input to integer only
    if (longAmount > 32000)
    {
      System.out.println("You entered an amount greater than 32,000!");
      System.out.println("Program terminating...");
      System.exit(0);
    }


    // cast the long as int
    int amount = (int)longAmount;


    // get the input from readInput method
    str = readInput(denomInputString);


    // convert user input into an integer
    int denom = Integer.parseInt(str);


    // filter out undesirable denomination input values (100,50,20 ONLY!)
    if (denom != 100 && denom != 50 && denom != 20)
    {
      System.out.println("You entered an invalid denomination of " + denom + ".");
      System.out.println("Program terminating...");
      System.exit(0);
    }


    int denomination = denom;


    // calculations


    // if the $100 bills were preferred
    if (denom == 100)
    {
      hundreds = divideBy(amount, 100);
      amount -= (100 * hundreds);
      denom = 50;  // seeding the denomination indicator for $50 bills next
    }


    // if the $50 bills were preferred
    if (denom == 50)
    {
      fifties = divideBy(amount, 50);
      amount -= (50 * fifties);
    }


    // if the preferred bills were $50 bills, fall through to here
    twenties = divideBy(amount, 20);
    amount -= (20 * twenties);


    // divide out the remainder among the lower denomination bills
    tens = divideBy(amount, 10);
    amount -= (10 * tens);


    fives = divideBy(amount, 5);


    ones = amount - (5 * fives);




    // output results
    System.out.println("# The preferred denomination was " + denomination + " dollar bills.");
    System.out.println("# The change for $" + longAmount + " is as follows:");
    System.out.println("#                           Hundreds: " + hundreds);
    System.out.println("#                            Fifties: " + fifties);
    System.out.println("#                           Twenties: " + twenties);
    System.out.println("#                               Tens: " + tens);
    System.out.println("#                              Fives: " + fives);
    System.out.println("#                               Ones: " + ones);
    System.out.println("#                                                #");




    // output footer
    System.out.println("#                 #");
    System.out.println("###################################################\n");


  } // end main


  // outputHeader() method
  public static void outputHeader()
  {
    System.out.println("");
    System.out.println("#############################################");
    System.out.println("#                                         #");
    System.out.println("#                         CHANGE MAKER              #");
    System.out.println("#                                                 #");
    System.out.println("##############################################");
    System.out.println("#                                                  #");
    System.out.println("#   This program will request a whole dollar amount that you   #");
    System.out.println("#  want to have changed and whole number bill denomination you #");
    System.out.println("#  would for your highest value of bill in change. The only    #");
    System.out.println("#  acceptable preferred denominations are 100, 50 and 20. You  #");
    System.out.println("#  may only change for up to $32,000.                #");
    System.out.println("#                                                    #");
    System.out.println("##########################################################");
    System.out.println("#                                                 #");
  } // end method


  // readInput() method
  public static String readInput(String inputString) throws IOException
  {
    // prepare for input
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);


    // prompt for user input
    System.out.print("# Enter the amount you want changed (in whole dollars): ");


    // accept  user input
    String str = br.readLine();


    // return the user input
    return str;
  
  } // end method


  // divideBy() method
  public static int divideBy(int dollarAmount, int billDenomination)
  {
  return dollarAmount/billDenomination;
  } // end method


} // end class