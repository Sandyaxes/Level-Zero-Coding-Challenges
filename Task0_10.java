public class Task0_10 {

    static void commonChar(String input1, String input2){
       
        String Output = "";
        String common = "";
        
        for (int i = 0; i < input1.length(); i++){
            
            for (int z = 0; z < input2.length(); z++){
                
                if (Character.toString(input1.charAt(i)).equalsIgnoreCase(Character.toString(input2.charAt(z)))){
                   
                     Output = Character.toString(input1.charAt(i));
            
                    common += "," + Output;
                    
                }
                
            }
            
        }
        common = common.substring(1, common.length());
        System.out.print("Common letters: " + common);
        
    }

    public static void main(String[] args) {
        
        commonChar("computers","house");
    }
}

