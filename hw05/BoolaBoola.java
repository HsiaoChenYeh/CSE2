/////////////////////////////
////Hsiao Chen Yeh
////09/30/14
////Hw05-2 BoolaBoola.java
//////////////////////////////
//  import the Scanner Class
import java.util.Scanner;
import java.util.Random;
//  define a class
    public class BoolaBoola {
//  add main method
        public static void main (String[ ] args) {
//  tell Scanner to take input from STDIN
        Scanner input =new Scanner( System.in );
        String booleanInput= input.next();
// printf conversion code %b
// System.out.printf();
        int booleanValue1= (int)(Math.random());
        int booleanValue2= (int)(Math.random());
        int booleanValue3= (int)(Math.random());
        int operator1=(int)(Math.random());
        int operator2=(int)(Math.random());
       // boolean result1;
        boolean boolean1;
        boolean boolean2;
        boolean boolean3;
        boolean1 =(booleanValue1>0.5) ? true:false;
        boolean2 =(booleanValue2>0.5) ? true:false;
        boolean3 =(booleanValue3>0.5) ? true:false;
        boolean operatorOption1;
        operatorOption1 =(operator1>0.5)? true:false;
        String op1="o"; 
        String op2="O";
        if (operatorOption1==false){
            op1= "||";
        }
        
        else{
            op2= "&&";
        }
        System.out.println("Does " + boolean1 + (op1) + boolean2 + (op2) + boolean3 +" have the value true(t/T) or false(f/F)?");
        }
    }
    /// The program runs without errors but I have to hit commend c too see println