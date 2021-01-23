public class Task0_9 {

    static void printVowel(String name){

        char[] nameArr = new char[name.length()];

        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);    // Using charAt method to return specific index from a string name;

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                nameArr[i] = ch;

            }

        }
        System.out.println(nameArr);

    }

    public static void main(String[] args) {

        printVowel("SandIlE");


    }
}

