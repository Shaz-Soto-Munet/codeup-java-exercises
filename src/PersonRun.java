class Person {
     private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name + "!");
    }
}

public class PersonRun {
    public static void main(String[] args) {
        Person shaz = new Person("Shaz");
        shaz.sayHello();

    }
}
