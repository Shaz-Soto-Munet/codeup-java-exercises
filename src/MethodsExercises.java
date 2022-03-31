import java.util.Scanner;

public class MethodsExercises {

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x*y;
    }

    public static int divide(int x, int y){
        return x/y;
    }

    public static int remainder(int x, int y){
        return x%y;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if (userNum <= max && userNum >= min){
            System.out.println(userNum + " is a great choice.");
            return userNum;
        } else if (userNum > 10) {
            System.out.println("Number too large. Please enter number between 1 and 10.");
             return getInteger(1, 10);
        } else if (userNum < 1) {
            System.out.println("Number too small. Please enter number between 1 and 10.");
            return getInteger(1, 10);
        }
        return getInteger(1, 10);
    }


    public static int calculateFactorial(int userNum){
        int total = 1;
        for (int i=1; i<=userNum; i++){
            total *= i;
        }
        return total;
    }
    public static void main(String[] args) {

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Your number is " + userInput + ". Do you want to continue? yes/no");
        Scanner sc = new Scanner(System.in);
        String doesTheUserContinue = sc.nextLine();
        if (doesTheUserContinue.equals("yes")){
            System.out.println(calculateFactorial(userInput));
        } else {
            System.out.println("You've chosen not to continue.");
        }

    }

}