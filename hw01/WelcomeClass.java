//////////////////////////////
//Hsiao Chen Yeh
//hw 01 Welcome Class Java Program
//
//  first compile the program
//      javac WelcomeClass.java
//  run the program
//      java WelcomeClass

//  define a class
public class WelcomeClass{
    
//  add main method
    public static void main(String[ ] args) {
        int i=9;
        do{
            if (i % 3!=0)
                System.out.print(i+ " ");
                i--;
        }while (i>=1);
       // System.out.println();
    }
      /*  while (i<=6){
            method1(i,2);
            i++;
            System.out.print(" i is" + i);

        }
    }
    public static void method1(int i, int num){
        for (int j=1; j<=i; j++){
            System.out.print( num + " ");
            num*=2;
            System.out.print(" j is" + j);
            System.out.print(" num is" + num);
        }
        System.out.println();
    }
             if ((i++) % 2== 0)
                System.out.println(i);
        int j=1;
        while(j<10)
            if ((++j) % 2 == 0)
                System.out.println(j);
       int j=0;
        for (i=1;i<6;j++){
            if (j>3){
                break;
            }
            System.out.println("i: " +i);
            System.out.println("j: " +j);
        }
    */
    
}