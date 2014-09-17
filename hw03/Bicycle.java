///////////////
///Hsiao Chen Yeh
// 9/16/15
//HW03-1 Bicycle.java
///////////////
//  import the Scanner Class, the only thing in Java that ever happens outside the class
import java.util.Scanner;
//  define a class
    public class Bicycle {
// add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
//  
            System.out.print("Enter the number of seconds (an integer > 0):");
//  calls a method 'nextInt() for the myScanner object'
            int nSeconds = myScanner.nextInt();
            System.out.print("Enter the number of counts (an integer > 0):");
            int nCounts = myScanner.nextInt();
            
//  declare intermediate variables
            double wheelDiameter=27.0,   // wheelDiameter is 27 inches, declared as double, which will give extra percision
            PI=3.14159,                 //  allows program to calculate distance of a rotation count
            feetPerMile=5280,           //  unit conversion allows program to compute desired unit in miles
            inchesPerFoot=12,           //  see above
            secondsPerMinute=60,        //  unit conversion allows program to compute desired unit in minutes
            minutesPerHour=60;
// print out the output
            double distance;
            distance=nCounts*wheelDiameter*PI;   //distance in inches
            distance/=inchesPerFoot*feetPerMile; //convert inches to miles
            double minutes;
            minutes= nSeconds/secondsPerMinute;
            double hours;
            hours= minutes/minutesPerHour;
            double mph;
            mph=distance/hours;
// fix decimal places
            double finalDistance;
            finalDistance= ((int)(100*distance))/100.0;
// divided by 100, only gives u result in one decimal to the right without precison, like 2.0, 12.0
// so you need to divide by 100.0, in order to declare meanings to the desired decimal places
            
            double finalMph;
            finalMph= ((int)(100*mph))/100.0;
// print output calculation
            System.out.print("The distance was "+finalDistance+" miles and took "+minutes+" minutes.");
            System.out.print("The average mph was "+finalMph);
            
    }
    
}