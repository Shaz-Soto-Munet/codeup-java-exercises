import java.util.Random;

public class ServerNameGenerator {

    static String[] nouns = {"table", "chair", "gun", "house", "desk", "computer", "fan", "mug", "person", "phone"};
    static String[] adjectives = {"red", "white", "blue", "pretty", "ugly", "extravagant", "atrocious", "fast", "slow", "smart"};

    static Random random = new Random();
    static int randomInt1to10 = random.nextInt(10) + 1;
    static int secondRandomInt1to10 = random.nextInt(10) + 1;

    public static void main(String[] args) {
        System.out.println("Here is your server name: " + adjectives[randomInt1to10-1] + "-" + nouns[secondRandomInt1to10-1]);



    }
}
