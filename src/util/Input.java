package util;

import java.util.Scanner;

public class Input {
    private Scanner input;

    public String getString(){
        return input.nextLine();
    }

    public Input (){
        input = new Scanner(System.in);
    }

    public boolean yesNo(){
        String userInput = getString();
        return (
                userInput.equalsIgnoreCase("y")
                        ||
                userInput.equalsIgnoreCase("yes"));
    }
//
    public int getInt(){
        try {
            int inputInt = input.nextInt();
            return inputInt;
        } catch (Exception e){
            System.out.println("Enter a valid integer: ");
            input.nextLine();
            return getInt();
        }
    }

    public int getInt(int min, int max){
        System.out.println("Please input a number between " + min + " and " + max);
        int userInt = getInt();
        if (userInt > max || userInt < min){
            return getInt();
        } else {
            return userInt;
        }
    }

    public double getDouble(){
        try {
            double userInput = input.nextDouble();
            return userInput;
        } catch (Exception e) {
            System.out.println("Enter a valid double: ");
            input.nextLine();
            return getDouble();
        }
    }

    public double getDouble(double min, double max){
        System.out.println("Please input a number between " + min + " and " + max);
        double userInput = getDouble();
        if (userInput < min || userInput > max){
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }



}
