public class Task0_5 {
    
       static int TriangleArea(int num1, int num2, int num3, String...args){
            
            int area = (num1 + num2 + num3) / 2;
            return area;
        
    }
    
    public static void main(String args[]) {
        
       System.out.println("Triangle area is " + TriangleArea(5,7,8) + "cm");


    }
}