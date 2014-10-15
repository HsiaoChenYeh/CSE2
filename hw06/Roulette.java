/////////////////////////////
////Hsiao Chen Yeh
////10/14/14
////Hw06-1   Roulette.java
//////////////////////////////
//  import the Scanner Class, Random number generator
import java.util.Scanner;
import java.util.Random;

//  define a class
    public class Roulette{
// add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
// prompt user for number 
            System.out.println("Enter your a number of your bet(an integer between 1 and 38)");
//  calls a method 'nextInt() for the myScanner object'
            int X=myScanner.nextInt();
//  in first trial(total of 1000 trials) of 100 spins: x1, x2, x3....x100 where 1<=x<=38
            int total_money=0;  
            int lose_everything=0;
            int total_wining=0;
            
            int trial=0;
            while (trial<1000)
            {
// for one trial
                int data=0;
                int counter=0;
                int sum=0;
                while (counter<100)
                {
                    data =(int)(Math.random()*37)+1;
                    if(X==data)
                    {
                        sum=sum+1;
                        total_money=total_money+36;
                        
                    }
                    counter++;
                }
                if(sum>=3){
                    total_wining++;
                }
                else if(sum==0){
                    lose_everything++;
                }
             trial++;
            }
            int total_profit=100*1000-total_money;
            System.out.println("The number of times I lose everything is "+ lose_everything);
            System.out.println("The total amount I earned for winnings is "+ total_profit);
            System.out.println("The number of times I walk away with a profit is "+ total_wining);
        }
    }        