///////////////
///Hsiao Chen Yeh
// 9/12/15
//lab03 BigMac Java Program
///////////////
//  import the Scanner Class, the only thing in Java that ever happens outside the class
import java.util.Scanner;
//  define a class
    public class BigMac {
// add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
//  numbers of tickets
            System.out.print("Enter the number of Big Macs (an integer > 0):");
//  accept user input by using statement, 
//  calls a method 'nextInt() for the myScanner object'
            int nBigMacs = myScanner.nextInt();
//  cost of Big Mac and sales tax and input
            System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx):");
            double bigMac$ = myScanner.nextDouble ();
            System.out.print("Enter the percent tax as a whole number (xx):");
            double taxRate = myScanner.nextDouble();
            taxRate/=100;  //user enters percent, but I want proportion
//  print out the output
            double cost$;
            int dollars, dimes, pennies; 
//              whole dollar amount of cost, 
//              dimes and pennies for storing digits to the right of the decimal pt 
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            dollars=(int)cost$;
            dimes=(int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+
            " per bigMac, with a"+" sales tax of "+ (int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
            

            
            
    }
    
}
