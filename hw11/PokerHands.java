//////////
//Hsiao Chen Yeh
//HW#11-1 PokerHands
//////
import java.util.Scanner;
public class PokerHands{
    public static void main (String[] args){
        
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        Scanner input=new Scanner(System.in);   
        char yes=input.next();
        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
        char suitInput=input.next();
        if (suitInput=='c'||'d'||'h'||'s'){
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
            char faceInput=input.next();
        }
        else{
            System.out.println("You did not enter a valid response");
        }
     
    }
    public static void showOneHand(int hand[]){
        String suit []={"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
        String face []={
            "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
            String out="";
            for(int s=0;s<4;s++){
                out+=suit[s];
                for(int rank=0;rank<13;rank++)
                for(int card=0;card<5;card++)
                    if(hand[card]/13==s && hand[card]%13==rank)
                    out+=face[rank];
                    out+='\n';
            }
            System.out.println(out);
        }
    }
