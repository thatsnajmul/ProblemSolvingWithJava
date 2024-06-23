
package conditionalstatement;

import java.util.Scanner;

public class PositiveOrNegitiveNumber {
    
    //1---Get a number from the user and print whether it is positive or negative numbers

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int in= input.nextInt();
        
        
        if (in>0) {
            System.out.println("number is positive");
        } 
        else if (in<0) {
            System.out.println("number is negitive");
        }
        else{
            System.out.println("number is zero");
        }
        
        
        
        
    }
    
}
