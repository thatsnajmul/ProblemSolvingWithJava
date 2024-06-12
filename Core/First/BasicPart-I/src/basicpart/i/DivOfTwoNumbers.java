
package basicpart.i;

import java.util.Scanner;


public class DivOfTwoNumbers {

    
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
        a=10;
        b=50;
        
        c=b/a;
        
        
        System.out.println(c);
        
        
        divOfTwoNum();
        
        
        
    }
    
    public static void divOfTwoNum(){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your number 1:");
        int a = input.nextInt();
        
        System.out.println("Enter your number 2:");
        int b = input.nextInt();
        
        
        System.out.println(a/b);
        
        
        
        
    }
    
    
   

    
    
}
