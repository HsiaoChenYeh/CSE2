// define a class
public class practice{
    public static void main (String [ ] args){
        int [] myList=new int [10];
        for (int i=1; i<myList.length; i++){
        myList[i-1]=i;
        }
        for(int i=0; i<myList.length; i++){
            System.out.print(myList[i]+ " ");
        }
        System.out.println();
/*        int a=5;
        int x[]={1,2,3,4,5};
        System.out.println(x[a]);
        
        int []A={1,2,3,4,5,6};
        int []B=new int[A.length];
        int j=1;
        int maxlength=A.length;
        for(int i=0; i<A.length; i++) {
            B[maxlength-j]=A[i];
            j++;
            System.out.print(B[maxlength-j]+" ");
        }
        
        int number=5432;
        int remainder=number%10;
        System.out.print(remainder +" ");
        System.out.print(number/10); */
///////////////
    /*    int [] A={4,7,25,-7,13,23,-16};
        for(int i=0; i<=A.length;i++){
            int result= A[i/2]*=2;
            System.out.print(i/2 +" ");
            System.out.print(A[i/2] +" ");
            System.out.print(A[i]+" ");
            System.out.println(result+" ");
        }
        System.out.println();
        
        for (int i=1;i<A.length;i++){
            A[i]=A[i%2]*5/2;
            System.out.print(A[i] +" ");
        }
        
       
    }
    public static int enigma(double x[], double y[],int z[]){
        double []temp;
        temp=x;
        temp[z[2]]=42.0;
        y=x;
        y[0]=2.34;
        return z[z[0]];
    }
    int x[]={1, 2, 4, 6};
    double [] u={3, 4, 5, 6, 7}, v={2, 4, 5};
    

    System.out.print(enigma(u,v,x)); */
 //   System.out.println(x);
   // System.out.println(u);
    //System.out.println(v);
}
}