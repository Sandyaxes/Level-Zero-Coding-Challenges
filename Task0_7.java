public class Task0_7 {
    
    public static float degreesToFahren (float degrees){
            
        float fahrenheit = (float)((degrees * 1.8) + 32);
        return fahrenheit;
           
    }
    
    public static float FahrenToDegrees (float fahrenheit){
            
        float degrees = (float)((fahrenheit - 32) / 1.8);
        return degrees;
           
    }
    
    public static void main(String args[]) {
        
       System.out.println(degreesToFahren(0) + " Fahrenheit");
       System.out.println(FahrenToDegrees(32) + " degrees celcious");


    }
}