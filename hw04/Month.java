//Hsiao Chen Yeh
//Hw04-2 Month.java
//  import the Scanner Class, the only thing in Java that ever happens outside the class
import java.util.Scanner;
//  define a class
    public class Month {
//  add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
//  prompt the user to enter an integer for the month
            System.out.println("Enter an int giving the number of month (1-12)");
//  declare variable outside if statement            
            int intMonth = myScanner.nextInt();
            if (myScanner.hasNextInt()){ 
//  hasNextInt is a boolean test, hasNextInt is a true or false test
//  call a method 'nextInt() for myScanner object'  
            
                
            }
            else{ 
                System.out.println("You did not enter an interger between 1 and 12");
            return; 
            }  // leaves the program, i.e. the program terminates
            
            if (intMonth==1||intMonth==3||intMonth==5||intMonth==7||intMonth==8||intMonth==10||intMonth==12){
                System.out.println("The month has 31 days");
// single equals is used to assigned value; double equals indicate equality                
            }
            else if (intMonth==4||intMonth==6||intMonth==9||intMonth==11){
                    System.out.println("The month has 30 days");
            }
            else if (intMonth==2){
                System.out.println("Enter an int giving the year");
                int intYear= myScanner.nextInt();
                int R=intYear%4;
                if(R==1||R==2||R==3){
                    System.out.println("The month has 28 days");
                }
                else{
                    System.out.println("The month has 29 days");
                }
                return;
            }
        }
    }

            

    