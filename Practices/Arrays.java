// define a class
public class Arrays{
    public static void main (String [ ] args){
        
        /*double [ ] myList= new double [10];
        
// initialize with input value
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter "+myList.length+" values:");
            for(int i=0; i<myList.length; i++){
                myList[i]=input.nextDouble();
            }
            
// initialize with random values   Math.random() has range [0,1)
            double total=0;
            for(int i=0; i<myList.length; i++){
                myList[i]=Math.random()*100;
                System.out.println(myList[i]+ " ");
                total += myList[i];
            }
            System.out.println("total is "+ total);
            
// displaying arrays
            for(int i=0; i<myList.length; i++){
            System.out.println(myList[i] + " ");
            }
            
// summing all elements
            double total =0;
            for (int i=0; i<myList.length; i++){
                total += myList[i];
            }
            */
// Finding the largest element
/*    double [ ] myList={6.5, 6.7, 8.2, 6.5, 8.2};
    double max =myList[0];
    int indexOfMax=0;
    int i=0;
    for (i=0; i<myList.length; i++){
        System.out.print(myList[i] + "  ");
        System.out.print(i + "  ");
        System.out.println();

        if(myList[i]>max){
            max=myList[i];
            indexOfMax=i;
    System.out.println("max element has a value "+ max);
    System.out.println("max element has index i= "+ i);
    System.out.println();
        }
    System.out.println("max ELEMENT has a value "+ max);
    System.out.println("max ELEMENT has index i= "+ i);
    System.out.println();
    }
    System.out.println("MAX ELEMENT has a value "+ max);
    System.out.println("MAX ELEMENT has index i= "+ i); 
    */
// try i=1
/////// /
 /*   double [] myList={11, 11, 8, 7, 11};
    double max=myList[0];
    int indexOfMax=0;
    for (int i=0; i<myList.length; i++){
        if(myList[i]>max){
            max=myList[i];
            indexOfMax=i;
        }
    }
    System.out.println("max is "+ max);
    System.out.println("index Of Max "+ indexOfMax);
    */
////////////    
//generate an array
/*
int [] myList=new int [10];
for (int i=1; i<myList.length; i++){
    myList[i-1]=i;
    System.out.print(i +" ");
    System.out.print(i-1+" ");
    System.out.print(myList[i-1]+ " ");
    System.out.print(myList[i]+ " ");
    
    System.out.println();
}

System.out.println();
System.out.println(); 
for (int i=0; i<myList.length;i++){
    myList[i]=i;
    System.out.print(myList[i]+ " ");
}
System.out.println();
*/

///////////
//shifting to the left
/*double [] myList={10, 9, 8, 7, 6,5};
    double temp=myList[0];
    for(int i=1; i<myList.length; i++ ){
        myList[i-1]=myList[i];
        System.out.print(myList[i-1] +" ");
    }
    myList[myList.length-1]=temp;
    System.out.print(myList[myList.length-1]); */
////////////
////simpplify
/*java.util.Scanner input= new java.util.Scanner(System.in);
String[]months={"Jan" ,"Feb", "March", "Apr","May"};
System.out.print("enter a month number (1 to 5): ");
int monthNumber=input.nextInt();
System.out.println("The month is "+months[monthNumber-1]);
*/
//////////
///// given A, B make D={1,4,2,5,3,6}
/*
int [ ] A={1,2,3,7,8,9};
int [ ] B={4,5,6,10,11,12};
int [ ] D= new int[A.length+B.length];
int j=0,k=0;
for (int i=0;i<D.length;i++){
    if(i%2==0){
        if(A.length>j){
            D[i]=A[j];
            j++;
        }
    }
    else {
        if(B.length>k){
            D[i]=B[k];
            k++;
        }
    }
        System.out.print(D[i]+ " ");
}
*/
////////
int []A={1,2,3,4,5,6};
int []B=new int[A.length];
int j=1;
int maxlength=A.length;
for(int i=0; i<A.length; i++) {
    B[maxlength-j]=A[i];
    j++;
    System.out.print(B[maxlength-j]+" ");
}
//System.out.print(B[maxlength-j]+" ");





    
// Finding the smallest index of the largest element
 /*   int [ ] myList={1, 5, 3, 4, 5, 5};
    double max = myList[0];
    int indexOfMax=0;
    for (int i=1; i<myList.length; i++){
        if(myList[i]>max){
            max=myList[i];
            indexOfMax=i;
            System.out.println("index is " + i);
        }
    }
///////////////// */
    }
}