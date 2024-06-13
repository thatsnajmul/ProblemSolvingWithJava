
package basicpart.i;

import java.util.Scanner;

/**
 *
 * @author thatsnajmul
 */
public class SumMInsMultiplyDivMod {
    
    public static void main(String[] args) {
        //6--Print the sum, multiply, subtract, divide and remainder of two numbers
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        
        System.out.println("Enter your first number:");
        int num2 = input.nextInt();
        
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        
        
        Calculation();
        
    }
    
    public static void Calculation() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first number:");
        int numb1 = input.nextInt();
        
        System.out.println("Enter your first number:");
        int numb2 = input.nextInt();
        
        int sum = numb1+numb2;
        int mins = numb1-numb2;
        int multiply = numb1*numb2;
        int divide = numb1/numb2;
        int rnums = numb1%numb2;
        
        System.out.printf("sum = %d \n mins = %d \n multiply = %d \n divide = %d \n rnums = %d\n", sum,mins,multiply,divide,rnums);
        
        
        
    }
    
}
