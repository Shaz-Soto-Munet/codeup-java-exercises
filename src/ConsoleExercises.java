import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

        Scanner sc = new Scanner(System.in);
//            System.out.println("Enter an integer");
//            int userInt = sc.nextInt();

//            System.out.println("Enter three words");
//            String userWord1 = sc.next();
//            String userWord2 = sc.next();
//            String userWord3 = sc.next();
//            System.out.println(userWord1);
//            System.out.println(userWord2);
//            System.out.println(userWord3);

//            System.out.println("Enter a sentence");
//            String userSentence = sc.nextLine();
//            System.out.println(userSentence);

        System.out.println("Enter the length and width of your room in feet, eg. 10 35");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = length*width;
        int perimeter = (length*2)+(width*2);
        System.out.printf("The area of your room is %d.", area);
        System.out.printf("The perimeter of your room is %d.", perimeter);


    }
}
