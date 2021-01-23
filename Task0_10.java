public class Task0_10 {

    static void commonVowel(String input1, String input2){

        char[] input1Arr = new char[input1.length()];
        char[] input2Arr = new char[input2.length()];

        for (int i = 0; i < input1.length(); i++) {

            char ch1 = input1.charAt(i); // Using charAt method to return specific index from a string input1;

            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {

                input1Arr[i] = ch1;
            }
        }

        for (int i = 0; i < input2.length(); i++) {

            char ch2 = input2.charAt(i);

            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') {

                input2Arr[i] = ch2;
            }

        }
            // iterating through input1Arr
        for (int i = 0; i < input1Arr.length; i++){
            // iterating through input2Arr
            for (int j = 0; j < input2Arr.length; j++){

                if (input1Arr[i] == input2Arr[j]){

                    System.out.println(input1Arr[i]);
                }
            }
        }


    }

    public static void main (String[] args) {

        commonVowel("Computer", "house");




    }
}
