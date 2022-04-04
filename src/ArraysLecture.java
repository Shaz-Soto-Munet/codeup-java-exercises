import java.util.Arrays;



public class ArraysLecture {
    public static void main(String[] args) {
        //declared with the data type and the array brackets, followed by the variable name or reference
        int[] numbers;
        //the array is then assigned its length and individual elements
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 76;
        numbers[2] = 43;
        numbers[3] = 12;
        numbers[4] = -56;

        System.out.println(numbers[3]);
        Arrays.sort(numbers);
        System.out.println(numbers[3]);


        //array can also be created with the following syntax
        String[] synonymsOfWeird = {"strange", "bizarre", "uncanny", "odd", "peculiar", "uncommon"};
        System.out.println(synonymsOfWeird[2]);

        for (int i=0; i<numbers.length; i++){
            System.out.println("The number at index " +  i + " is " + numbers[i]);
        }

        //for loop alternate syntax
        for (String synonymOfWeird : synonymsOfWeird){
            System.out.println(synonymOfWeird);
        }

        byte[] oneToFive = new byte[5];
        oneToFive[0] = 1;
        oneToFive[1] = 2;
        oneToFive[2] = 3;
        oneToFive[3] = 4;
        oneToFive[4] = 5;

        for (byte number : oneToFive){
            System.out.println(number);
        }

//        -------------------------------------------------------





    }
}
