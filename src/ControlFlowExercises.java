import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i<=15){
//            System.out.println(i);
//            i++;
//        }


//        int i = 2;
//        do {
//            System.out.println(i);
//            i = (int) Math.pow(i,2);
//        } while (i < 1000000);

//        for (int i=2; i<1000000; i = (int) Math.pow(i,2)){
//            System.out.println(i);
//        }

//        for (int i=1; i<=100; i++){
//            if (i%3==0 & i%5==0){
//                System.out.println("FizzBuzz");
//                continue;
//            } else if (i%3==0){
//                System.out.println("Fizz");
//                continue;
//            } else if (i%5==0){
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userInt = sc.nextInt();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i=1; i<=userInt; i++){
            int squared = (int) Math.pow(i,2);
            int cubed = (int) Math.pow(i,3);
            System.out.println(i + "      | " + squared + "       | " + cubed);
        }
        System.out.println("Do you wish to continue?");
        String userAnswer = sc.next();
        if (userAnswer.equals("yes")){
            System.out.println("Please enter a number between 0 and 100.");
            int userNumber = sc.nextInt();
            switch (userNumber) {
                case userNumber - 88 >= 0:
                    System.out.println("A");
                    break;
                case userNumber - 80 >= 0:
                    System.out.println("B");
                    break;
                default:
                    System.out.println("Ya dun goof'd");
            }

        } else {
            System.out.println("You chose not to continue.");
        }

    }
}
