public class Task0_8 {

    static void numToHours(int inputNum){

        int hours = inputNum / 60;
        int minutes = inputNum % 60;

        if(inputNum / 60 == 1){
            if (inputNum % 60 == 1){
                System.out.println(hours +" hour, " + minutes + " minute");
            }else{
                System.out.println(hours +" hour, " + minutes + " minutes");
            }
        }else {
            if (inputNum % 60 == 1){
                System.out.println(hours +" hours, " + minutes + " minute");
            }
            else {
                System.out.println(hours +" hours, " + minutes + " minutes");
            }
        }
    }

    public static void main(String[] args) {

        numToHours(71);


    }
}
