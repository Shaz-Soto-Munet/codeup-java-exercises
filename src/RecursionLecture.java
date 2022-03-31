public class RecursionLecture {
    public static void main(String[] args) {
//        printNumbers(1);
//        addNums(3);
    }

// TODO: use recursion to print out a given number up through 100

    public static void printNumbers(int num){
        if (num == 100){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printNumbers(num+1);
    }
//// TODO: use recursion to add all numbers up from 1 to a given number
//
//    public static int addNums(int num) {
//        int count = 1;
//        if (num == count){
//            System.out.println(count);
//            return count;
//        }
//        count += num;
//        return num + addNums(num-1);
//    }

}


