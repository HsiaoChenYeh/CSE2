//////////
//Hsiao Chen Yeh
//hw02 Arithmetic Java Program
//
//  define a class
public class Arithmetic{
//  add main method
    public static void main(String[ ] args) {
//  state imput variables
        int nSocks=3;               //number of pair of socks
        double sockCost$=2.58;      //cost per pair of socks, $ is part of the variable name
        int nGlasses=6;             //number of drinking glasses
        double glassCost$=2.29;     //cost per glass
        int nEvelopes=1;            //number of boxes of envelopes
        double envelopeCost$=3.25;  //cost per box of envelopes
        double taxPercent=0.06;     //PA sales tax 6%
        
        
// State Output Variables
        double totalSockCost$, totalDrinkingGlassesCost$, totalEnvelopeCost$;
        double totalSockSalesTax$, totalDrinkingGlassesSalesTax$, totalEnvelopeSalesTax$;
        double totalCostOfPurchase$, totalSalesTax$, totalCostOfTransaction$;
        

//  Compute the values for each cost
//      sum of cost for each item before tax
        totalSockCost$= nSocks*sockCost$;
        totalDrinkingGlassesCost$= nGlasses*glassCost$;
        totalEnvelopeCost$= nEvelopes*envelopeCost$;
//      sales tax for same items brought
        totalSockSalesTax$=totalSockCost$*taxPercent;
        totalDrinkingGlassesSalesTax$=totalDrinkingGlassesCost$*taxPercent;
        totalEnvelopeSalesTax$=totalEnvelopeCost$*taxPercent;
//      total cost of purchase before tax + tatal tax= total cost of transaction
        totalCostOfPurchase$=totalSockCost$+totalDrinkingGlassesCost$+totalEnvelopeCost$;
        totalSalesTax$=totalSockSalesTax$+totalDrinkingGlassesSalesTax$+totalEnvelopeSalesTax$;
        totalCostOfTransaction$=totalCostOfPurchase$+totalSalesTax$;
// Fix decimal places
        int totalSockSalesTaxRounded$; 
        totalSockSalesTaxRounded$=(int)(totalSockSalesTax$*100);
        double totalSockSalesTaxRoundedd = totalSockSalesTaxRounded$; 
        // need to switch back to a double to get decimal places, cuz an interger/100 is still an interger
        int totalDrinkingGlassesSalesTaxRounded$;
        totalDrinkingGlassesSalesTaxRounded$=(int)(totalDrinkingGlassesSalesTax$*100);
        double totalDrinkingGlassesSalesTaxRoundedd=totalDrinkingGlassesSalesTaxRounded$;
        
        int totalEnvelopeSalesTaxRounded$;
        totalEnvelopeSalesTaxRounded$=(int)(totalEnvelopeSalesTax$*100);
        double totalEnvelopeSalesTaxRoundedd=totalEnvelopeSalesTaxRounded$;
        
        int totalSalesTaxRounded$=(int)(totalSalesTax$*100);
        double totalSalesTaxRoundedd=totalSalesTaxRounded$;
        
        int totalCostOfTransactionRounded$=(int)(totalCostOfTransaction$*100);
        double totalCostOfTransactionRoundedd=totalCostOfTransactionRounded$;
// Print out numbers you have stored in variables
        System.out.println("I bought " +nSocks +" pairs of socks and each pair cost "+ sockCost$+" dollars");
        System.out.println("And "+ nGlasses+ " drinking glasses, each glass cost "+ glassCost$+" dollars");
        System.out.println("And "+ nEvelopes+ " box of envelopes, each box cost "+ envelopeCost$+ " dollars");      
        System.out.println("PA sales tax is 6%");
//  Print out output data
        System.out.println("Total cost of socks before tax was "+totalSockCost$+" dollars, and its sales tax was "+totalSockSalesTaxRoundedd/100.0+ " dollars");
        System.out.println("Total cost of drinking glasses before tax was "+totalDrinkingGlassesCost$+" dollars, and its sales tax was "+totalDrinkingGlassesSalesTaxRoundedd/100.0+ " dollars");
        System.out.println("Total cost of envelopes before tax was "+ totalEnvelopeCost$+" dollars, and its sales tax was "+ totalEnvelopeSalesTaxRoundedd/100.0+ " dollars");
        System.out.println("In this grocery shopping,");
        System.out.println("Total Cost Of Purchase was "+totalCostOfPurchase$+" dollars");
        System.out.println("Total Sales Tax was "+totalSalesTaxRoundedd/100.0+" dollars");
        System.out.println("So I spent " +totalCostOfTransactionRoundedd/100.0+" dollars on this grocery shopping");
        
    }

}



