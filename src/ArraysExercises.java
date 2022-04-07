import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] people = new Person[3];
        people[0] = new Person("Shaz");
        people[1] = new Person("Antonio");
        people[2] = new Person("José");

        for (Person person : people){
            System.out.println(person.getName());
        }

        System.out.println("The length of the people array is: " + (people.length));

//        Person[] newPeople = Person.addPerson(people, "Juan");

//        for (Person person : newPeople){
//            System.out.println(person.getName());
//        }






    }
}
