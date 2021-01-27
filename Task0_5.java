import static java.lang.Math.sqrt;

public class Task0_5 {
    
       static double TriangleArea(int num1, int num2, int num3){
            
            double semiPerimeter = (num1 + num2 + num3) * 0.5;
            double area = sqrt(semiPerimeter * ((semiPerimeter - num1)*(semiPerimeter - num2)*(semiPerimeter - num3)));
            return area;
        
    }
    
    public static void main(String args[]) {
        
       System.out.println("Triangle area is " + TriangleArea(4,5,6) + " sq.units");


    }
}
