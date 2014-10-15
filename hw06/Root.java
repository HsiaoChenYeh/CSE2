/////////////////////////////
////Hsiao Chen Yeh
////10/14/14
////Hw06-2   Root.java
////use low and high boundaries to calculate square root of x
//////////////////////////////
//  import the Scanner Class
import java.util.Scanner;
import java.lang.Math;
//  define a class
    public class Root{
// add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
// prompt user for number
            System.out.println("Enter a positive double");
//  calls a method 'next() for the myScanner object'
            double x=myScanner.nextDouble();
            if (x<0){
                System.out.println("You did not enter a positive double");
                return;
            }
//  declare variables
    double low=0;
    double high=1+x;
    double middle=0.5*(low+high);
    double difference=high-low;
        while(difference>0.0000001*high){
            middle=0.5*(low+high);
            if(middle*middle>x){
            high=middle;
            }
            else if(middle*middle<x){
            low=middle;
            }
            difference=high-low;
        }
    System.out.println("middle is "+ middle);
    }
}
        