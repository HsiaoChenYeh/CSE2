///////////////
///Hsiao Chen Yeh
// 9/16/15
//HW03-3 FourDigits.java
///////////////
//  import the Scanner Class, the only thing in Java that ever happens outside the class
import java.util.Scanner;
//  define a class
    public class FourDigits {
// add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
            
//prompt user to enter a double
            System.out.print("Enter a double, and I display the four digits to the right of the decimal point- ");
//call a method 'nextDouble() for myScanner object'
            double n1Double = myScanner.nextDouble();
//To show four digits to the right only
            double decimalRemainder1;
            decimalRemainder1=(n1Double)-(int)(n1Double);
            int FourDigits1;
            FourDigits1=(int)(decimalRemainder1*10000);
// specify clearly of the operation order, for instance, java can not read
// FourDigits1=int(decimalRemainder1*10000);
            System.out.print("The four digits are "+FourDigits1);
// prompt user to enter a second double, same as above
            System.out.print("Enter a double, and I display the four digits to the right of the decimal point- ");
//call a method 'nextDouble() for myScanner object'
            double n2Double = myScanner.nextDouble();
            double decimalRemainder2;
            decimalRemainder2=(n2Double)-(int)(n2Double);
            int FourDigits2;
            FourDigits2=(int)(decimalRemainder2*10000);
            System.out.print("The four digits are "+FourDigits2);
    }
}
        