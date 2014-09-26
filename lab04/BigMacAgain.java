///////////////
///Hsiao Chen Yeh
// 9/19/14
//lab03 BigMacAgain Java Program
///////////////
//  import the Scanner Class, the only thing in Java that ever happens outside the class
import java.util.Scanner;
//  define a class
    public class BigMacAgain {
// add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
// prompt user for number of BigMac
            System.out.println("Enter the number of Big Macs");
//  calls a method 'hasNextInt() for the myScanner object'
            double bigMac$;
            int nBigMacs;
            if (myScanner.hasNextInt()){ 
                // hasNextInt is a boolean test, hasNextInt is a true or false test
                nBigMacs = myScanner.nextInt();
                bigMac$ = 2.22;
                
            }
            else{ 
                System.out.println("You did not enter an interger");
            return; 
            }//leaves the program, i.e. the program terminates
            if (nBigMacs<0){System.out.println("You did not enter an interger >0");
            return;
            }
           
            double cost$;
                cost$ = nBigMacs*bigMac$;
                System.out.println("You oredered " +nBigMacs+" Big Macs for a cost of "+nBigMacs+"x"+bigMac$+"=$"+cost$);
            
            
            
        }
}
