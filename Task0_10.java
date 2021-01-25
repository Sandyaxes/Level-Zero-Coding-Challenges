public class Task0_10 {

    static void commonChar(String input1, String input2){
       
        String Output;
        
        for (int i = 0; i < input1.length(); i++){
            
            for (int z = 0; z < input2.length(); z++){
                
                if (Character.toString(input1.charAt(i)).equalsIgnoreCase(Character.toString(input2.charAt(z)))){
                   
                    Output = Character.toString(input1.charAt(i));
                    
                    System.out.print(Output);
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        
        commonChar("house","computers");
    }
}

