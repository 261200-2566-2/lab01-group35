import java.util.Scanner;
public class Main{
    
public static void SortArray(int[] x ){
    for (int i = 0; i < x.length; i++)   
{  
        for (int j = i + 1; j < x.length; j++)   
    {  
        int tmp = 0;  
        if (x[i] > x[j]){  
            tmp = x[i];  
            x[i] = x[j];  
            x[j] = tmp;  
        }
    }
}}
    public static void main(String[] args) {
        Integer Num  ;
        
        Scanner sc = new Scanner(System.in) ;
       do{
        System.out.print("Enter Amount of Number(Non-Negative) : ");
        Num =sc.nextInt() ;
       }while(Num <0) ;
       int[] Result = new int[Num];
        System.out.println("Enter "+Num+" Integers:");
       for(int i= 0 ; i< Num;i++) {
            Result[i] = sc.nextInt() ;
       }
       SortArray(Result) ;
       System.out.println();
       System.out.println("Sorted Result");
        // System.out.print("[ ") ;
        for(int i = 0  ; i< Result.length ; i++){
            System.out.println(Result[i] + " ");
            }
        //  System.out.print(" ] ") ;
        sc.close(); ;
    }
}
