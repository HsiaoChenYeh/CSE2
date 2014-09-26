
//define a class
    public class Operators{
//add main method
        public static void main(String [] args){
            int intValue=10;
        //postfix: evaluate first then do math
        // so the output:10, New Value of intValue:11
            System.out.println(intValue ++);
        //prefix: do math then evaluate
        // so intValue is now 11 
        //output:12 and new value of intValue:12
            System.out.println(++ intValue);
        }
        
    }

