
package basicpart.i;

import java.util.Scanner;

/**
 *
 * @author thatsnajmul
 */
public class PrintMultiplicationTable {
    
    
    //7--Print multiplication table of a number upto 10
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a a number:");
        
        int num = input.nextInt();
        
        
        for(int i =0; i<10; i++){
            System.out.println(num +"X" + (i+1)+ "=" + (num*(i+1)));
        }
    }
    
    
}
