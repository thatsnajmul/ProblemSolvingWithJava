
package basicpart.i;

public class AreaPerimeterofCircle {
    //11--Find the area and perimeter of a circle
    
    private static final double radius = 7.4;
    
    public static void main(String[] args) {
        
        double perimeter = 2 * Math.PI* radius;
        
        double area = Math.PI*radius*radius;
        
        System.out.println(perimeter);
        System.out.println(area);
        
    }
    
}
