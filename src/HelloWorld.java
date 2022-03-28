import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        int myFavoriteNumber = 28;
        System.out.println("My favorite number is: " + myFavoriteNumber);

        String myString = "This is a string, bing bong!";
        System.out.println(myString);

        myString = "This is a new string, bing bawng!";
        System.out.println(myString);

//        myString = 3.14159;
//        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        System.out.println(Integer.MAX_VALUE);

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);
//            System.out.println("Enter your first name");
//            String userInput = sc.next();
//            System.out.println("Hello, " + userInput + "!");
    }
}

