/////////////////////////////
////Hsiao Chen Yeh
////09/30/14
////Hw05-1 BurgerKing.java
//////////////////////////////
//  import the Scanner Class
import java.util.Scanner;
//  define a class
    public class BurgerKing {
//  add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
//  prompt user for details of their choices of order
            System.out.println("Enter a letter to indicate a choice of");
            System.out.println("Burger (B or b)");
            System.out.println("Soda (S or s)");
            System.out.println("Fries (F or f)");
//  call a method for my scanner oblect
            String strChoice=myScanner.next();
                if (strChoice.length()>1){
                    System.out.println("a single character expected");
                }
//  double quote "string" ; single quote 'char' 
                else if(!strChoice.equals("B")&&!strChoice.equals("b")&&!strChoice.equals("S")&&!strChoice.equals("s")&&!strChoice.equals("F")&&!strChoice.equals("f")) {
                    System.out.println( "You did not enter any of 'B','b','S','s','F',or 'f'");
                }
//  use switch for conditional statement of each choice
//  remember to indicate type of variable after case in switch statement
// double quote "string"
                switch (strChoice){
                    case "b":   case "B":
                    System.out.println("Eneter A or a for all the fixins");
                    System.out.println(" C or c for cheese");
                    System.out.println(" N or n for none of the above");
                    Scanner BurgerInput = new Scanner(System.in);
                    String BurgerChoice= BurgerInput.next();
                    switch (BurgerChoice){
                        case "A":   case "a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                        case "C":   case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                        case "N":   case "n":
                        System.out.println("You ordered a burger not with all the ficins nor with cheese");
                        break;
                        default:
                        System.out.println("You did not enter any of A, a, C, c, N, or n ");
                        break;
                    }
                    break;
                    case "S": case "s":
                    System.out.println("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew(M or m)");
                    Scanner DrinkInput = new Scanner(System.in);
                    String DrinkChoice= DrinkInput.next();
                    switch (DrinkChoice){
                        case "C":   case "c":
                        System.out.println("You ordered a Coke");
                        break;
                        case "P":   case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                        case "S":   case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                        case "M":   case "m":
                        System.out.println("You ordered a Mt. Dew");
                        break;
                        default:
                        System.out.println("What you entered was not as instructed");
                        break;
                    }
                    break;
                    case "F":   case "f":
                    System.out.println("Do you want a large or small order of fries (l, L, s, or S)");
                    Scanner FriesInput = new Scanner(System.in);
                    String FriesChoice= FriesInput.next();
                    switch (FriesChoice){
                        case "l":   case "L":
                        System.out.println("You ordered large fries");
                        break;
                        case "S":   case "s":
                        System.out.println("You ordered small fries");
                        break;
                        default:
                        System.out.println("What you entered was not as instructed");
                        break;
                    }
                    break;
                        
                }
        }
    }