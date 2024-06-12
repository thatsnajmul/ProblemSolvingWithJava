
package basicpart.i;

import java.util.Scanner;


public class HelloJava {
    
    public static void main(String[] args) {
            //1--Print hello and your name on a separate lines
            
            
            System.out.println("Hello "+ "\n"+
                    "Java");
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("Type Hello:");
            String hello = input.nextLine();
            System.out.println("Type Java:");
            String java = input.nextLine();
            
            
            
           System.out.println(hello+java);
           
           System.out.println(java+ " is "+"Fine");
            
            
            
    }
    
}
