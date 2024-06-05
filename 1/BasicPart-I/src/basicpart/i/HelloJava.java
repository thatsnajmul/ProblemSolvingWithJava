
package basicpart.i;

import java.util.Scanner;


public class HelloJava {
    
    public static void main(String[] args) {
            /*
            Write a Java program to print 'Hello' on screen and your name on a separate line.
            Expected Output :
            Hello
            Java
            */
            
            System.out.println("Hello "+ "\n"+
                    "Java");
            
            Scanner input = new Scanner(System.in);
            
            String h = "Hello";
            String b = "Java";
            
            System.out.println("Type Hello:");
            String hello = input.nextLine();
            System.out.println("Type Java:");
            String java = input.nextLine();
            
            
            
           
            
            
            
    }
    
}
