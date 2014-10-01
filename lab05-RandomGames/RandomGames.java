//Hsiao Chen Yeh
//lab05 RandomGames.java
//  import the Scanner Class, the only thing in Java that ever happens outside the class
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
//  define a class
    public class RandomGames {
//  add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
//  prompt user to pick a game
            System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card");
//  call a method for my scanner oblect
            String strGames=myScanner.next();

            if (strGames.length()>1){
                System.out.println("a single character expected");
            }
// comparing value use equal signs
// comparing object, write out the statement so ("strGames"!=C||"strGames"!=c) doesn't work
// use && instead of || because if you use ||, when you type in R, it is still true for 
            else if(!strGames.equals("R")&&!strGames.equals("r")&&!strGames.equals("C")&&!strGames.equals("c")&&!strGames.equals("P")&&!strGames.equals("p")) {
                System.out.println( strGames+" is not one of 'R','r','C','c','P',or 'p'");
            }
// use switch statement for conditional code
// double quote "string" ; single quote 'char' 
            int rouletteRandom;
            int diceOne;
            int diceTwo;
            switch(strGames){
                case "R":
                case "r":
                System.out.println("Roulette");
                rouletteRandom= (int)(Math.random()*39);  //range [0,1)*39 becomes [0,39) make case38 to be 00
                    switch(rouletteRandom)
                    {
                        case 38:
                            System.out.println("00");
                            default:
                            System.out.println(rouletteRandom);
                            break;
                    } 
                break;
                case "C":
                case "c":
                System.out.println("Craps");
                diceOne=(int)(Math.random()*7+1); //range [1,7)
                diceTwo=(int)(Math.random()*7+1);
                System.out.println(diceOne+" + "+diceTwo+"="+(diceOne+diceTwo));
                break;
                case "P":
                case "p":
                System.out.println("picking a card not implemented yet");
                break;
                
                
                
                
            }
        }
    }