public class Practice {

    //2. Create a public static method in main called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int num){
        int numberMinusTen = num - 10;
        return numberMinusTen;
    }
    //3. Create a public static method *average* that takes an array of integers and returns their average as a double.

        public static double average(int[] array){
            double total = 0;
            for (int number : array){
                total += number;
            }
            return total / array.length;
        }

    public static void main(String[] args) {
        

    //4. Create a class called Pet with two String instance variables, name and type.
    //5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
    //6. Create a PetDog class that inherits from Pet.
    //7. In PetDog, create a boolean instance variable, trained.
    //8. Write a constructor for PetDog that sets its name, type, and trained properties.
    //9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.



    }
}
