
package basicpart.i;

import javax.sound.midi.Soundbank;


public class PrintCalculation {
    //4--Print the result of the specified operations
    public static void main(String[] args) {
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);
        
        
        System.out.println("Separate");
        pCal();
        
    }
    
    public static void pCal(){
        int a = -5+8*6;
        int b = (55+9)%9;
        int c = 20+-3*5/8;
        int d = 5+15/3*2-8%3;
        
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
    }
    
}
