
package basicpart.i;

import java.util.Scanner;


public class SumOfTwoNumbers {
    
    public static void main(String[] args) {
        //2--Print the sum of two numbers
        
        int a = 50;
        int b= 50;
        int sum = a+b;
        
        
        
        
        System.out.println(sum);
        
        
        System.out.println("Separate");
      sumOfTwoNum();  
       
    }
    
    public static void sumOfTwoNum(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your number 1:");
        int a = input.nextInt();
        
        System.out.println("Enter your number 2:");
        int b = input.nextInt();
        
        System.out.println(a+b);
        
        
    }
    
    
}
