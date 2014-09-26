//Hsiao Chen Yeh
//Hw04-1 IncomeTax.java
//  import the Scanner Class, the only thing in Java that ever happens outside the class
import java.util.Scanner;
//  define a class
    public class IncomeTax {
//  add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
//  promt the user to enter an int that gives the thousands of dollars of income
            System.out.println("Enter an int giving the number of thousands");
//  call a method 'nextInt() for myScanner object'
//  declare variables
            int intIncome = myScanner.nextInt();
            int income= intIncome*1000;
//  tax rate with corresponding rate
// <20, 5%     >=20 && <40, 7%
// >=78, 14%   >=40 && <78, 12%
                if (intIncome>=0 && intIncome<20){
                    System.out.println("The tax rate on $"+income+" is 5.0 %, and the tax is "+ income*.05);
                }
                else if (intIncome>=20 && intIncome<40){
                        System.out.println("The tax rate on $"+income+" is 7.0 %, and the tax is "+ income*.07);
                }
                else if (intIncome>=40 && intIncome<78){
                        System.out.println("The tax rate on $"+income+" is 12.0 %, and the tax is "+ income*.12);
                }
                else if (intIncome>=78){
                        System.out.println("The tax rate on $"+income+" is 14.0 %, and the tax is "+ income*.14);
                }
                else if (intIncome<0){
                        System.out.println("You did not enter a positive int");
                }
                else{
                    System.out.println("You did not enter an int");
                }
            
            
        }
    }
            