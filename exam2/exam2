/////////////////////////////
////Hsiao Chen Yeh
////10/20/14
////Hw07  NumberStack.java
//////////////////////////////
//  import the Scanner Class
import java.util.Scanner;
//  define a class
    public class NumberStack{
// add main method
        public static void main (String[ ] args) {
//  declare an instance of the Scanner object
            Scanner myScanner;
//  tell Scanner to take input from STDIN
            myScanner=new Scanner( System.in );
// prompt user for number
            System.out.println("Enter a number between 1 and 9");
//  calls a method 'nextInt() for the myScanner object'
            int x=myScanner.nextInt();
            int outerMost=0;
// part 1: using for loops
            System.out.println("Output from for loops:");
            for(outerMost=1;outerMost<=x; outerMost++){
                for(int lines=1; lines<=outerMost; lines++){
                    for(int space=1; space<=x-outerMost; space++){
                        System.out.print(" ");
                    }
                    for(int printNumber=1; printNumber<=2*outerMost-1; printNumber++){
                        System.out.print(outerMost);
                    }
                System.out.println();
                }
                for(int spaceDash=1; spaceDash<=x-outerMost; spaceDash++){
                    System.out.print(" ");
                }
                for(int printDash=1; printDash<= 2*outerMost-1; printDash++){
                    System.out.print("-");
                }
            System.out.println();
            }
// part 2: using while loops
            System.out.println("Output from while loops:");
              outerMost=1;
              while (outerMost<=x){
                  int lines=1;
                  while (lines<=outerMost){
                      int space=1;
                      while(space<=x-outerMost){
                          System.out.print(" ");
                          space++;
                      }
                      int printNumber=1;
                      while(printNumber<=2*outerMost-1){
                          System.out.print(outerMost);
                          printNumber++;
                      }
                  System.out.println();  
                  lines++;
                  }
                  int spaceDash=1;
                  while(spaceDash<=x-outerMost){
                      System.out.print(" ");
                      spaceDash++;
                      
                  }
                  int printDash=1;
                  while(printDash<=2*outerMost-1){
                      System.out.print("-");
                      printDash++;
                  }
              System.out.println();   
              outerMost++;
              }
// part 3: do-while loop
            System.out.println("Output from do-while loops:");
            outerMost=1;
            do{
                int lines=1;
                do{
                    int space=1;
                    do{
                        System.out.print(" ");
                        space++;
                    }while(space<=x-outerMost);
                    int printNumber=1;
                    do{
                        System.out.print(outerMost);
                        printNumber++;
                        
                    }while(printNumber<=2*outerMost-1);
                    System.out.println();
                    lines++;
                }while(lines<=outerMost);
                int spaceDash=1;
                do{
                    System.out.print(" ");
                    spaceDash++;
                }while(spaceDash<=x-outerMost);
                int printDash=1;
                do{
                    System.out.print("_");
                    printDash++;
                }while(printDash<=2*outerMost-1);
                System.out.println();
                outerMost++;
            }while(outerMost<x);
            // last chunck of square
            int lines=1;
            do{
                int printX=1;
                do{
                    System.out.print(x);
                    printX++; 
                }while(printX<=2*outerMost-1);
                System.out.println();
                lines++;
            }while(lines<=x);
            int printDashX=1;
            do{
                    System.out.print("_");
                    printDashX++;
                }while(printDashX<=2*outerMost-1);
                System.out.println();  
        }    
    }