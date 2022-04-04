import java.util.Arrays;

class Person {
     private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, " + this.name + "!");
    }

    static Person[] addPerson(Person[] arrayOfPeople, String newPersonName){
        Person[] newPeople = new Person[arrayOfPeople.length+1];
        for (int i=0; i<arrayOfPeople.length; i++){
            newPeople[i] = arrayOfPeople[i];
        }
        newPeople[arrayOfPeople.length] = new Person(newPersonName);
        return newPeople;
    }


}

public class PersonRun {
    public static void main(String[] args) {
        Person shaz = new Person("Shaz");
        shaz.sayHello();

    }
}
