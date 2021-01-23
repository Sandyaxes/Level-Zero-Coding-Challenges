public class Task0_8 {

    static void numToHours(int inputNum){

        int hours = inputNum / 60;
        int minutes = inputNum % 60;

        System.out.println(hours + " hour(s) ," + minutes + " minute(s)");
    }

    public static void main(String[] args) {

        numToHours(133);


    }
}